package com.xeroxparc.pokedex.data.model.pokemon.growthrate;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

import com.google.gson.annotations.SerializedName;
import com.xeroxparc.pokedex.data.model.pokemon.species.PokemonSpecies;
import com.xeroxparc.pokedex.data.model.utility.common.Description;
import com.xeroxparc.pokedex.data.model.utility.common.NamedApiResource;

import java.util.List;

/**
 * Growth rates are the speed with which Pokémon gain levels through experience.
 * Check out Bulbapedia for greater detail.
 *
 * @author Fabio Buracchi
 */
@Entity(tableName = "growth_rate")
public class GrowthRate extends NamedApiResource {

	// The formula used to calculate the rate at which the Pokémon species gains level.
	@ColumnInfo(name = "formula")
	@SerializedName("formula")
	private String formula;

	// The descriptions of this characteristic listed in different languages.
	@ColumnInfo(name = "descriptions_data")
	@SerializedName("descriptions")
	private List<Description> descriptionList;

	// A list of levels and the amount of experienced needed to atain them based on this growth rate.
	@ColumnInfo(name = "levels_data")
	@SerializedName("levels")
	private List<GrowthRateExperienceLevel> levelList;

	// A list of Pokémon species that gain levels at this growth rate.
	@ColumnInfo(name = "pokemon_species_data")
	@SerializedName("pokemon_species")
	private List<PokemonSpecies> pokemonSpeciesList;

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public List<Description> getDescriptionList() {
		return descriptionList;
	}

	public void setDescriptionList(List<Description> descriptionList) {
		this.descriptionList = descriptionList;
	}

	public List<GrowthRateExperienceLevel> getLevelList() {
		return levelList;
	}

	public void setLevelList(List<GrowthRateExperienceLevel> levelList) {
		this.levelList = levelList;
	}

	public List<PokemonSpecies> getPokemonSpeciesList() {
		return pokemonSpeciesList;
	}

	public void setPokemonSpeciesList(List<PokemonSpecies> pokemonSpeciesList) {
		this.pokemonSpeciesList = pokemonSpeciesList;
	}

}
