import com.jfrog.bintray.gradle.BintrayExtension.PackageConfig

plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
    jacoco
    `maven-publish`
    signing
    id("com.jfrog.bintray") version "1.8.5"
}

group = "me.sargunvohra.lib"
version = "2.4.0"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8", "1.5.21"))
    api("com.squareup.retrofit2:retrofit:2.9.0")
    api("com.squareup.retrofit2:converter-gson:2.9.0")
    api("com.squareup.retrofit2:adapter-rxjava:2.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2-native-mt")
    implementation("io.arrow-kt:arrow-core:0.13.2")

    testImplementation(kotlin("test", "1.5.21"))
    testImplementation(kotlin("test-junit", "1.5.21"))
    testImplementation(kotlin("reflect", "1.5.21"))
    testImplementation("junit:junit:4.13.2")
    testImplementation("com.squareup.okhttp3:mockwebserver:3.14.9")
}

java {
    withSourcesJar()
    withJavadocJar()
}

jacoco {
    toolVersion = "0.8.7"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

tasks.test {
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    reports {
        xml.isEnabled = true
        csv.isEnabled = true
        html.isEnabled = true
    }
}

publishing {
    repositories {
        mavenLocal()
        maven {
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/pokeapi/pokekotlin")
            credentials {
                username = project.findProperty("gpr.user") as String?
                    ?: System.getenv("GITHUB_USER")
                password = project.findProperty("gpr.key") as String?
                    ?: System.getenv("GITHUB_KEY")
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name.set("PokeKotlin")
                description.set("A Kotlin (or Java, Scala, etc) client for PokeAPI.")
                url.set("https://github.com/PokeAPI/pokekotlin/wiki")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("sargunv")
                        name.set("Sargun Vohra")
                        email.set("sargun.vohra@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/PokeAPI/pokekotlin.git")
                    developerConnection.set("scm:git:git://github.com/PokeAPI/pokekotlin.git")
                    url.set("https://github.com/PokeAPI/pokekotlin")
                }
            }
        }
    }
}

signing {
    val signingKey: String? = project.findProperty("signing.key") as String?
        ?: System.getenv("SIGNING_KEY")
    val signingPassword: String? = project.findProperty("signing.password") as String?
        ?: System.getenv("SIGNING_PASSWORD")
    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publishing.publications["maven"])
}

bintray {
    user = project.findProperty("bintray.user") as String?
        ?: System.getenv("BINTRAY_USER")
    key = project.findProperty("bintray.key") as String?
        ?: System.getenv("BINTRAY_KEY")
    setPublications("maven")
    publish = true
    pkg(
        delegateClosureOf<PackageConfig> {
            repo = "maven"
            name = "pokekotlin"
        }
    )
}

tasks.publish {
    dependsOn(tasks.bintrayUpload)
}
