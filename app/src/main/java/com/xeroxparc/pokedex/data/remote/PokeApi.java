package com.xeroxparc.pokedex.data.remote;

import androidx.annotation.NonNull;

import com.xeroxparc.pokedex.data.model.berry.Berry;
import com.xeroxparc.pokedex.data.model.berry.firmness.BerryFirmness;
import com.xeroxparc.pokedex.data.model.berry.flavor.BerryFlavor;
import com.xeroxparc.pokedex.data.model.contest.effect.ContestEffect;
import com.xeroxparc.pokedex.data.model.contest.supereffect.SuperContestEffect;
import com.xeroxparc.pokedex.data.model.contest.type.ContestType;
import com.xeroxparc.pokedex.data.model.encounter.condition.EncounterCondition;
import com.xeroxparc.pokedex.data.model.encounter.conditionvalue.EncounterConditionValue;
import com.xeroxparc.pokedex.data.model.encounter.method.EncounterMethod;
import com.xeroxparc.pokedex.data.model.evolution.chain.EvolutionChain;
import com.xeroxparc.pokedex.data.model.evolution.trigger.EvolutionTrigger;
import com.xeroxparc.pokedex.data.model.game.generation.Generation;
import com.xeroxparc.pokedex.data.model.game.pokedex.Pokedex;
import com.xeroxparc.pokedex.data.model.game.version.Version;
import com.xeroxparc.pokedex.data.model.game.versiongroup.VersionGroup;
import com.xeroxparc.pokedex.data.model.item.Item;
import com.xeroxparc.pokedex.data.model.item.attribute.ItemAttribute;
import com.xeroxparc.pokedex.data.model.item.category.ItemCategory;
import com.xeroxparc.pokedex.data.model.item.effect.ItemFlingEffect;
import com.xeroxparc.pokedex.data.model.item.pocket.ItemPocket;
import com.xeroxparc.pokedex.data.model.location.Location;
import com.xeroxparc.pokedex.data.model.location.area.LocationArea;
import com.xeroxparc.pokedex.data.model.location.palparckarea.PalParkArea;
import com.xeroxparc.pokedex.data.model.location.region.Region;
import com.xeroxparc.pokedex.data.model.machine.Machine;
import com.xeroxparc.pokedex.data.model.move.Move;
import com.xeroxparc.pokedex.data.model.move.ailment.MoveAilment;
import com.xeroxparc.pokedex.data.model.move.battlestyle.MoveBattleStyle;
import com.xeroxparc.pokedex.data.model.move.categoty.MoveCategory;
import com.xeroxparc.pokedex.data.model.move.damageclass.MoveDamageClass;
import com.xeroxparc.pokedex.data.model.move.learnmethod.MoveLearnMethod;
import com.xeroxparc.pokedex.data.model.move.target.MoveTarget;
import com.xeroxparc.pokedex.data.model.pokemon.Pokemon;
import com.xeroxparc.pokedex.data.model.pokemon.ability.Ability;
import com.xeroxparc.pokedex.data.model.pokemon.characteristic.Characteristic;
import com.xeroxparc.pokedex.data.model.pokemon.color.PokemonColor;
import com.xeroxparc.pokedex.data.model.pokemon.egggroup.EggGroup;
import com.xeroxparc.pokedex.data.model.pokemon.form.PokemonForm;
import com.xeroxparc.pokedex.data.model.pokemon.gender.Gender;
import com.xeroxparc.pokedex.data.model.pokemon.growthrate.GrowthRate;
import com.xeroxparc.pokedex.data.model.pokemon.habitat.PokemonHabitat;
import com.xeroxparc.pokedex.data.model.pokemon.nature.Nature;
import com.xeroxparc.pokedex.data.model.pokemon.pokeathlonstats.PokeathlonStat;
import com.xeroxparc.pokedex.data.model.pokemon.shape.PokemonShape;
import com.xeroxparc.pokedex.data.model.pokemon.species.PokemonSpecies;
import com.xeroxparc.pokedex.data.model.pokemon.stats.Stat;
import com.xeroxparc.pokedex.data.model.pokemon.type.Type;
import com.xeroxparc.pokedex.data.model.utility.language.Language;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Fabio Buracchi
 */
