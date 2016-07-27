package clases_Interpreter;

public class Condicionales implements Evaluator{

	private Evaluator e;
	private Comandos c;
	
	public Condicionales(Evaluator e, Comandos c) {
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
