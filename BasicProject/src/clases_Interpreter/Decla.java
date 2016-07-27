package clases_Interpreter;

public class Decla implements Evaluator {

	private String symb;
	private Evaluator evaluator;
	
	public Decla(String symb, Evaluator evaluator) {
		this.symb = symb;
		this.evaluator = evaluator;
	}

	public String getSymb() {
		return symb;
	}

	public void setSymb(String symb) {
		this.symb = symb;
	}

	public Evaluator getEvaluator() {
		return evaluator;
	}

	public void setEvaluator(Evaluator evaluator) {
		this.evaluator = evaluator;
	}

	@Override
	public Object evaluate(TS t) {
		try{
			if (t.getTabla().get(symb)==null){
				t.putD(symb, evaluator.evaluate(t));
			}
			else {
				System.out.println("Variable repetida");
				System.exit(0);
			}
		}
		catch (Exception x){
			x.printStackTrace();
			System.exit(0);
		}
		return null;
	}

}
