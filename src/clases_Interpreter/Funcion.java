package clases_Interpreter;

import java.util.List;

public class Funcion implements Evaluator{

	private String ID;
	private List<Evaluator> l;
	private TS t;
	
	public Funcion(String iD, List<Evaluator> l) {
		ID = iD;
		this.l = l;
		t = new TS();
	}

	public void matchP(TS t1) throws Exception{
		List<Evaluator> auxL=((DeclaF)t1.get(ID)).getList();
		
		if (auxL.size()==l.size()){
			for (int i=0;i<auxL.size();i++){
				t1.putD((((Decla) auxL.get(i)).getSymb()),l.get(i).evaluate(t1));
			}
		}
		else {
			throw new Exception ("Error en longitud de listas");
		}
	}


	@Override
	public Object evaluate(TS t) {
		try {
			matchP(t);
			DeclaF f=(DeclaF) t.get(ID);
			Evaluator rta=f.getEntrada();
			rta.evaluate(t);
			if (f.getSalida()!=null){
				t.putD(ID, f.getSalida().evaluate(t));
			}
			return t.get(ID);
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
		return null;
	}

	

}
