package co.edu.javeriana.interpreter;

import java.io.File;

import co.edu.javeriana.turtle.TurtleApplication;


public class Main {

	/** Este metodo muestra la forma de ejecutar la aplicacion. El primer parametro
	 * corresponde al interprete que procesara el programa fuente que se pasa como segundo parametro.
	 * 
	 * Para crear un interprete propio, basta con crear una subclase de
	 * {@link Interpreter} e implementar el metodo {@link Interpreter#executeProgram(File, co.edu.javeriana.turtle.Turtle)},
	 * el cual  deberia ser capaz de procesar el archivo program.logo
	 */
	public static void main(String args[]) {
		System.out.println("Esta aplicación no interpretará adecuadamente el programa \"program.logo\" hasta" +
				"que implementes un parser adecuado");
		TurtleApplication.run(new ANTLRInterpreter(), "program.logo", 50);
	}

}