public interface PokeApi {

	@GET("berry/")
	Call<List<Berry>> getBerryList(@Query("limit") @NonNull Integer limit,
	                               @Query("offset") @NonNull Integer offset);

	@GET("berry/{id}")
	Call<Berry> getBerry(@Path("id") @NonNull Integer id);

	@GET("berry/{name}")
	Call<Berry> getBerry(@Path("name") @NonNull String name);

	@GET("berry-firmness/")
	Call<List<BerryFirmness>> getBerryFirmnessList(@Query("limit") @NonNull Integer limit,
	                                               @Query("offset") @NonNull Integer offset);

	@GET("berry-firmness/{id}")
	Call<BerryFirmness> getBerryFirmness(@Path("id") @NonNull Integer id);

	@GET("berry-firmness/{name}")
	Call<BerryFirmness> getBerryFirmness(@Path("name") @NonNull String name);

	@GET("berry-flavor/")
	Call<List<BerryFlavor>> getBerryFlavorList(@Query("limit") @NonNull Integer limit,
	                                           @Query("offset") @NonNull Integer offset);

	@GET("berry-flavor/{id}")
	Call<BerryFlavor> getBerryFlavor(@Path("id") @NonNull Integer id);

	@GET("berry-flavor/{name}")
	Call<BerryFlavor> getBerryFlavor(@Path("name") @NonNull String name);

	@GET("contest-type/")
	Call<List<ContestType>> getContestTypeList(@Query("limit") @NonNull Integer limit,
	                                           @Query("offset") @NonNull Integer offset);

	@GET("contest-type/{id}")
	Call<ContestType> getContestType(@Path("id") @NonNull Integer id);

	@GET("contest-type/{name}")
	Call<ContestType> getContestType(@Path("name") @NonNull String name);

	@GET("contest-effect/")
	Call<List<ContestEffect>> getContestEffectList(@Query("limit") @NonNull Integer limit,
	                                               @Query("offset") @NonNull Integer offset);

	@GET("contest-effect/{id}")
	Call<ContestEffect> getContestEffect(@Path("id") @NonNull Integer id);

	@GET("super-contest-effect/")
	Call<List<SuperContestEffect>> getSuperContestEffectList(@Query("limit") @NonNull Integer limit,
	                                                         @Query("offset") @NonNull Integer offset);

	@GET("super-contest-effect/{id}")
	Call<SuperContestEffect> getSuperContestEffect(@Path("id") @NonNull Integer id);

	@GET("encounter-method/")
	Call<List<EncounterMethod>> getEncounterMethodList(@Query("limit") @NonNull Integer limit,
	                                                   @Query("offset") @NonNull Integer offset);

	@GET("encounter-method/{id}")
	Call<EncounterMethod> getEncounterMethod(@Path("id") @NonNull Integer id);

	@GET("encounter-method/{name}")
	Call<EncounterMethod> getEncounterMethod(@Path("name") @NonNull String name);

	@GET("encounter-condition/")
	Call<List<EncounterCondition>> getEncounterConditionList(@Query("limit") @NonNull Integer limit,
	                                                         @Query("offset") @NonNull Integer offset);

	@GET("encounter-condition/{id}")
	Call<EncounterCondition> getEncounterCondition(@Path("id") @NonNull Integer id);

	@GET("encounter-condition/{name}")
	Call<EncounterCondition> getEncounterCondition(@Path("name") @NonNull String name);

	@GET("encounter-condition-value/")
	Call<List<EncounterConditionValue>>getEncounterConditionValueList(@Query("limit") @NonNull Integer limit,
	                                                                   @Query("offset") @NonNull Integer offset);

	@GET("encounter-condition-value/{id}")
	Call<EncounterConditionValue> getEncounterConditionValue(@Path("id") @NonNull Integer id);

	@GET("encounter-condition-value/{name}")
	Call<EncounterConditionValue> getEncounterConditionValue(@Path("name") @NonNull String name);

