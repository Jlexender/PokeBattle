package lab.pokemons;

import ru.ifmo.se.pokemon.*;
import lab.moves.*;

public class Ursaring extends Pokemon {
	public Ursaring() {
		super();
		setStats(90, 130, 75, 75, 75, 55);
		setType(Type.NORMAL);
		setMove(new ThunderShock());
	}

	public Ursaring(java.lang.String name, int level) {
		super(name, level);
		setStats(90, 130, 75, 75, 75, 55);
		setType(Type.NORMAL);
		setMove(new ThunderShock());
	}
} 
