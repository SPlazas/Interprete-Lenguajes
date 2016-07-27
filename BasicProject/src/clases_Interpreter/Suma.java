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
		return (Integer)op1.evaluate(t)+(Integer)op2.evaluate(t);
	}
}
