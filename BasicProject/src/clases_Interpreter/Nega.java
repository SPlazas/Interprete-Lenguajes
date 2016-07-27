package clases_Interpreter;

public class Nega implements Evaluator{

	private Evaluator op1;

	public Nega(Evaluator op1) {
		super();
		this.op1 = op1;
	}


	@Override
	public Object evaluate(TS t) {
		try {
			return -((Number)op1.evaluate(t)).doubleValue();
		}
		catch (Exception e){
			System.out.println(e.toString());
			System.exit(0);
		}
		return null;
	}

}