	@GET("evolution-chain/")
	Call<List<EvolutionChain>> getEvolutionChainList(@Query("limit") @NonNull Integer limit,
	                                                 @Query("offset") @NonNull Integer offset);

	@GET("evolution-chain/{id}")
	Call<EvolutionChain> getEvolutionChain(@Path("id") @NonNull Integer id);

	@GET("evolution-trigger/")
	Call<List<EvolutionTrigger>> getEvolutionTriggerList(@Query("limit") @NonNull Integer limit,
	                                                     @Query("offset") @NonNull Integer offset);

	@GET("evolution-trigger/{id}")
	Call<EvolutionTrigger> getEvolutionTrigger(@Path("id") @NonNull Integer id);

	@GET("evolution-trigger/{name}")
	Call<EvolutionTrigger> getEvolutionTrigger(@Path("name") @NonNull String name);

	@GET("generation/")
	Call<List<Generation>> getGenerationList(@Query("limit") @NonNull Integer limit,
	                                         @Query("offset") @NonNull Integer offset);

	@GET("generation/{id}")
	Call<Generation> getGeneration(@Path("id") @NonNull Integer id);

	@GET("generation/{name}")
	Call<Generation> getGeneration(@Path("name") @NonNull String name);

	@GET("pokedex/")
	Call<List<Pokedex>> getPokedexList(@Query("limit") @NonNull Integer limit,
	                                   @Query("offset") @NonNull Integer offset);

	@GET("pokedex/{id}")
	Call<Pokedex> getPokedex(@Path("id") @NonNull Integer id);

	@GET("pokedex/{name}")
	Call<Pokedex> getPokedex(@Path("name") @NonNull String name);

	@GET("version/")
	Call<List<Version>> getVersionList(@Query("limit") @NonNull Integer limit,
	                                   @Query("offset") @NonNull Integer offset);

	@GET("version/{id}")
	Call<Version> getVersion(@Path("id") @NonNull Integer id);

	@GET("version/{name}")
	Call<Version> getVersion(@Path("name") @NonNull String name);

	@GET("version-group/")
	Call<List<VersionGroup>> getVersionGroupList(@Query("limit") @NonNull Integer limit,
	                                             @Query("offset") @NonNull Integer offset);

	@GET("version-group/{id}")
	Call<VersionGroup> getVersionGroup(@Path("id") @NonNull Integer id);

	@GET("version-group/{name}")
	Call<VersionGroup> getVersionGroup(@Path("name") @NonNull String name);

	@GET("item/")
	Call<List<Item>> getItemList(@Query("limit") @NonNull Integer limit,
	                             @Query("offset") @NonNull Integer offset);

	@GET("item/{id}")
	Call<Item> getItem(@Path("id") @NonNull Integer id);

	@GET("item/{name}")
	Call<Item> getItem(@Path("name") @NonNull String name);

	@GET("item-attribute/")
	Call<List<ItemAttribute>> getItemAttributeList(@Query("limit") @NonNull Integer limit,
	                                               @Query("offset") @NonNull Integer offset);

	@GET("item-attribute/{id}")
	Call<ItemAttribute> getItemAttribute(@Path("id") @NonNull Integer id);

	@GET("item-attribute/{name}")
	Call<ItemAttribute> getItemAttribute(@Path("name") @NonNull String name);

	@GET("item-category/")
	Call<List<ItemCategory>> getItemCategoryList(@Query("limit") @NonNull Integer limit,
	                                             @Query("offset") @NonNull Integer offset);

	@GET("item-category/{id}")
	Call<ItemCategory> getItemCategory(@Path("id") @NonNull Integer id);

	@GET("item-category/{name}")
	Call<ItemCategory> getItemCategory(@Path("name") @NonNull String name);

	@GET("item-fling-effect/")
	Call<List<ItemFlingEffect>> getItemFlingEffectList(@Query("limit") @NonNull Integer limit,
	                                                   @Query("offset") @NonNull Integer offset);

	@GET("item-fling-effect/{id}")
	Call<ItemFlingEffect> getItemFlingEffect(@Path("id") @NonNull Integer id);

	@GET("item-fling-effect/{name}")
	Call<ItemFlingEffect> getItemFlingEffect(@Path("name") @NonNull String name);

