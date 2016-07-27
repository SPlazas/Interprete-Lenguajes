package clases_Interpreter;
import java.util.HashMap;
public class TS {
	private HashMap<String,Object> tabla;
	protected TS anterior=null;
	
	public TS(TS t) {
		tabla = new HashMap<String,Object>();
		anterior = t;
	}
	
	public TS(){
		tabla = new HashMap<String,Object>();
	}
	
	public void putD (String simbolo, Object Object){
		tabla.put(simbolo, Object);
	}
	
	public void putAssign(String symb,Object stat)throws Exception{
		for (TS f=this;f!=null;f=f.anterior){	
			if (f.getTabla().get(symb)!=null){
				f.getTabla().put(symb, stat);
				return;
			}
		}
		throw new Exception("Variable no existe");
	}
	
	public HashMap<String,Object> getTabla(){
		return tabla;
	}
	
	Object get(String palabra){
		for (TS tt=this;tt!=null;tt=tt.anterior){
			Object rta=(Object) tt.tabla.get(palabra);
			if (rta!=null){
				return rta;
			}

		}		
		return null;
	}
	
}
