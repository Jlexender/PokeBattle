package lab.moves;

import ru.ifmo.se.pokemon.*;

public class Guillotine extends PhysicalMove {
	public Guillotine() {
		super(Type.NORMAL, 100, 30);
	}
	
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().chance(0.3);
		if (e.success()) {
			applyOppDamage(p, p.getHP());
		}
	}

	protected java.lang.String describe() {
		return "damages using Guillotine";
	}
}
