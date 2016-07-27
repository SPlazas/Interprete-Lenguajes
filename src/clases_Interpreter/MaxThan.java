package clases_Interpreter;

public class MaxThan implements Evaluator{

	private Evaluator e1;
	private Evaluator e2;
	
	public MaxThan(Evaluator e1, Evaluator e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public Object evaluate(TS t) {
		try{
			return Double.valueOf(e1.evaluate(t).toString())>Double.valueOf(e2.evaluate(t).toString());
		}
		catch(Exception e){
			System.out.println(e.toString());
			System.exit(0);
			return null;
		}
	}
	
	

}
