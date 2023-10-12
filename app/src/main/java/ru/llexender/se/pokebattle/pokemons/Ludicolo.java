package ru.llexender.se.pokebattle.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.llexender.se.pokebattle.moves.*;

public class Ludicolo extends Pokemon {
	public Ludicolo() {
		super();
		setStats(80, 70, 70, 90, 100, 70);
		setType(Type.WATER, Type.GRASS);
		setMove(new ShadowPunch(), new Bite(), new HydroPump(), new Synthesis());
	}

	public Ludicolo(java.lang.String name, int level) {
		super(name, level);
		setStats(80, 70, 70, 90, 100, 70);
		setType(Type.WATER, Type.GRASS);
		setMove(new ShadowPunch(), new Bite(), new HydroPump(), new Synthesis());
	}
}
