package clases_Interpreter;

public class Defect implements Evaluator{
	private Object value;
	
	public Defect(){
		value=new Object();
	}
	
	@Override
	public Object evaluate (TS t){
		return value;
	}
}
