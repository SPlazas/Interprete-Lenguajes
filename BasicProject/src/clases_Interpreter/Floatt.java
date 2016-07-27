package clases_Interpreter;

public class Floatt implements Evaluator{

	private float var;
	
	public Floatt(float v) {
		super();
		this.var = v;
	}

	@Override
	public Object evaluate(TS t) {
		return var;
	}

}
