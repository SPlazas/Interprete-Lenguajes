package clases_Interpreter;

import co.edu.javeriana.turtle.Turtle;

public class Move_Right implements Evaluator{
	private Evaluator move;
	private Turtle turtle;
	
	public Move_Right(Evaluator move, Turtle turtle) {
		super();
		this.move = move;
		this.turtle = turtle;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			turtle.left(((Number) move.evaluate(t)).intValue());
		} catch (Exception e){
			System.out.println(e.toString());
			System.exit(0);
		}
		return null;
	}

}
