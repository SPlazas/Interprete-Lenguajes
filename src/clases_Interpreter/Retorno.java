package clases_Interpreter;

public class Retorno implements Evaluator{

	private Evaluator x;

	public Retorno(Evaluator x) {
		this.x = x;
	}

	@Override
	public Object evaluate(TS t) {
		return x.evaluate(t);
	}
	
	
}
