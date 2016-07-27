package clases_Interpreter;

public class Suma implements Evaluator{
	private Evaluator op1;
	private Evaluator op2;
	
	public Suma(Evaluator op1,Evaluator op2){
		super();
		this.op1=op1;
		this.op2=op2;
	}

	@Override
	public Object evaluate(TS t) {
		return Double.valueOf(op1.evaluate(t).toString())+Double.valueOf(op2.evaluate(t).toString());
	}
}
