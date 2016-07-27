package clases_Interpreter;

public class Imprimir implements Evaluator{

	private Evaluator comando;
	
	public Imprimir(Evaluator comando) {
		super();
		this.comando = comando;
	}

	public Object evaluate(TS t) {
		System.out.println(comando.evaluate(t));
		return null;
	}

}
