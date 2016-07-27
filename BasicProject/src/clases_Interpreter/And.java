package clases_Interpreter;

public class And implements Evaluator{

	private Evaluator ev1;
	private Evaluator ev2;
	
	public And(Evaluator ev1, Evaluator ev2) {
		super();
		this.ev1 = ev1;
		this.ev2 = ev2;
	}

	@Override
	public Object evaluate(TS t) {
		try{
			return (boolean)ev1.evaluate(t) && (boolean)ev2.evaluate(t);
		}
		catch (Exception e){
			System.out.println(e.toString());
			System.exit(0);
		}
		return null;
	}

}