	@GET("item-pocket/")
	Call<List<ItemPocket>> getItemPocketList(@Query("limit") @NonNull Integer limit,
	                                         @Query("offset") @NonNull Integer offset);

	@GET("item-pocket/{id}")
	Call<ItemPocket> getItemPocket(@Path("id") @NonNull Integer id);

	@GET("item-pocket/{name}")
	Call<ItemPocket> getItemPocket(@Path("name") @NonNull String name);

	@GET("location/")
	Call<List<Location>> getLocationList(@Query("limit") @NonNull Integer limit,
	                                     @Query("offset") @NonNull Integer offset);

	@GET("location/{id}")
	Call<Location> getLocation(@Path("id") @NonNull Integer id);

	@GET("location/{name}")
	Call<Location> getLocation(@Path("name") @NonNull String name);

	@GET("location-area/")
	Call<List<LocationArea>> getLocationAreaList(@Query("limit") @NonNull Integer limit,
	                                             @Query("offset") @NonNull Integer offset);

	@GET("location-area/{id}")
	Call<LocationArea> getLocationArea(@Path("id") @NonNull Integer id);

	@GET("location-area/{name}")
	Call<LocationArea> getLocationArea(@Path("name") @NonNull String name);

	@GET("pal-park-area/")
	Call<List<PalParkArea>> getPalParkAreaList(@Query("limit") @NonNull Integer limit,
	                                           @Query("offset") @NonNull Integer offset);

	@GET("pal-park-area/{id}")
	Call<PalParkArea> getPalParkArea(@Path("id") @NonNull Integer id);

	@GET("pal-park-area/{name}")
	Call<PalParkArea> getPalParkArea(@Path("name") @NonNull String name);

	@GET("region/")
	Call<List<Region>> getRegionList(@Query("limit") @NonNull Integer limit,
	                                 @Query("offset") @NonNull Integer offset);

	@GET("region/{id}")
	Call<Region> getRegion(@Path("id") @NonNull Integer id);

	@GET("region/{name}")
	Call<Region> getRegion(@Path("name") @NonNull String name);

	@GET("machine/")
	Call<List<Machine>> getMachineList(@Query("limit") @NonNull Integer limit,
	                                   @Query("offset") @NonNull Integer offset);

	@GET("machine/{id}")
	Call<Machine> getMachine(@Path("id") @NonNull Integer id);

	@GET("move/")
	Call<List<Move>> getMoveList(@Query("limit") @NonNull Integer limit,
	                             @Query("offset") @NonNull Integer offset);

	@GET("move/{id}")
	Call<Move> getMove(@Path("id") @NonNull Integer id);

	@GET("move/{name}")
	Call<Move> getMove(@Path("name") @NonNull String name);

	@GET("move-ailment/")
	Call<List<MoveAilment>> getMoveAilmentList(@Query("limit") @NonNull Integer limit,
	                                           @Query("offset") @NonNull Integer offset);

	@GET("move-ailment/{id}")
	Call<MoveAilment> getMoveAilment(@Path("id") @NonNull Integer id);

	@GET("move-ailment/{name}")
	Call<MoveAilment> getMoveAilment(@Path("name") @NonNull String name);

	@GET("move-battle-style/")
	Call<List<MoveBattleStyle>> getMoveBattleStyleList(@Query("limit") @NonNull Integer limit,
	                                                   @Query("offset") @NonNull Integer offset);

	@GET("move-battle-style/{id}")
	Call<MoveBattleStyle> getMoveBattleStyle(@Path("id") @NonNull Integer id);

	@GET("move-battle-style/{name}")
	Call<MoveBattleStyle> getMoveBattleStyle(@Path("name") @NonNull String name);

	@GET("move-category/")
	Call<List<MoveCategory>> getModelNameList(@Query("limit") @NonNull Integer limit,
	                                          @Query("offset") @NonNull Integer offset);

	@GET("move-category/{id}")
	Call<MoveCategory> getModelName(@Path("id") @NonNull Integer id);

	@GET("move-category/{name}")
	Call<MoveCategory> getModelName(@Path("name") @NonNull String name);

