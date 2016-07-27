package co.edu.javeriana.interpreter;

import co.edu.javeriana.turtle.Turtle;

public class DummyInterpreter extends Interpreter {

	@Override
	public void executeProgram(String program, Turtle turtle) {
		turtle.color(255, 0, 0, 255);
		for (int i = 0; i < 8; i++) {
			turtle.forward(100);
			turtle.left(45);
		}

		turtle.color(128, 0, 255, 128);
		for (int i = 0; i < 8; i++) {
			turtle.forward(100);
			turtle.back(90);
			turtle.right(45);
		}
	}

}
