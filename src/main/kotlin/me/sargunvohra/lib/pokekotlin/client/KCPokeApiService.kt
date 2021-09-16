package me.sargunvohra.lib.pokekotlin.client

import me.sargunvohra.lib.pokekotlin.model.Ability
import me.sargunvohra.lib.pokekotlin.model.ApiResourceList
import me.sargunvohra.lib.pokekotlin.model.Berry
import me.sargunvohra.lib.pokekotlin.model.BerryFirmness
import me.sargunvohra.lib.pokekotlin.model.BerryFlavor
import me.sargunvohra.lib.pokekotlin.model.Characteristic
import me.sargunvohra.lib.pokekotlin.model.ContestEffect
import me.sargunvohra.lib.pokekotlin.model.ContestType
import me.sargunvohra.lib.pokekotlin.model.EggGroup
import me.sargunvohra.lib.pokekotlin.model.EncounterCondition
import me.sargunvohra.lib.pokekotlin.model.EncounterConditionValue
import me.sargunvohra.lib.pokekotlin.model.EncounterMethod
import me.sargunvohra.lib.pokekotlin.model.EvolutionChain
import me.sargunvohra.lib.pokekotlin.model.EvolutionTrigger
import me.sargunvohra.lib.pokekotlin.model.Gender
import me.sargunvohra.lib.pokekotlin.model.Generation
import me.sargunvohra.lib.pokekotlin.model.GrowthRate
import me.sargunvohra.lib.pokekotlin.model.Item
import me.sargunvohra.lib.pokekotlin.model.ItemAttribute
import me.sargunvohra.lib.pokekotlin.model.ItemCategory
import me.sargunvohra.lib.pokekotlin.model.ItemFlingEffect
import me.sargunvohra.lib.pokekotlin.model.ItemPocket
import me.sargunvohra.lib.pokekotlin.model.Language
import me.sargunvohra.lib.pokekotlin.model.Location
import me.sargunvohra.lib.pokekotlin.model.LocationArea
import me.sargunvohra.lib.pokekotlin.model.LocationAreaEncounter
import me.sargunvohra.lib.pokekotlin.model.Machine
import me.sargunvohra.lib.pokekotlin.model.Move
import me.sargunvohra.lib.pokekotlin.model.MoveAilment
import me.sargunvohra.lib.pokekotlin.model.MoveBattleStyle
import me.sargunvohra.lib.pokekotlin.model.MoveCategory
import me.sargunvohra.lib.pokekotlin.model.MoveDamageClass
import me.sargunvohra.lib.pokekotlin.model.MoveLearnMethod
import me.sargunvohra.lib.pokekotlin.model.MoveTarget
import me.sargunvohra.lib.pokekotlin.model.NamedApiResourceList
import me.sargunvohra.lib.pokekotlin.model.Nature
import me.sargunvohra.lib.pokekotlin.model.PalParkArea
import me.sargunvohra.lib.pokekotlin.model.PokeathlonStat
import me.sargunvohra.lib.pokekotlin.model.Pokedex
import me.sargunvohra.lib.pokekotlin.model.Pokemon
import me.sargunvohra.lib.pokekotlin.model.PokemonColor
import me.sargunvohra.lib.pokekotlin.model.PokemonForm
import me.sargunvohra.lib.pokekotlin.model.PokemonHabitat
import me.sargunvohra.lib.pokekotlin.model.PokemonShape
import me.sargunvohra.lib.pokekotlin.model.PokemonSpecies
import me.sargunvohra.lib.pokekotlin.model.Region
import me.sargunvohra.lib.pokekotlin.model.Stat
import me.sargunvohra.lib.pokekotlin.model.SuperContestEffect
import me.sargunvohra.lib.pokekotlin.model.Type
import me.sargunvohra.lib.pokekotlin.model.Version
import me.sargunvohra.lib.pokekotlin.model.VersionGroup
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface KCPokeApiService {

    // region Resource Lists

    // region Berries

    @GET("berry/")
    suspend fun getBerryList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("berry-firmness/")
    suspend fun getBerryFirmnessList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("berry-flavor/")
    suspend fun getBerryFlavorList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    // endregion Berries

    // region Contests

    @GET("contest-type/")
    suspend fun getContestTypeList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("contest-effect/")
    suspend fun getContestEffectList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<ApiResourceList>

    @GET("super-contest-effect/")
    suspend fun getSuperContestEffectList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<ApiResourceList>

    // endregion Contests

    // region Encounters

    @GET("encounter-method/")
    suspend fun getEncounterMethodList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("encounter-condition/")
    suspend fun getEncounterConditionList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("encounter-condition-value/")
    suspend fun getEncounterConditionValueList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    // endregion

    // region Evolution

    @GET("evolution-chain/")
    suspend fun getEvolutionChainList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<ApiResourceList>

    @GET("evolution-trigger/")
    suspend fun getEvolutionTriggerList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    // endregion

    //region Games

    @GET("generation/")
    suspend fun getGenerationList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("pokedex/")
    suspend fun getPokedexList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("version/")
    suspend fun getVersionList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("version-group/")
    suspend fun getVersionGroupList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    // endregion

    // region Items

    @GET("item/")
    suspend fun getItemList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("item-attribute/")
    suspend fun getItemAttributeList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("item-category/")
    suspend fun getItemCategoryList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("item-fling-effect/")
    suspend fun getItemFlingEffectList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("item-pocket/")
    suspend fun getItemPocketList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    // endregion

    //region Moves

    @GET("move/")
    suspend fun getMoveList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("move-ailment/")
    suspend fun getMoveAilmentList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("move-battle-style/")
    suspend fun getMoveBattleStyleList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("move-category/")
    suspend fun getMoveCategoryList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("move-damage-class/")
    suspend fun getMoveDamageClassList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("move-learn-method/")
    suspend fun getMoveLearnMethodList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("move-target/")
    suspend fun getMoveTargetList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    // endregion

    // region Locations

    @GET("location/")
    suspend fun getLocationList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("location-area/")
    suspend fun getLocationAreaList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("pal-park-area/")
    suspend fun getPalParkAreaList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("region/")
    suspend fun getRegionList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    // endregion

    // region Machines

    @GET("machine/")
    suspend fun getMachineList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<ApiResourceList>

    // endregion

    // region Pokemon

    @GET("ability/")
    suspend fun getAbilityList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("characteristic/")
    suspend fun getCharacteristicList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<ApiResourceList>

    @GET("egg-group/")
    suspend fun getEggGroupList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("gender/")
    suspend fun getGenderList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("growth-rate/")
    suspend fun getGrowthRateList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("nature/")
    suspend fun getNatureList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("pokeathlon-stat/")
    suspend fun getPokeathlonStatList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("pokemon/")
    suspend fun getPokemonList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("pokemon-color/")
    suspend fun getPokemonColorList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("pokemon-form/")
    suspend fun getPokemonFormList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("pokemon-habitat/")
    suspend fun getPokemonHabitatList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("pokemon-shape/")
    suspend fun getPokemonShapeList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("pokemon-species/")
    suspend fun getPokemonSpeciesList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("stat/")
    suspend fun getStatList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    @GET("type/")
    suspend fun getTypeList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    // endregion

    // region Utility

    @GET("language/")
    suspend fun getLanguageList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<NamedApiResourceList>

    // endregion

    // endregion

    // region Berries

    @GET("berry/{id}/")
    suspend fun getBerry(@Path("id") id: Int): Response<Berry>

    @GET("berry-firmness/{id}/")
    suspend fun getBerryFirmness(@Path("id") id: Int): Response<BerryFirmness>

    @GET("berry-flavor/{id}/")
    suspend fun getBerryFlavor(@Path("id") id: Int): Response<BerryFlavor>

    // endregion Berries

    // region Contests

    @GET("contest-type/{id}/")
    suspend fun getContestType(@Path("id") id: Int): Response<ContestType>

    @GET("contest-effect/{id}/")
    suspend fun getContestEffect(@Path("id") id: Int): Response<ContestEffect>

    @GET("super-contest-effect/{id}/")
    suspend fun getSuperContestEffect(@Path("id") id: Int): Response<SuperContestEffect>

    // endregion Contests

    // region Encounters

    @GET("encounter-method/{id}/")
    suspend fun getEncounterMethod(@Path("id") id: Int): Response<EncounterMethod>

    @GET("encounter-condition/{id}/")
    suspend fun getEncounterCondition(@Path("id") id: Int): Response<EncounterCondition>

    @GET("encounter-condition-value/{id}/")
    suspend fun getEncounterConditionValue(@Path("id") id: Int): Response<EncounterConditionValue>

    // endregion Contests

    // region Evolution

    @GET("evolution-chain/{id}/")
    suspend fun getEvolutionChain(@Path("id") id: Int): Response<EvolutionChain>

    @GET("evolution-trigger/{id}/")
    suspend fun getEvolutionTrigger(@Path("id") id: Int): Response<EvolutionTrigger>

    // endregion Evolution

    // region Games

    @GET("generation/{id}/")
    suspend fun getGeneration(@Path("id") id: Int): Response<Generation>

    @GET("pokedex/{id}/")
    suspend fun getPokedex(@Path("id") id: Int): Response<Pokedex>

    @GET("version/{id}/")
    suspend fun getVersion(@Path("id") id: Int): Response<Version>

    @GET("version-group/{id}/")
    suspend fun getVersionGroup(@Path("id") id: Int): Response<VersionGroup>

    // endregion Games

    // region Items

    @GET("item/{id}/")
    suspend fun getItem(@Path("id") id: Int): Response<Item>

    @GET("item-attribute/{id}/")
    suspend fun getItemAttribute(@Path("id") id: Int): Response<ItemAttribute>

    @GET("item-category/{id}/")
    suspend fun getItemCategory(@Path("id") id: Int): Response<ItemCategory>

    @GET("item-fling-effect/{id}/")
    suspend fun getItemFlingEffect(@Path("id") id: Int): Response<ItemFlingEffect>

    @GET("item-pocket/{id}/")
    suspend fun getItemPocket(@Path("id") id: Int): Response<ItemPocket>

    // endregion Items

    // region Moves

    @GET("move/{id}/")
    suspend fun getMove(@Path("id") id: Int): Response<Move>

    @GET("move-ailment/{id}/")
    suspend fun getMoveAilment(@Path("id") id: Int): Response<MoveAilment>

    @GET("move-battle-style/{id}/")
    suspend fun getMoveBattleStyle(@Path("id") id: Int): Response<MoveBattleStyle>

    @GET("move-category/{id}/")
    suspend fun getMoveCategory(@Path("id") id: Int): Response<MoveCategory>

    @GET("move-damage-class/{id}/")
    suspend fun getMoveDamageClass(@Path("id") id: Int): Response<MoveDamageClass>

    @GET("move-learn-method/{id}/")
    suspend fun getMoveLearnMethod(@Path("id") id: Int): Response<MoveLearnMethod>

    @GET("move-target/{id}/")
    suspend fun getMoveTarget(@Path("id") id: Int): Response<MoveTarget>

    // endregion Moves

    // region Locations

    @GET("location/{id}/")
    suspend fun getLocation(@Path("id") id: Int): Response<Location>

    @GET("location-area/{id}/")
    suspend fun getLocationArea(@Path("id") id: Int): Response<LocationArea>

    @GET("pal-park-area/{id}/")
    suspend fun getPalParkArea(@Path("id") id: Int): Response<PalParkArea>

    @GET("region/{id}/")
    suspend fun getRegion(@Path("id") id: Int): Response<Region>

    // endregion Locations

    // region Machines

    @GET("machine/{id}/")
    suspend fun getMachine(@Path("id") id: Int): Response<Machine>

    // endregion

    // region Pokemon

    @GET("ability/{id}/")
    suspend fun getAbility(@Path("id") id: Int): Response<Ability>

    @GET("characteristic/{id}/")
    suspend fun getCharacteristic(@Path("id") id: Int): Response<Characteristic>

    @GET("egg-group/{id}/")
    suspend fun getEggGroup(@Path("id") id: Int): Response<EggGroup>

    @GET("gender/{id}/")
    suspend fun getGender(@Path("id") id: Int): Response<Gender>

    @GET("growth-rate/{id}/")
    suspend fun getGrowthRate(@Path("id") id: Int): Response<GrowthRate>

    @GET("nature/{id}/")
    suspend fun getNature(@Path("id") id: Int): Response<Nature>

    @GET("pokeathlon-stat/{id}/")
    suspend fun getPokeathlonStat(@Path("id") id: Int): Response<PokeathlonStat>

    @GET("pokemon/{id}/")
    suspend fun getPokemon(@Path("id") id: Int): Response<Pokemon>

    @GET("pokemon/{id}/encounters/")
    suspend fun getPokemonEncounterList(@Path("id") id: Int): Response<List<LocationAreaEncounter>>

    @GET("pokemon-color/{id}/")
    suspend fun getPokemonColor(@Path("id") id: Int): Response<PokemonColor>

    @GET("pokemon-form/{id}/")
    suspend fun getPokemonForm(@Path("id") id: Int): Response<PokemonForm>

    @GET("pokemon-habitat/{id}/")
    suspend fun getPokemonHabitat(@Path("id") id: Int): Response<PokemonHabitat>

    @GET("pokemon-shape/{id}/")
    suspend fun getPokemonShape(@Path("id") id: Int): Response<PokemonShape>

    @GET("pokemon-species/{id}/")
    suspend fun getPokemonSpecies(@Path("id") id: Int): Response<PokemonSpecies>

    @GET("stat/{id}/")
    suspend fun getStat(@Path("id") id: Int): Response<Stat>

    @GET("type/{id}/")
    suspend fun getType(@Path("id") id: Int): Response<Type>

    // endregion Pokemon

    // region Utility

    @GET("language/{id}/")
    suspend fun getLanguage(@Path("id") id: Int): Response<Language>

    // endregion Utility
}
