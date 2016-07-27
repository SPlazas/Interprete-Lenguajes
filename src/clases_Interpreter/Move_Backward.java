package clases_Interpreter;

import co.edu.javeriana.turtle.Turtle;

public class Move_Backward implements Evaluator{
	private Evaluator move;
	private Turtle turtle;
	
	public Move_Backward(Evaluator move, Turtle tu) {
		super();
		this.move = move;
		turtle = tu;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			turtle.back(((Number) move.evaluate(t)).intValue());
		} catch (Exception e){
			System.out.println(e.toString());
			System.exit(0);
		}
		return null;
	}

}