	@GET("move-damage-class/")
	Call<List<MoveDamageClass>> getMoveDamageClassList(@Query("limit") @NonNull Integer limit,
	                                                   @Query("offset") @NonNull Integer offset);

	@GET("move-damage-class/{id}")
	Call<MoveDamageClass> getMoveDamageClass(@Path("id") @NonNull Integer id);

	@GET("move-damage-class/{name}")
	Call<MoveDamageClass> getMoveDamageClass(@Path("name") @NonNull String name);

	@GET("move-learn-method/")
	Call<List<MoveLearnMethod>> getMoveLearnMethodList(@Query("limit") @NonNull Integer limit,
	                                                   @Query("offset") @NonNull Integer offset);

	@GET("move-learn-method/{id}")
	Call<MoveLearnMethod> getMoveLearnMethod(@Path("id") @NonNull Integer id);

	@GET("move-learn-method/{name}")
	Call<MoveLearnMethod> getMoveLearnMethod(@Path("name") @NonNull String name);

	@GET("move-target/")
	Call<List<MoveTarget>> getMoveTargetList(@Query("limit") @NonNull Integer limit,
	                                         @Query("offset") @NonNull Integer offset);

	@GET("move-target/{id}")
	Call<MoveTarget> getMoveTarget(@Path("id") @NonNull Integer id);

	@GET("move-target/{name}")
	Call<MoveTarget> getMoveTarget(@Path("name") @NonNull String name);

	@GET("ability/")
	Call<List<Ability>> getAbilityList(@Query("limit") @NonNull Integer limit,
	                                   @Query("offset") @NonNull Integer offset);

	@GET("ability/{id}")
	Call<Ability> getAbility(@Path("id") @NonNull Integer id);

	@GET("ability/{name}")
	Call<Ability> getAbility(@Path("name") @NonNull String name);

	@GET("characteristic/")
	Call<List<Characteristic>> getCharacteristicList(@Query("limit") @NonNull Integer limit,
	                                                 @Query("offset") @NonNull Integer offset);

	@GET("characteristic/{id}")
	Call<Characteristic> getCharacteristic(@Path("id") @NonNull Integer id);

	@GET("egg-group/")
	Call<List<EggGroup>> getEggGroupList(@Query("limit") @NonNull Integer limit,
	                                     @Query("offset") @NonNull Integer offset);

	@GET("egg-group/{id}")
	Call<EggGroup> getEggGroup(@Path("id") @NonNull Integer id);

	@GET("egg-group/{name}")
	Call<EggGroup> getEggGroup(@Path("name") @NonNull String name);

	@GET("gender/")
	Call<List<Gender>> getGenderList(@Query("limit") @NonNull Integer limit,
	                                 @Query("offset") @NonNull Integer offset);

	@GET("gender/{id}")
	Call<Gender> getGender(@Path("id") @NonNull Integer id);

	@GET("gender/{name}")
	Call<Gender> getGender(@Path("name") @NonNull String name);

	@GET("growth-rate/")
	Call<List<GrowthRate>> getGrowthRateList(@Query("limit") @NonNull Integer limit,
	                                         @Query("offset") @NonNull Integer offset);

	@GET("growth-rate/{id}")
	Call<GrowthRate> getGrowthRate(@Path("id") @NonNull Integer id);

	@GET("growth-rate/{name}")
	Call<GrowthRate> getGrowthRate(@Path("name") @NonNull String name);

	@GET("nature/")
	Call<List<Nature>> getNatureList(@Query("limit") @NonNull Integer limit,
	                                 @Query("offset") @NonNull Integer offset);

	@GET("nature/{id}")
	Call<Nature> getNature(@Path("id") @NonNull Integer id);

	@GET("nature/{name}")
	Call<Nature> getNature(@Path("name") @NonNull String name);

	@GET("pokeathlon-stat/")
	Call<List<PokeathlonStat>> getPokeathlonStatList(@Query("limit") @NonNull Integer limit,
	                                                 @Query("offset") @NonNull Integer offset);

	@GET("pokeathlon-stat/{id}")
	Call<PokeathlonStat> getPokeathlonStat(@Path("id") @NonNull Integer id);

