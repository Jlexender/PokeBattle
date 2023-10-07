package lab.moves;

import ru.ifmo.se.pokemon.*;

public class HydroPump extends SpecialMove {
	public HydroPump() {
		super(Type.WATER, 110, 80);
	}
	
	protected java.lang.String describe() {
		return "attacks using Hydro Pump";
	}
}
