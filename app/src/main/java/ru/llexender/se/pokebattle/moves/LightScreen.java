package ru.llexender.se.pokebattle.moves;

import ru.ifmo.se.pokemon.*;

public class LightScreen extends StatusMove {
	public LightScreen() {
		super(Type.PSYCHIC, 0, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().turns(3);
		if (Stat.SPECIAL_ATTACK.isHidden()) {
			e = e.stat(Stat.SPECIAL_ATTACK, -3);
		}
		else {
			e = e.stat(Stat.SPECIAL_ATTACK, -2);
		}
		p.addEffect(e);
	}

	@Override
	protected java.lang.String describe() {
		return "uses Light Screen";
	}
}
