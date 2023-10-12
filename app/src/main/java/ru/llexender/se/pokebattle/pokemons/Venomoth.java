package ru.llexender.se.pokebattle.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.llexender.se.pokebattle.moves.*;

public class Venomoth extends Venonat {
	public Venomoth() {
		super();
		setStats(70, 65, 60, 90, 75, 90);
		addMove(new Guillotine());
	}

	public Venomoth(java.lang.String name, int level) {
		super(name, level);
		setStats(70, 65, 60, 90, 75, 90);
		addMove(new Guillotine());
	}
}
