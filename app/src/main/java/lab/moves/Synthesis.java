package lab.moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Synthesis extends StatusMove {
	public Synthesis() {
		super(Type.GRASS, 0, 100);
	}

	void ApplySelfEffects(Pokemon p) {
		// Amount varies with the weather
		// Double hp = new Double(p.getStat(Stat.HP)*Math.random());
		// Looks like it can't be implemented the way it is defined
		// So, let's make something a little bit interesting than "no effect"
		
		Effect e = new Effect().chance(0.7).stat(Stat.ATTACK, 1);
		p.addEffect(e);
	}
}
