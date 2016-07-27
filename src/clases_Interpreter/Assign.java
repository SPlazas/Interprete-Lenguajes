package clases_Interpreter;

public class Assign implements Evaluator{

	private Evaluator ev;
	private String x;
	
	public Assign(Evaluator ev, String x) {
		super();
		this.ev = ev;
		this.x = x;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			t.putAssign(x, ev.evaluate(t));
		}
		catch(Exception e){
			System.out.println(e.toString());
			System.exit(0);
		}
		return null;
	}
	
}
