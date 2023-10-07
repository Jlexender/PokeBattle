package lab.pokemons;

import ru.ifmo.se.pokemon.*;
import lab.moves.*;

public class Staryu extends Pokemon {
	public Staryu() {
		super();
		setStats(30, 45, 55, 70, 55, 85);
		setType(Type.WATER);
		setMove(new ThunderShock(), new LightScreen(), new FuryAttack());
	}

	public Staryu(java.lang.String name, int level) {
		super(name, level);
		setStats(30, 45, 55, 70, 55, 85);
		setType(Type.WATER);
		setMove(new ThunderShock(), new LightScreen(), new FuryAttack());
	}
}
