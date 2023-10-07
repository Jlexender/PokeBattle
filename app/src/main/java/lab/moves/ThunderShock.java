package lab.moves;

import ru.ifmo.se.pokemon.*;

public class ThunderShock extends SpecialMove {
	public ThunderShock() {
		super(Type.ELECTRIC, 40, 100);
	}

	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().chance(0.1);
		if (e.success()) {
			e.paralyze(p);
		}
	}

	protected java.lang.String describe() {
		return "attacks using Thunder Shock";
	}
}
