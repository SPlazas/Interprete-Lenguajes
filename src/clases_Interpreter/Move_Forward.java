package clases_Interpreter;

import co.edu.javeriana.turtle.Turtle;

public class Move_Forward implements Evaluator{
	private Evaluator move;
	private Turtle turtle;
	
	public Move_Forward(Evaluator move, Turtle t) {
		super();
		this.move = move;
		turtle = t;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			turtle.forward(((Number) move.evaluate(t)).intValue());
		} catch (Exception e){
			System.out.println(e.toString());
			System.exit(0);
		}
		return null;
	}

}
