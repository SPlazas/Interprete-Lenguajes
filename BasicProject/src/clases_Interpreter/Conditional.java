package clases_Interpreter;

public class Conditional implements Evaluator{

	private Evaluator e;
	private Comandos c;
	
	public Conditional(Evaluator e, Comandos c) {
		super();
		this.e = e;
		this.c = c;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			if ((boolean)e.evaluate(t)){
				c.evaluate(new TS(t));
			}
		}
		catch(Exception exc){
			exc.printStackTrace();
			System.exit(0);
		}
		return null;
	}
	
	
}
