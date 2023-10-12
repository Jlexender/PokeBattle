package ru.llexender.se.pokebattle.moves;

import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove {
	public Bite() {
		super(Type.DARK, 60, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().chance(0.3);
		// if the target has not yet moved - skipping this condition
		if (e.success()) {
			e.flinch(p);
		}
	}

	@Override
	protected java.lang.String describe() {
		return "damages using Bite";
	}
}
