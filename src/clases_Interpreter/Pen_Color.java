package clases_Interpreter;

import co.edu.javeriana.turtle.Turtle;

public class Pen_Color implements Evaluator {

	private Evaluator e1;
	private Evaluator e2;
	private Evaluator e3;
	private Evaluator e4;
	private Turtle tu;

	public Pen_Color(Evaluator e1, Evaluator e2, Evaluator e3, Evaluator e4,
			Turtle t) {
		super();
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
		this.e4 = e4;
		tu = t;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			tu.color(((Number) e1.evaluate(t)).intValue(),
					((Number) e2.evaluate(t)).intValue(),
					(((Number) e3.evaluate(t)).intValue()),
					((Number) e4.evaluate(t)).intValue());
		} catch (Exception e) {
			System.out.println(e.toString());
			System.exit(0);
		}
		return null;
	}

}
