package me.sargunvohra.lib.pokekotlin.client

import arrow.core.Either
import me.sargunvohra.lib.pokekotlin.model.*

interface KCPokeApi {

    suspend fun getBerryList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getBerryFirmnessList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getBerryFlavorList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getContestTypeList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getContestEffectList(offset: Int, limit: Int): Either<PokeFailure, ApiResourceList>

    suspend fun getSuperContestEffectList(offset: Int, limit: Int): Either<PokeFailure, ApiResourceList>

    suspend fun getEncounterMethodList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getEncounterConditionList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getEncounterConditionValueList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getEvolutionChainList(offset: Int, limit: Int): Either<PokeFailure, ApiResourceList>

    suspend fun getEvolutionTriggerList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getGenerationList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getPokedexList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getVersionList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getVersionGroupList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getItemList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getItemAttributeList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getItemCategoryList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getItemFlingEffectList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getItemPocketList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getMoveList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getMoveAilmentList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getMoveBattleStyleList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getMoveCategoryList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getMoveDamageClassList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getMoveLearnMethodList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getMoveTargetList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getLocationList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getLocationAreaList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getPalParkAreaList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getRegionList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getMachineList(offset: Int, limit: Int): Either<PokeFailure, ApiResourceList>

    suspend fun getAbilityList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getCharacteristicList(offset: Int, limit: Int): Either<PokeFailure, ApiResourceList>

    suspend fun getEggGroupList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getGenderList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getGrowthRateList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getNatureList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getPokeathlonStatList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getPokemonList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getPokemonColorList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getPokemonFormList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getPokemonHabitatList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getPokemonShapeList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getPokemonSpeciesList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getStatList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getTypeList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getLanguageList(offset: Int, limit: Int): Either<PokeFailure, NamedApiResourceList>

    suspend fun getBerry(id: Int): Either<PokeFailure, Berry>

    suspend fun getBerryFirmness(id: Int): Either<PokeFailure, BerryFirmness>

    suspend fun getBerryFlavor(id: Int): Either<PokeFailure, BerryFlavor>

    suspend fun getContestType(id: Int): Either<PokeFailure, ContestType>

    suspend fun getContestEffect(id: Int): Either<PokeFailure, ContestEffect>

    suspend fun getSuperContestEffect(id: Int): Either<PokeFailure, SuperContestEffect>

    suspend fun getEncounterMethod(id: Int): Either<PokeFailure, EncounterMethod>

    suspend fun getEncounterCondition(id: Int): Either<PokeFailure, EncounterCondition>

    suspend fun getEncounterConditionValue(id: Int): Either<PokeFailure, EncounterConditionValue>

    suspend fun getEvolutionChain(id: Int): Either<PokeFailure, EvolutionChain>

    suspend fun getEvolutionTrigger(id: Int): Either<PokeFailure, EvolutionTrigger>

    suspend fun getGeneration(id: Int): Either<PokeFailure, Generation>

    suspend fun getPokedex(id: Int): Either<PokeFailure, Pokedex>

    suspend fun getVersion(id: Int): Either<PokeFailure, Version>

    suspend fun getVersionGroup(id: Int): Either<PokeFailure, VersionGroup>

    suspend fun getItem(id: Int): Either<PokeFailure, Item>

    suspend fun getItemAttribute(id: Int): Either<PokeFailure, ItemAttribute>

    suspend fun getItemCategory(id: Int): Either<PokeFailure, ItemCategory>

    suspend fun getItemFlingEffect(id: Int): Either<PokeFailure, ItemFlingEffect>

    suspend fun getItemPocket(id: Int): Either<PokeFailure, ItemPocket>

    suspend fun getMove(id: Int): Either<PokeFailure, Move>

    suspend fun getMoveAilment(id: Int): Either<PokeFailure, MoveAilment>

    suspend fun getMoveBattleStyle(id: Int): Either<PokeFailure, MoveBattleStyle>

    suspend fun getMoveCategory(id: Int): Either<PokeFailure, MoveCategory>

    suspend fun getMoveDamageClass(id: Int): Either<PokeFailure, MoveDamageClass>

    suspend fun getMoveLearnMethod(id: Int): Either<PokeFailure, MoveLearnMethod>

    suspend fun getMoveTarget(id: Int): Either<PokeFailure, MoveTarget>

    suspend fun getLocation(id: Int): Either<PokeFailure, Location>

    suspend fun getLocationArea(id: Int): Either<PokeFailure, LocationArea>

    suspend fun getPalParkArea(id: Int): Either<PokeFailure, PalParkArea>

    suspend fun getRegion(id: Int): Either<PokeFailure, Region>

    suspend fun getMachine(id: Int): Either<PokeFailure, Machine>

    suspend fun getAbility(id: Int): Either<PokeFailure, Ability>

    suspend fun getCharacteristic(id: Int): Either<PokeFailure, Characteristic>

    suspend fun getEggGroup(id: Int): Either<PokeFailure, EggGroup>

    suspend fun getGender(id: Int): Either<PokeFailure, Gender>

    suspend fun getGrowthRate(id: Int): Either<PokeFailure, GrowthRate>

    suspend fun getNature(id: Int): Either<PokeFailure, Nature>

    suspend fun getPokeathlonStat(id: Int): Either<PokeFailure, PokeathlonStat>

    suspend fun getPokemon(id: Int): Either<PokeFailure, Pokemon>

    suspend fun getPokemonEncounterList(id: Int): Either<PokeFailure, List<LocationAreaEncounter>>

    suspend fun getPokemonColor(id: Int): Either<PokeFailure, PokemonColor>

    suspend fun getPokemonForm(id: Int): Either<PokeFailure, PokemonForm>

    suspend fun getPokemonHabitat(id: Int): Either<PokeFailure, PokemonHabitat>

    suspend fun getPokemonShape(id: Int): Either<PokeFailure, PokemonShape>

    suspend fun getPokemonSpecies(id: Int): Either<PokeFailure, PokemonSpecies>

    suspend fun getStat(id: Int): Either<PokeFailure, Stat>

    suspend fun getType(id: Int): Either<PokeFailure, Type>

    suspend fun getLanguage(id: Int): Either<PokeFailure, Language>
}
