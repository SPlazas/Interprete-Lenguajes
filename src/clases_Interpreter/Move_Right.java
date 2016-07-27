package clases_Interpreter;

import co.edu.javeriana.turtle.Turtle;

public class Move_Right implements Evaluator{
	private Evaluator move;
	private Turtle turtle;
	
	public Move_Right(Evaluator move, Turtle turtl) {
		super();
		this.move = move;
		turtle = turtl;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			turtle.right(((Number) move.evaluate(t)).intValue());
		} catch (Exception e){
			System.out.println(e.toString());
			System.exit(0);
		}
		return null;
	}

}
