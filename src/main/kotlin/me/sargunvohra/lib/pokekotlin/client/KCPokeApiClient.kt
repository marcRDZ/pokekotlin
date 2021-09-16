package me.sargunvohra.lib.pokekotlin.client

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import me.sargunvohra.lib.pokekotlin.model.PokeFailure
import retrofit2.Response

class KCPokeApiClient(
    clientConfig: ClientConfig = ClientConfig()
) : KCPokeApi {

    private val service = KCPokeApiServiceImpl(clientConfig)

    private fun <T> Response<T>.result(): Either<PokeFailure, T> =
        takeIf { it.isSuccessful }?.let {
            it.body()?.right()
        } ?: run {
            PokeFailure(code(), message()).left()
        }

    // region ResourceList Lists

    // region Berries

    override suspend fun getBerryList(offset: Int, limit: Int) =
        service.getBerryList(offset, limit).result()

    override suspend fun getBerryFirmnessList(offset: Int, limit: Int) =
        service.getBerryFirmnessList(offset, limit).result()

    override suspend fun getBerryFlavorList(offset: Int, limit: Int) =
        service.getBerryFlavorList(offset, limit).result()

    // endregion Berries

    // region Contests

    override suspend fun getContestTypeList(offset: Int, limit: Int) =
        service.getContestTypeList(offset, limit).result()

    override suspend fun getContestEffectList(offset: Int, limit: Int) =
        service.getContestEffectList(offset, limit).result()

    override suspend fun getSuperContestEffectList(offset: Int, limit: Int) =
        service.getSuperContestEffectList(offset, limit).result()

    // endregion Contests

    // region Encounters

    override suspend fun getEncounterMethodList(offset: Int, limit: Int) =
        service.getEncounterMethodList(offset, limit).result()

    override suspend fun getEncounterConditionList(offset: Int, limit: Int) =
        service.getEncounterConditionList(offset, limit).result()

    override suspend fun getEncounterConditionValueList(offset: Int, limit: Int) =
        service.getEncounterConditionValueList(offset, limit).result()

    // endregion

    // region Evolution

    override suspend fun getEvolutionChainList(offset: Int, limit: Int) =
        service.getEvolutionChainList(offset, limit).result()

    override suspend fun getEvolutionTriggerList(offset: Int, limit: Int) =
        service.getEvolutionTriggerList(offset, limit).result()

    // endregion

    //region Games

    override suspend fun getGenerationList(offset: Int, limit: Int) =
        service.getGenerationList(offset, limit).result()

    override suspend fun getPokedexList(offset: Int, limit: Int) =
        service.getPokedexList(offset, limit).result()

    override suspend fun getVersionList(offset: Int, limit: Int) =
        service.getVersionList(offset, limit).result()

    override suspend fun getVersionGroupList(offset: Int, limit: Int) =
        service.getVersionGroupList(offset, limit).result()

    // endregion

    // region Items

    override suspend fun getItemList(offset: Int, limit: Int) = service.getItemList(offset, limit).result()

    override suspend fun getItemAttributeList(offset: Int, limit: Int) =
        service.getItemAttributeList(offset, limit).result()

    override suspend fun getItemCategoryList(offset: Int, limit: Int) =
        service.getItemCategoryList(offset, limit).result()

    override suspend fun getItemFlingEffectList(offset: Int, limit: Int) =
        service.getItemFlingEffectList(offset, limit).result()

    override suspend fun getItemPocketList(offset: Int, limit: Int) =
        service.getItemPocketList(offset, limit).result()

    // endregion

    //region Moves

    override suspend fun getMoveList(offset: Int, limit: Int) = service.getMoveList(offset, limit).result()

    override suspend fun getMoveAilmentList(offset: Int, limit: Int) =
        service.getMoveAilmentList(offset, limit).result()

    override suspend fun getMoveBattleStyleList(offset: Int, limit: Int) =
        service.getMoveBattleStyleList(offset, limit).result()

    override suspend fun getMoveCategoryList(offset: Int, limit: Int) =
        service.getMoveCategoryList(offset, limit).result()

    override suspend fun getMoveDamageClassList(offset: Int, limit: Int) =
        service.getMoveDamageClassList(offset, limit).result()

    override suspend fun getMoveLearnMethodList(offset: Int, limit: Int) =
        service.getMoveLearnMethodList(offset, limit).result()

    override suspend fun getMoveTargetList(offset: Int, limit: Int) =
        service.getMoveTargetList(offset, limit).result()

    // endregion

    // region Locations

    override suspend fun getLocationList(offset: Int, limit: Int) =
        service.getLocationList(offset, limit).result()

    override suspend fun getLocationAreaList(offset: Int, limit: Int) =
        service.getLocationAreaList(offset, limit).result()

    override suspend fun getPalParkAreaList(offset: Int, limit: Int) =
        service.getPalParkAreaList(offset, limit).result()

    override suspend fun getRegionList(offset: Int, limit: Int) =
        service.getRegionList(offset, limit).result()

    // endregion

    // region Machines

    override suspend fun getMachineList(offset: Int, limit: Int) =
        service.getMachineList(offset, limit).result()

    // endregion Machines

    // region Pokemon

    override suspend fun getAbilityList(offset: Int, limit: Int) =
        service.getAbilityList(offset, limit).result()

    override suspend fun getCharacteristicList(offset: Int, limit: Int) =
        service.getCharacteristicList(offset, limit).result()

    override suspend fun getEggGroupList(offset: Int, limit: Int) =
        service.getEggGroupList(offset, limit).result()

    override suspend fun getGenderList(offset: Int, limit: Int) =
        service.getGenderList(offset, limit).result()

    override suspend fun getGrowthRateList(offset: Int, limit: Int) =
        service.getGrowthRateList(offset, limit).result()

    override suspend fun getNatureList(offset: Int, limit: Int) =
        service.getNatureList(offset, limit).result()

    override suspend fun getPokeathlonStatList(offset: Int, limit: Int) =
        service.getPokeathlonStatList(offset, limit).result()

    override suspend fun getPokemonList(offset: Int, limit: Int) =
        service.getPokemonList(offset, limit).result()

    override suspend fun getPokemonColorList(offset: Int, limit: Int) =
        service.getPokemonColorList(offset, limit).result()

    override suspend fun getPokemonFormList(offset: Int, limit: Int) =
        service.getPokemonFormList(offset, limit).result()

    override suspend fun getPokemonHabitatList(offset: Int, limit: Int) =
        service.getPokemonHabitatList(offset, limit).result()

    override suspend fun getPokemonShapeList(offset: Int, limit: Int) =
        service.getPokemonShapeList(offset, limit).result()

    override suspend fun getPokemonSpeciesList(offset: Int, limit: Int) =
        service.getPokemonSpeciesList(offset, limit).result()

    override suspend fun getStatList(offset: Int, limit: Int) = service.getStatList(offset, limit).result()

    override suspend fun getTypeList(offset: Int, limit: Int) = service.getTypeList(offset, limit).result()

    // endregion

    // region Utility

    override suspend fun getLanguageList(offset: Int, limit: Int) =
        service.getLanguageList(offset, limit).result()

    // endregion

    // endregion

    // region Berries

    override suspend fun getBerry(id: Int) = service.getBerry(id).result()

    override suspend fun getBerryFirmness(id: Int) = service.getBerryFirmness(id).result()

    override suspend fun getBerryFlavor(id: Int) = service.getBerryFlavor(id).result()

    // endregion Berries

    // region Contests

    override suspend fun getContestType(id: Int) = service.getContestType(id).result()

    override suspend fun getContestEffect(id: Int) = service.getContestEffect(id).result()

    override suspend fun getSuperContestEffect(id: Int) = service.getSuperContestEffect(id).result()

    // endregion Contests

    // region Encounters

    override suspend fun getEncounterMethod(id: Int) = service.getEncounterMethod(id).result()

    override suspend fun getEncounterCondition(id: Int) = service.getEncounterCondition(id).result()

    override suspend fun getEncounterConditionValue(id: Int) =
        service.getEncounterConditionValue(id).result()

    // endregion Contests

    // region Evolution

    override suspend fun getEvolutionChain(id: Int) = service.getEvolutionChain(id).result()

    override suspend fun getEvolutionTrigger(id: Int) = service.getEvolutionTrigger(id).result()

    // endregion Evolution

    // region Games

    override suspend fun getGeneration(id: Int) = service.getGeneration(id).result()

    override suspend fun getPokedex(id: Int) = service.getPokedex(id).result()

    override suspend fun getVersion(id: Int) = service.getVersion(id).result()

    override suspend fun getVersionGroup(id: Int) = service.getVersionGroup(id).result()

    // endregion Games

    // region Items

    override suspend fun getItem(id: Int) = service.getItem(id).result()

    override suspend fun getItemAttribute(id: Int) = service.getItemAttribute(id).result()

    override suspend fun getItemCategory(id: Int) = service.getItemCategory(id).result()

    override suspend fun getItemFlingEffect(id: Int) = service.getItemFlingEffect(id).result()

    override suspend fun getItemPocket(id: Int) = service.getItemPocket(id).result()

    // endregion Items

    // region Moves

    override suspend fun getMove(id: Int) = service.getMove(id).result()

    override suspend fun getMoveAilment(id: Int) = service.getMoveAilment(id).result()

    override suspend fun getMoveBattleStyle(id: Int) = service.getMoveBattleStyle(id).result()

    override suspend fun getMoveCategory(id: Int) = service.getMoveCategory(id).result()

    override suspend fun getMoveDamageClass(id: Int) = service.getMoveDamageClass(id).result()

    override suspend fun getMoveLearnMethod(id: Int) = service.getMoveLearnMethod(id).result()

    override suspend fun getMoveTarget(id: Int) = service.getMoveTarget(id).result()

    // endregion Moves

    // region Locations

    override suspend fun getLocation(id: Int) = service.getLocation(id).result()

    override suspend fun getLocationArea(id: Int) = service.getLocationArea(id).result()

    override suspend fun getPalParkArea(id: Int) = service.getPalParkArea(id).result()

    override suspend fun getRegion(id: Int) = service.getRegion(id).result()

    // endregion Locations

    // region Machines

    override suspend fun getMachine(id: Int) = service.getMachine(id).result()

    // endregion Machines

    // region Pokemon

    override suspend fun getAbility(id: Int) = service.getAbility(id).result()

    override suspend fun getCharacteristic(id: Int) = service.getCharacteristic(id).result()

    override suspend fun getEggGroup(id: Int) = service.getEggGroup(id).result()

    override suspend fun getGender(id: Int) = service.getGender(id).result()

    override suspend fun getGrowthRate(id: Int) = service.getGrowthRate(id).result()

    override suspend fun getNature(id: Int) = service.getNature(id).result()

    override suspend fun getPokeathlonStat(id: Int) = service.getPokeathlonStat(id).result()

    override suspend fun getPokemon(id: Int) = service.getPokemon(id).result()

    override suspend fun getPokemonEncounterList(id: Int) = service.getPokemonEncounterList(id).result()

    override suspend fun getPokemonColor(id: Int) = service.getPokemonColor(id).result()

    override suspend fun getPokemonForm(id: Int) = service.getPokemonForm(id).result()

    override suspend fun getPokemonHabitat(id: Int) = service.getPokemonHabitat(id).result()

    override suspend fun getPokemonShape(id: Int) = service.getPokemonShape(id).result()

    override suspend fun getPokemonSpecies(id: Int) = service.getPokemonSpecies(id).result()

    override suspend fun getStat(id: Int) = service.getStat(id).result()

    override suspend fun getType(id: Int) = service.getType(id).result()

    // endregion Pokemon

    // region Utility

    override suspend fun getLanguage(id: Int) = service.getLanguage(id).result()

    // endregion Utility
}
