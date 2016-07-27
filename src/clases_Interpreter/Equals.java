package clases_Interpreter;

public class Equals implements Evaluator{

	private Evaluator eva1;
	private Evaluator eva2;

	public Equals(Evaluator eva1, Evaluator eva2) {
		super();
		this.eva1 = eva1;
		this.eva2 = eva2;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			return Double.valueOf(eva1.evaluate(t).toString()).equals(Double.valueOf(eva2.evaluate(t).toString()));
		}
		catch (Exception e){
			System.out.println(e.toString());
			return null;
		}
	}

}
