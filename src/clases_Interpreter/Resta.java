package clases_Interpreter;

public class Resta implements Evaluator{
	private Evaluator v1;
	private Evaluator v2;
	
	public Resta(Evaluator v1, Evaluator v2) {
		super();
		this.v1 = v1;
		this.v2 = v2;
	}

	@Override
	public Object evaluate(TS t) {
		return Double.valueOf(v1.evaluate(t).toString())-Double.valueOf(v2.evaluate(t).toString());
	}
	
}
