package me.sargunvohra.lib.pokekotlin.client

import arrow.core.Either
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
import me.sargunvohra.lib.pokekotlin.model.PokeApiError
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

interface KCPokeApi {

    suspend fun getBerryList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getBerryFirmnessList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getBerryFlavorList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getContestTypeList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getContestEffectList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, ApiResourceList>

    suspend fun getSuperContestEffectList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, ApiResourceList>

    suspend fun getEncounterMethodList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getEncounterConditionList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getEncounterConditionValueList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getEvolutionChainList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, ApiResourceList>

    suspend fun getEvolutionTriggerList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getGenerationList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getPokedexList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getVersionList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getVersionGroupList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getItemList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getItemAttributeList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getItemCategoryList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getItemFlingEffectList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getItemPocketList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getMoveList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getMoveAilmentList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getMoveBattleStyleList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getMoveCategoryList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getMoveDamageClassList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getMoveLearnMethodList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getMoveTargetList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getLocationList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getLocationAreaList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getPalParkAreaList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getRegionList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getMachineList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, ApiResourceList>

    suspend fun getAbilityList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getCharacteristicList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, ApiResourceList>

    suspend fun getEggGroupList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getGenderList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getGrowthRateList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getNatureList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getPokeathlonStatList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getPokemonList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getPokemonColorList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getPokemonFormList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getPokemonHabitatList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getPokemonShapeList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getPokemonSpeciesList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getStatList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getTypeList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getLanguageList(
        offset: Int,
        limit: Int
    ): Either<PokeApiError, NamedApiResourceList>

    suspend fun getBerry(
        id: Int
    ): Either<PokeApiError, Berry>

    suspend fun getBerryFirmness(
        id: Int
    ): Either<PokeApiError, BerryFirmness>

    suspend fun getBerryFlavor(
        id: Int
    ): Either<PokeApiError, BerryFlavor>

    suspend fun getContestType(
        id: Int
    ): Either<PokeApiError, ContestType>

    suspend fun getContestEffect(
        id: Int
    ): Either<PokeApiError, ContestEffect>

    suspend fun getSuperContestEffect(
        id: Int
    ): Either<PokeApiError, SuperContestEffect>

    suspend fun getEncounterMethod(
        id: Int
    ): Either<PokeApiError, EncounterMethod>

    suspend fun getEncounterCondition(
        id: Int
    ): Either<PokeApiError, EncounterCondition>

    suspend fun getEncounterConditionValue(
        id: Int
    ): Either<PokeApiError, EncounterConditionValue>

    suspend fun getEvolutionChain(
        id: Int
    ): Either<PokeApiError, EvolutionChain>

    suspend fun getEvolutionTrigger(
        id: Int
    ): Either<PokeApiError, EvolutionTrigger>

    suspend fun getGeneration(
        id: Int
    ): Either<PokeApiError, Generation>

    suspend fun getPokedex(
        id: Int
    ): Either<PokeApiError, Pokedex>

    suspend fun getVersion(
        id: Int
    ): Either<PokeApiError, Version>

    suspend fun getVersionGroup(
        id: Int
    ): Either<PokeApiError, VersionGroup>

    suspend fun getItem(
        id: Int
    ): Either<PokeApiError, Item>

    suspend fun getItemAttribute(
        id: Int
    ): Either<PokeApiError, ItemAttribute>

    suspend fun getItemCategory(
        id: Int
    ): Either<PokeApiError, ItemCategory>

    suspend fun getItemFlingEffect(
        id: Int
    ): Either<PokeApiError, ItemFlingEffect>

    suspend fun getItemPocket(
        id: Int
    ): Either<PokeApiError, ItemPocket>

    suspend fun getMove(
        id: Int
    ): Either<PokeApiError, Move>

    suspend fun getMoveAilment(
        id: Int
    ): Either<PokeApiError, MoveAilment>

    suspend fun getMoveBattleStyle(
        id: Int
    ): Either<PokeApiError, MoveBattleStyle>

    suspend fun getMoveCategory(
        id: Int
    ): Either<PokeApiError, MoveCategory>

    suspend fun getMoveDamageClass(
        id: Int
    ): Either<PokeApiError, MoveDamageClass>

    suspend fun getMoveLearnMethod(
        id: Int
    ): Either<PokeApiError, MoveLearnMethod>

    suspend fun getMoveTarget(
        id: Int
    ): Either<PokeApiError, MoveTarget>

    suspend fun getLocation(
        id: Int
    ): Either<PokeApiError, Location>

    suspend fun getLocationArea(
        id: Int
    ): Either<PokeApiError, LocationArea>

    suspend fun getPalParkArea(
        id: Int
    ): Either<PokeApiError, PalParkArea>

    suspend fun getRegion(
        id: Int
    ): Either<PokeApiError, Region>

    suspend fun getMachine(
        id: Int
    ): Either<PokeApiError, Machine>

    suspend fun getAbility(
        id: Int
    ): Either<PokeApiError, Ability>

    suspend fun getCharacteristic(
        id: Int
    ): Either<PokeApiError, Characteristic>

    suspend fun getEggGroup(
        id: Int
    ): Either<PokeApiError, EggGroup>

    suspend fun getGender(
        id: Int
    ): Either<PokeApiError, Gender>

    suspend fun getGrowthRate(
        id: Int
    ): Either<PokeApiError, GrowthRate>

    suspend fun getNature(
        id: Int
    ): Either<PokeApiError, Nature>

    suspend fun getPokeathlonStat(
        id: Int
    ): Either<PokeApiError, PokeathlonStat>

    suspend fun getPokemon(
        id: Int
    ): Either<PokeApiError, Pokemon>

    suspend fun getPokemonEncounterList(
        id: Int
    ): Either<PokeApiError, List<LocationAreaEncounter>>

    suspend fun getPokemonColor(
        id: Int
    ): Either<PokeApiError, PokemonColor>

    suspend fun getPokemonForm(
        id: Int
    ): Either<PokeApiError, PokemonForm>

    suspend fun getPokemonHabitat(
        id: Int
    ): Either<PokeApiError, PokemonHabitat>

    suspend fun getPokemonShape(
        id: Int
    ): Either<PokeApiError, PokemonShape>

    suspend fun getPokemonSpecies(
        id: Int
    ): Either<PokeApiError, PokemonSpecies>

    suspend fun getStat(
        id: Int
    ): Either<PokeApiError, Stat>

    suspend fun getType(
        id: Int
    ): Either<PokeApiError, Type>

    suspend fun getLanguage(
        id: Int
    ): Either<PokeApiError, Language>
}
