package clases_Interpreter;

public class While implements Evaluator{

	private Evaluator exp;
	private Comandos linea;
	
	public While(Evaluator exp, Comandos linea) {
		super();
		this.exp = exp;
		this.linea = linea;
	}
	
	@Override
	public Object evaluate(TS t) {
		try{
			while ((boolean)exp.evaluate(t)){
				linea.evaluate(new TS(t));
			}
		} catch(Exception e){
			 System.out.println(e.toString());
			 System.exit(0);
		}
		return null;
	}

}
