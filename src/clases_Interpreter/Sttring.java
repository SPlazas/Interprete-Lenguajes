package clases_Interpreter;

public class Sttring implements Evaluator{

	private String e1;
	
	public Sttring(String c) {
		super();
		this.e1 = c.substring(1,c.length()-1);
	}

	@Override
	public Object evaluate(TS t) {
		// TODO Auto-generated method stub
		return e1;
	}

}
