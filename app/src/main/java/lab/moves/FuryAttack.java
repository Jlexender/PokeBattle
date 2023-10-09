package lab.moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class FuryAttack extends PhysicalMove {
	public FuryAttack() {
		super(Type.NORMAL, 30, 85, 1, 2);
	}

	protected java.lang.String describe() {
		return "damages using Fury Attack";
	}
}
