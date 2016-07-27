package clases_Interpreter;

public class Or implements Evaluator{
	
	private Evaluator e1;
	private Evaluator e2;
	
	public Or(Evaluator e1, Evaluator e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			return (boolean)e1.evaluate(t) || (boolean)e2.evaluate(t);
		}
		catch(Exception e){
			System.out.println(e.toString());
			System.exit(0);
		}
		return null;
	}

	
}
