package clases_Interpreter;

public class Multlp implements Evaluator{

	private Evaluator mult1;
	private Evaluator mult2;
		
	public Multlp(Evaluator mult1, Evaluator mult2) {
		super();
		this.mult1 = mult1;
		this.mult2 = mult2;
	}

	@Override
	public Object evaluate(TS t) {
		// TODO Auto-generated method stub
		return (Integer)mult1.evaluate(t)*(Integer)mult2.evaluate(t);
	}

}
