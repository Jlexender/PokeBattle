package ru.llexender.se.pokebattle.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.llexender.se.pokebattle.moves.*;

public class Ursaring extends Pokemon {
	public Ursaring() {
		super();
		setStats(90, 130, 75, 75, 75, 55);
		setType(Type.NORMAL);
		setMove(new ThunderShock(), new LightScreen(), new FuryAttack(), new SwordsDance());
	}

	public Ursaring(java.lang.String name, int level) {
		super(name, level);
		setStats(90, 130, 75, 75, 75, 55);
		setType(Type.NORMAL);
		setMove(new ThunderShock(), new LightScreen(), new FuryAttack(), new SwordsDance());
	}

	
} 
