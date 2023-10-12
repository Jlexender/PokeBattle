package ru.llexender.se.pokebattle.moves;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
	public ThunderWave() {
		super(Type.ELECTRIC, 0, 90);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect();
		e.paralyze(p);
	}

	@Override
	protected java.lang.String describe() {
		return "uses Thunder Wave";
	}
}
