package ru.llexender.se.pokebattle.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.llexender.se.pokebattle.moves.*;

public class Espeon extends Pokemon {
	public Espeon() {
		super();
		setStats(65, 65, 60, 130, 95, 110);
		setType(Type.PSYCHIC);
		setMove(new ThunderShock(), new LightScreen());
	}

	public Espeon(java.lang.String name, int level) {
		super(name, level);
		setStats(65, 65, 60, 130, 95, 110);
		setType(Type.PSYCHIC);
		setMove(new ThunderShock(), new LightScreen());
	}
}
