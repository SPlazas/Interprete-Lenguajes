package co.edu.javeriana.interpreter;

import co.edu.javeriana.turtle.Turtle;

public class DummyInterpreter3 extends Interpreter {

	@Override
	public void executeProgram(String program, Turtle turtle) {
		turtle.color(255,0,0,255);
		for (int i=0; i< 100; i++) {
			turtle.forward(5);
			turtle.right(10);
		}
	}

}
