package lab.pokemons;

import ru.ifmo.se.pokemon.*;
import lab.moves.*;

public class Venonat extends Pokemon {
	public Venonat() {
		super();
		setStats(60, 55, 50, 40, 55, 45);
		setType(Type.BUG, Type.POISON);
		setMove(new ShadowPunch(), new ThunderWave(), new HydroPump());
	}

	public Venonat(java.lang.String name, int level) {
		super(name, level);
		setStats(60, 55, 50, 40, 55, 45);
		setType(Type.BUG, Type.POISON);
		setMove(new ShadowPunch(), new ThunderWave(), new HydroPump());
	}
}
