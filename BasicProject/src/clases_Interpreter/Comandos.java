package clases_Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Comandos implements Evaluator{

	private List<Evaluator> coms;

	public Comandos() {
		coms = new ArrayList<Evaluator>();
	}

	public void add(Evaluator nE){
		coms.add(nE);
	}
	
	@Override
	public Object evaluate(TS t) {
		for (Evaluator list:coms){
			list.evaluate(t);
		}
		return null;
	}

}
