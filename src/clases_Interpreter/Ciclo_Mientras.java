package clases_Interpreter;

public class Ciclo_Mientras implements Evaluator{

	private Evaluator exp;
	private Comandos linea;
	
	public Ciclo_Mientras(Evaluator exp, Comandos linea) {
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
