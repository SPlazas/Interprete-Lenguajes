package co.edu.javeriana.interpreter;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import co.edu.javeriana.interpreter.antlr.LogoLexer;
import co.edu.javeriana.interpreter.antlr.LogoParser;
import co.edu.javeriana.turtle.Turtle;

public class ANTLRInterpreter extends Interpreter {

	@Override
	public void executeProgram(String program, Turtle turtle) {
        try {
			LogoLexer lexer = new LogoLexer(new ANTLRFileStream(program));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
 
			LogoParser parser = new LogoParser(turtle,tokens);
 
			try {
			    parser.program();
			} catch (RecognitionException e)  {
			    e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
