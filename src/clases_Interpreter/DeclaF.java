package clases_Interpreter;

import java.util.List;

public class DeclaF implements Evaluator{

	private String ID;
	private List<Evaluator> list;
	private Evaluator entrada;
	private Evaluator salida;
	
	public DeclaF(Evaluator entrada, String iD, List<Evaluator> list, Evaluator salida) {
		ID = iD;
		this.list = list;
		this.entrada = entrada;
		this.salida = salida;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public List<Evaluator> getList() {
		return list;
	}

	public void setList(List<Evaluator> list) {
		this.list = list;
	}

	public Evaluator getEntrada() {
		return entrada;
	}

	public void setEntrada(Evaluator entrada) {
		this.entrada = entrada;
	}

	public Evaluator getSalida() {
		return salida;
	}

	public void setSalida(Evaluator salida) {
		this.salida = salida;
	}

	@Override
	public Object evaluate(TS t) {
		try {
			t.putD(ID, this);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	
	
}