package clases_Interpreter;

public class Numeros implements Evaluator{

	private Integer num;
	
	public Numeros(Integer n) {
		super();
		this.num=n;
	}

	@Override
	public Object evaluate(TS t) {
		return num;
	}

}
