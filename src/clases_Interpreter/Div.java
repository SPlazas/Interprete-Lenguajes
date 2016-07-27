package clases_Interpreter;

public class Div implements Evaluator{

	private Evaluator dividendo;
	private Evaluator divisor;
	
	public Div(Evaluator dividendo, Evaluator divisor) {
		super();
		this.dividendo = dividendo;
		this.divisor = divisor;
	}

	@Override
	public Object evaluate(TS t) {
		return Double.valueOf(dividendo.evaluate(t).toString())/Double.valueOf(divisor.evaluate(t).toString());
	}

}
