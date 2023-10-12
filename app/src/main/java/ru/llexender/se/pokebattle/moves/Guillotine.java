package ru.llexender.se.pokebattle.moves;

import ru.ifmo.se.pokemon.*;

public class Guillotine extends PhysicalMove {
	public Guillotine() {
		super(Type.NORMAL, 0, 30);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().chance(0.3);
		if (e.success()) {
			applyOppDamage(p, p.getHP());
		}
	}

	@Override
	protected java.lang.String describe() {
		return "damages using Guillotine";
	}
}
