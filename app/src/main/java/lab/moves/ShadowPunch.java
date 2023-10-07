package lab.moves;

import ru.ifmo.se.pokemon.*;

public class ShadowPunch extends PhysicalMove {
	public ShadowPunch() {
		super(Type.GHOST, 60, 100);
	}

	protected java.lang.String describe() {
		return "damages using Shadow Punch";
	}
}