	@GET("pokeathlon-stat/{name}")
	Call<PokeathlonStat> getPokeathlonStat(@Path("name") @NonNull String name);

	@GET("pokemon/")
	Call<List<Pokemon>> getPokemonList(@Query("limit") @NonNull Integer limit,
	                                   @Query("offset") @NonNull Integer offset);

	@GET("pokemon/{id}")
	Call<Pokemon> getPokemon(@Path("id") @NonNull Integer id);

	@GET("pokemon/{name}")
	Call<Pokemon> getPokemon(@Path("name") @NonNull String name);

	@GET("pokemon-color/")
	Call<List<PokemonColor>> getPokemonColorList(@Query("limit") @NonNull Integer limit,
	                                             @Query("offset") @NonNull Integer offset);

	@GET("pokemon-color/{id}")
	Call<PokemonColor> getPokemonColor(@Path("id") @NonNull Integer id);

	@GET("pokemon-color/{name}")
	Call<PokemonColor> getPokemonColor(@Path("name") @NonNull String name);

	@GET("pokemon-form/")
	Call<List<PokemonForm>> getPokemonFormList(@Query("limit") @NonNull Integer limit,
	                                           @Query("offset") @NonNull Integer offset);

	@GET("pokemon-form/{id}")
	Call<PokemonForm> getPokemonForm(@Path("id") @NonNull Integer id);

	@GET("pokemon-form/{name}")
	Call<PokemonForm> getPokemonForm(@Path("name") @NonNull String name);

	@GET("pokemon-habitat/")
	Call<List<PokemonHabitat>> getPokemonHabitatList(@Query("limit") @NonNull Integer limit,
	                                                 @Query("offset") @NonNull Integer offset);

	@GET("pokemon-habitat/{id}")
	Call<PokemonHabitat> getPokemonHabitat(@Path("id") @NonNull Integer id);

	@GET("pokemon-habitat/{name}")
	Call<PokemonHabitat> getPokemonHabitat(@Path("name") @NonNull String name);

	@GET("pokemon-shape/")
	Call<List<PokemonShape>> getPokemonShapeList(@Query("limit") @NonNull Integer limit,
	                                             @Query("offset") @NonNull Integer offset);

	@GET("pokemon-shape/{id}")
	Call<PokemonShape> getPokemonShape(@Path("id") @NonNull Integer id);

	@GET("pokemon-shape/{name}")
	Call<PokemonShape> getPokemonShape(@Path("name") @NonNull String name);

	@GET("pokemon-species/")
	Call<List<PokemonSpecies>> getPokemonSpeciesList(@Query("limit") @NonNull Integer limit,
	                                                 @Query("offset") @NonNull Integer offset);

	@GET("pokemon-species/{id}")
	Call<PokemonSpecies> getPokemonSpecies(@Path("id") @NonNull Integer id);

	@GET("pokemon-species/{name}")
	Call<PokemonSpecies> getPokemonSpecies(@Path("name") @NonNull String name);

	@GET("stat/")
	Call<List<Stat>> getStatList(@Query("limit") @NonNull Integer limit,
	                             @Query("offset") @NonNull Integer offset);

	@GET("stat/{id}")
	Call<Stat> getStat(@Path("id") @NonNull Integer id);

	@GET("stat/{name}")
	Call<Stat> getStat(@Path("name") @NonNull String name);

	@GET("type/")
	Call<List<Type>> getTypeList(@Query("limit") @NonNull Integer limit,
	                             @Query("offset") @NonNull Integer offset);

	@GET("type/{id}")
	Call<Type> getType(@Path("id") @NonNull Integer id);

	@GET("type/{name}")
	Call<Type> getType(@Path("name") @NonNull String name);

	@GET("language/")
	Call<List<Language>> getLanguageList(@Query("limit") @NonNull Integer limit,
	                                     @Query("offset") @NonNull Integer offset);

	@GET("language/{id}")
	Call<Language> getLanguage(@Path("id") @NonNull Integer id);

	@GET("language/{name}")
	Call<Language> getLanguage(@Path("name") @NonNull String name);

}