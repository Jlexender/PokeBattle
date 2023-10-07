package lab.moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class FuryAttack extends PhysicalMove {
	public FuryAttack() {
		/* final double key = Math.random();
		switch (key) {
			case key < 0.375:
				super(Type.NORMAL, 30, 85, 1, 2);
				break;
			case key < 0.75:
				super(Type.NORMAL, 45, 85, 1, 3);
				break;
			case key < 0.875:
				super(Type.NORMAL, 60, 85, 1, 4);
				break;
			case key < 1:
				super(Type.NORMAL, 75, 85, 1, 5);	
				break; 
			} */
			super(Type.NORMAL, 30, 85, 1, 2);
	}

	protected java.lang.String describe() {
		return "damages using Fury Attack";
	}
}
