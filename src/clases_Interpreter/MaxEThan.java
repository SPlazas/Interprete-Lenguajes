package clases_Interpreter;

public class MaxEThan implements Evaluator{

	private Evaluator ev1;
	private Evaluator ev2;
	
	public MaxEThan(Evaluator ev1, Evaluator ev2) {
		super();
		this.ev1 = ev1;
		this.ev2 = ev2;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			return Double.valueOf(ev1.evaluate(t).toString())>=Double.valueOf(ev2.evaluate(t).toString());
		}
		catch(Exception e){
			System.out.println(e.toString());
			System.exit(0);
			return null;
		}
	}
	
	
	

}
