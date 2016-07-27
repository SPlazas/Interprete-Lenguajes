package clases_Interpreter;

public class Variable implements Evaluator{

	private String vari;

	public Variable(String a) {
		this.vari = a;
	}

	public String getVari() {
		return vari;
	}

	public void setVari(String variA) {
		this.vari = variA;
	}

	@Override
	public Object evaluate(TS t) {
		try{
			if (t.get(vari)!=null){
				return t.get(vari);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
