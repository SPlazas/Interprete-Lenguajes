package co.edu.javeriana.interpreter;

import co.edu.javeriana.turtle.Turtle;

public class DummyInterpreter2 extends Interpreter {

	@Override
	public void executeProgram(String program, Turtle turtle) {
		turtle.color(255,0,0,255);
		while(true) {
			int action = (int) (Math.random() * 5);
			if (action == 0) {
				turtle.forward((float) (Math.random() * 100));				
			} else if (action ==1) {
				turtle.right((float) (Math.random() * 180));
			} else if (action == 2) {
				turtle.left((float) (Math.random() * 180));
			} else if (action == 3) {
				turtle.back((float) (Math.random() * 100));				
			} else if (action == 4) {
				turtle.color((float)Math.random()*255,(float)Math.random()*255,(float)Math.random()*255,255);				
			}	
		}
	}

}
