package lab.moves;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
	public SwordsDance() {
		super(Type.NORMAL, 0, 100);
	}

	protected void applySelfEffects(Pokemon p) {
		Effect e = new Effect().stat(Stat.ATTACK, (int)p.getStat(Stat.ATTACK)+2);
		p.addEffect(e);
	}

	protected java.lang.String describe() {
		return "uses Swords Dance";
	}
}
