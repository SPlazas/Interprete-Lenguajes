package clases_Interpreter;

public class Imprimir implements Evaluator{

	private Evaluator comando;
	
	public Imprimir(Evaluator coma) {
		this.comando = coma;
	}
	@Override
	public Object evaluate(TS t) {
		System.out.println(comando.evaluate(t));
		return null;
	}

}
