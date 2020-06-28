package com.xeroxparc.pokedex.data.model.machine;

import com.google.gson.annotations.SerializedName;
import com.xeroxparc.pokedex.data.model.game.versiongroup.VersionGroup;
import com.xeroxparc.pokedex.data.model.item.Item;
import com.xeroxparc.pokedex.data.model.move.Move;
import com.xeroxparc.pokedex.data.model.utility.common.ApiResource;

/**
 * Machines are the representation of items that teach moves to Pokémon. They vary from version
 * to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
 *
 * @author Fabio Buracchi
 */
public class Machine extends ApiResource {

	// The TM or HM item that corresponds to this machine.
	@SerializedName("item")
	private Item item;

	// The move that is taught by this machine.
	@SerializedName("move")
	private Move move;

	// The version group that this machine applies to.
	@SerializedName("version_group")
	private VersionGroup versionGroup;

}
