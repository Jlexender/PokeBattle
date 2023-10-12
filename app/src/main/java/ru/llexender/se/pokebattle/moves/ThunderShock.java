package ru.llexender.se.pokebattle.moves;

import ru.ifmo.se.pokemon.*;

public class ThunderShock extends SpecialMove {
	public ThunderShock() {
		super(Type.ELECTRIC, 40, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().chance(0.1);
		if (e.success()) {
			e.paralyze(p);
		}
	}

	@Override
	protected java.lang.String describe() {
		return "attacks using Thunder Shock";
	}
}
