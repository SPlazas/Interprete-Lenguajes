// $ANTLR 3.5 C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g 2016-04-28 17:09:16

package co.edu.javeriana.interpreter.antlr;
import co.edu.javeriana.turtle.*;
import co.edu.javeriana.interpreter.*;
import clases_Interpreter.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LogoParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "COMMA", "CORCH_C", 
		"CORCH_O", "DECLARATION", "DIFFERENT", "DIVI", "DO", "DOSP", "ELSE", "ENDF", 
		"ENDIF", "ENDWHILE", "EQUAL", "FLOTANTE", "FUNC", "ID", "IF", "MAX_E_THAN", 
		"MAX_THAN", "MIN_E_THAN", "MIN_THAN", "MOVE_B", "MOVE_F", "MULT", "NEGA", 
		"NOT", "NUMBER", "OR", "PAR_C", "PAR_O", "PENCOLOR", "PRINT", "QUOT", 
		"QUOT_C", "QUOT_O", "REST", "RETORNO", "ROTATE_L", "ROTATE_R", "STR", 
		"STRING", "SUM", "THEN", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int COMMA=6;
	public static final int CORCH_C=7;
	public static final int CORCH_O=8;
	public static final int DECLARATION=9;
	public static final int DIFFERENT=10;
	public static final int DIVI=11;
	public static final int DO=12;
	public static final int DOSP=13;
	public static final int ELSE=14;
	public static final int ENDF=15;
	public static final int ENDIF=16;
	public static final int ENDWHILE=17;
	public static final int EQUAL=18;
	public static final int FLOTANTE=19;
	public static final int FUNC=20;
	public static final int ID=21;
	public static final int IF=22;
	public static final int MAX_E_THAN=23;
	public static final int MAX_THAN=24;
	public static final int MIN_E_THAN=25;
	public static final int MIN_THAN=26;
	public static final int MOVE_B=27;
	public static final int MOVE_F=28;
	public static final int MULT=29;
	public static final int NEGA=30;
	public static final int NOT=31;
	public static final int NUMBER=32;
	public static final int OR=33;
	public static final int PAR_C=34;
	public static final int PAR_O=35;
	public static final int PENCOLOR=36;
	public static final int PRINT=37;
	public static final int QUOT=38;
	public static final int QUOT_C=39;
	public static final int QUOT_O=40;
	public static final int REST=41;
	public static final int RETORNO=42;
	public static final int ROTATE_L=43;
	public static final int ROTATE_R=44;
	public static final int STR=45;
	public static final int STRING=46;
	public static final int SUM=47;
	public static final int THEN=48;
	public static final int WHILE=49;
	public static final int WS=50;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LogoParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LogoParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LogoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g"; }


	private Turtle turtle;
		public LogoParser(Turtle turtle, TokenStream input) {
		    this(input);
		    this.turtle = turtle;
		}



	// $ANTLR start "program"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:26:3: program : ( func )* ( command )+ ;
	public final void program() throws RecognitionException {
		Evaluator func1 =null;
		Evaluator command2 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:26:10: ( ( func )* ( command )+ )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:27:3: ( func )* ( command )+
			{
			Comandos c=new Comandos();
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:28:3: ( func )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNC) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:28:4: func
					{
					pushFollow(FOLLOW_func_in_program54);
					func1=func();
					state._fsp--;

					c.add(func1);
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:29:3: ( command )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DECLARATION||(LA2_0 >= ID && LA2_0 <= IF)||(LA2_0 >= MOVE_B && LA2_0 <= MOVE_F)||(LA2_0 >= PENCOLOR && LA2_0 <= PRINT)||(LA2_0 >= ROTATE_L && LA2_0 <= ROTATE_R)||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:29:4: command
					{
					pushFollow(FOLLOW_command_in_program63);
					command2=command();
					state._fsp--;

					c.add(command2);
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			c.evaluate(new TS());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "func"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:32:3: func returns [Evaluator e] : FUNC ID PAR_O param PAR_C DOSP ( command )* ( retorno )? ENDF ;
	public final Evaluator func() throws RecognitionException {
		Evaluator e = null;


		Token ID4=null;
		Evaluator command3 =null;
		List<Evaluator> param5 =null;
		Evaluator retorno6 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:33:3: ( FUNC ID PAR_O param PAR_C DOSP ( command )* ( retorno )? ENDF )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:33:4: FUNC ID PAR_O param PAR_C DOSP ( command )* ( retorno )? ENDF
			{
			Comandos c=new Comandos();
			match(input,FUNC,FOLLOW_FUNC_in_func94); 
			ID4=(Token)match(input,ID,FOLLOW_ID_in_func96); 
			match(input,PAR_O,FOLLOW_PAR_O_in_func98); 
			pushFollow(FOLLOW_param_in_func100);
			param5=param();
			state._fsp--;

			match(input,PAR_C,FOLLOW_PAR_C_in_func102); 
			match(input,DOSP,FOLLOW_DOSP_in_func104); 
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:35:3: ( command )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DECLARATION||(LA3_0 >= ID && LA3_0 <= IF)||(LA3_0 >= MOVE_B && LA3_0 <= MOVE_F)||(LA3_0 >= PENCOLOR && LA3_0 <= PRINT)||(LA3_0 >= ROTATE_L && LA3_0 <= ROTATE_R)||LA3_0==WHILE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:35:4: command
					{
					pushFollow(FOLLOW_command_in_func109);
					command3=command();
					state._fsp--;

					c.add(command3);
					}
					break;

				default :
					break loop3;
				}
			}

			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:35:34: ( retorno )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==RETORNO) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:35:35: retorno
					{
					pushFollow(FOLLOW_retorno_in_func115);
					retorno6=retorno();
					state._fsp--;

					}
					break;

			}

			match(input,ENDF,FOLLOW_ENDF_in_func121); 
			e =new DeclaF(c,(ID4!=null?ID4.getText():null),param5,retorno6);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "func"



	// $ANTLR start "declaF"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:39:3: declaF returns [Evaluator e] : ID PAR_O paramLlamada PAR_C ;
	public final Evaluator declaF() throws RecognitionException {
		Evaluator e = null;


		Token ID7=null;
		List<Evaluator> paramLlamada8 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:40:3: ( ID PAR_O paramLlamada PAR_C )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:40:4: ID PAR_O paramLlamada PAR_C
			{
			ID7=(Token)match(input,ID,FOLLOW_ID_in_declaF145); 
			match(input,PAR_O,FOLLOW_PAR_O_in_declaF147); 
			pushFollow(FOLLOW_paramLlamada_in_declaF149);
			paramLlamada8=paramLlamada();
			state._fsp--;

			match(input,PAR_C,FOLLOW_PAR_C_in_declaF151); 
			e =new Funcion((ID7!=null?ID7.getText():null),paramLlamada8);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "declaF"



	// $ANTLR start "paramLlamada"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:44:3: paramLlamada returns [List<Evaluator> ev] : (exp= expression ( COMMA exp1= expression )* ) ;
	public final List<Evaluator> paramLlamada() throws RecognitionException {
		List<Evaluator> ev = null;


		Evaluator exp =null;
		Evaluator exp1 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:45:3: ( (exp= expression ( COMMA exp1= expression )* ) )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:45:4: (exp= expression ( COMMA exp1= expression )* )
			{
			List<Evaluator> listP=new ArrayList();
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:46:3: (exp= expression ( COMMA exp1= expression )* )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:46:4: exp= expression ( COMMA exp1= expression )*
			{
			pushFollow(FOLLOW_expression_in_paramLlamada184);
			exp=expression();
			state._fsp--;

			listP.add(exp);
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:46:39: ( COMMA exp1= expression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:46:40: COMMA exp1= expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_paramLlamada188); 
					pushFollow(FOLLOW_expression_in_paramLlamada192);
					exp1=expression();
					state._fsp--;

					listP.add(exp1);
					}
					break;

				default :
					break loop5;
				}
			}

			}

			ev =listP;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ev;
	}
	// $ANTLR end "paramLlamada"



	// $ANTLR start "param"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:49:3: param returns [List<Evaluator> ep] : ( DECLARATION id= ID ( COMMA ( DECLARATION id= ID )* ) )? ;
	public final List<Evaluator> param() throws RecognitionException {
		List<Evaluator> ep = null;


		Token id=null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:50:3: ( ( DECLARATION id= ID ( COMMA ( DECLARATION id= ID )* ) )? )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:50:4: ( DECLARATION id= ID ( COMMA ( DECLARATION id= ID )* ) )?
			{
			List<Evaluator> ab=new ArrayList();
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:51:3: ( DECLARATION id= ID ( COMMA ( DECLARATION id= ID )* ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==DECLARATION) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:51:4: DECLARATION id= ID ( COMMA ( DECLARATION id= ID )* )
					{
					match(input,DECLARATION,FOLLOW_DECLARATION_in_param225); 
					id=(Token)match(input,ID,FOLLOW_ID_in_param229); 
					ab.add(new Decla(id.getText(),new Defect()));
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:52:3: ( COMMA ( DECLARATION id= ID )* )
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:52:4: COMMA ( DECLARATION id= ID )*
					{
					match(input,COMMA,FOLLOW_COMMA_in_param235); 
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:52:9: ( DECLARATION id= ID )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==DECLARATION) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:52:10: DECLARATION id= ID
							{
							match(input,DECLARATION,FOLLOW_DECLARATION_in_param237); 
							id=(Token)match(input,ID,FOLLOW_ID_in_param241); 
							ab.add(new Decla(id.getText(),new Defect()));
							}
							break;

						default :
							break loop6;
						}
					}

					}

					}
					break;

			}

			ep =ab;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ep;
	}
	// $ANTLR end "param"



	// $ANTLR start "retorno"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:55:3: retorno returns [Evaluator e] : RETORNO expression ;
	public final Evaluator retorno() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression9 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:56:3: ( RETORNO expression )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:56:4: RETORNO expression
			{
			match(input,RETORNO,FOLLOW_RETORNO_in_retorno272); 
			pushFollow(FOLLOW_expression_in_retorno274);
			expression9=expression();
			state._fsp--;

			e =new Retorno(expression9);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "retorno"



	// $ANTLR start "conditional"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:59:3: conditional returns [Evaluator e] : IF PAR_O expression PAR_C CORCH_O ( command )+ CORCH_C ;
	public final Evaluator conditional() throws RecognitionException {
		Evaluator e = null;


		Evaluator command10 =null;
		Evaluator expression11 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:60:3: ( IF PAR_O expression PAR_C CORCH_O ( command )+ CORCH_C )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:60:4: IF PAR_O expression PAR_C CORCH_O ( command )+ CORCH_C
			{
			Comandos c=new Comandos();
			match(input,IF,FOLLOW_IF_in_conditional304); 
			match(input,PAR_O,FOLLOW_PAR_O_in_conditional306); 
			pushFollow(FOLLOW_expression_in_conditional308);
			expression11=expression();
			state._fsp--;

			match(input,PAR_C,FOLLOW_PAR_C_in_conditional310); 
			match(input,CORCH_O,FOLLOW_CORCH_O_in_conditional312); 
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:62:3: ( command )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==DECLARATION||(LA8_0 >= ID && LA8_0 <= IF)||(LA8_0 >= MOVE_B && LA8_0 <= MOVE_F)||(LA8_0 >= PENCOLOR && LA8_0 <= PRINT)||(LA8_0 >= ROTATE_L && LA8_0 <= ROTATE_R)||LA8_0==WHILE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:62:4: command
					{
					pushFollow(FOLLOW_command_in_conditional317);
					command10=command();
					state._fsp--;

					c.add(command10);
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match(input,CORCH_C,FOLLOW_CORCH_C_in_conditional322); 
			e =new Conditional(expression11,c);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "conditional"



	// $ANTLR start "ciclo"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:65:3: ciclo returns [Evaluator e] : WHILE PAR_O expression PAR_C CORCH_O ( command )+ CORCH_C ;
	public final Evaluator ciclo() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression12 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:66:3: ( WHILE PAR_O expression PAR_C CORCH_O ( command )+ CORCH_C )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:66:5: WHILE PAR_O expression PAR_C CORCH_O ( command )+ CORCH_C
			{
			Comandos comandos=new Comandos();
			match(input,WHILE,FOLLOW_WHILE_in_ciclo353); 
			match(input,PAR_O,FOLLOW_PAR_O_in_ciclo355); 
			pushFollow(FOLLOW_expression_in_ciclo357);
			expression12=expression();
			state._fsp--;

			match(input,PAR_C,FOLLOW_PAR_C_in_ciclo359); 
			match(input,CORCH_O,FOLLOW_CORCH_O_in_ciclo361); 
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:68:5: ( command )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DECLARATION||(LA9_0 >= ID && LA9_0 <= IF)||(LA9_0 >= MOVE_B && LA9_0 <= MOVE_F)||(LA9_0 >= PENCOLOR && LA9_0 <= PRINT)||(LA9_0 >= ROTATE_L && LA9_0 <= ROTATE_R)||LA9_0==WHILE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:68:6: command
					{
					pushFollow(FOLLOW_command_in_ciclo368);
					command();
					state._fsp--;

					comandos.add(e);
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input,CORCH_C,FOLLOW_CORCH_C_in_ciclo373); 
			e =new While(expression12,comandos);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "ciclo"



	// $ANTLR start "command"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:71:3: command returns [Evaluator e] : ( ciclo | conditional | turn_r | turn_l | move_f | move_b | declara | declaF | color | imprime );
	public final Evaluator command() throws RecognitionException {
		Evaluator e = null;


		Evaluator ciclo13 =null;
		Evaluator conditional14 =null;
		Evaluator turn_r15 =null;
		Evaluator turn_l16 =null;
		Evaluator move_f17 =null;
		Evaluator move_b18 =null;
		Evaluator declara19 =null;
		Evaluator declaF20 =null;
		Evaluator color21 =null;
		Evaluator imprime22 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:72:5: ( ciclo | conditional | turn_r | turn_l | move_f | move_b | declara | declaF | color | imprime )
			int alt10=10;
			switch ( input.LA(1) ) {
			case WHILE:
				{
				alt10=1;
				}
				break;
			case IF:
				{
				alt10=2;
				}
				break;
			case ROTATE_R:
				{
				alt10=3;
				}
				break;
			case ROTATE_L:
				{
				alt10=4;
				}
				break;
			case MOVE_F:
				{
				alt10=5;
				}
				break;
			case MOVE_B:
				{
				alt10=6;
				}
				break;
			case DECLARATION:
				{
				alt10=7;
				}
				break;
			case ID:
				{
				int LA10_8 = input.LA(2);
				if ( (LA10_8==ASSIGN) ) {
					alt10=7;
				}
				else if ( (LA10_8==PAR_O) ) {
					alt10=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PENCOLOR:
				{
				alt10=9;
				}
				break;
			case PRINT:
				{
				alt10=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:72:6: ciclo
					{
					pushFollow(FOLLOW_ciclo_in_command396);
					ciclo13=ciclo();
					state._fsp--;

					e =ciclo13;
					}
					break;
				case 2 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:73:6: conditional
					{
					pushFollow(FOLLOW_conditional_in_command405);
					conditional14=conditional();
					state._fsp--;

					e =conditional14;
					}
					break;
				case 3 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:74:6: turn_r
					{
					pushFollow(FOLLOW_turn_r_in_command414);
					turn_r15=turn_r();
					state._fsp--;

					e =turn_r15;
					}
					break;
				case 4 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:75:6: turn_l
					{
					pushFollow(FOLLOW_turn_l_in_command423);
					turn_l16=turn_l();
					state._fsp--;

					e =turn_l16;
					}
					break;
				case 5 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:76:6: move_f
					{
					pushFollow(FOLLOW_move_f_in_command432);
					move_f17=move_f();
					state._fsp--;

					e =move_f17;
					}
					break;
				case 6 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:77:6: move_b
					{
					pushFollow(FOLLOW_move_b_in_command441);
					move_b18=move_b();
					state._fsp--;

					e =move_b18;
					}
					break;
				case 7 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:78:6: declara
					{
					pushFollow(FOLLOW_declara_in_command450);
					declara19=declara();
					state._fsp--;

					e =declara19;
					}
					break;
				case 8 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:79:6: declaF
					{
					pushFollow(FOLLOW_declaF_in_command459);
					declaF20=declaF();
					state._fsp--;

					e =declaF20;
					}
					break;
				case 9 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:80:6: color
					{
					pushFollow(FOLLOW_color_in_command468);
					color21=color();
					state._fsp--;

					e =color21;
					}
					break;
				case 10 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:81:6: imprime
					{
					pushFollow(FOLLOW_imprime_in_command477);
					imprime22=imprime();
					state._fsp--;

					e =imprime22;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "command"



	// $ANTLR start "declara"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:84:3: declara returns [Evaluator e] : ( DECLARATION ID ASSIGN expression | ID ASSIGN expression );
	public final Evaluator declara() throws RecognitionException {
		Evaluator e = null;


		Token ID23=null;
		Token ID26=null;
		Evaluator expression24 =null;
		Evaluator expression25 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:85:3: ( DECLARATION ID ASSIGN expression | ID ASSIGN expression )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DECLARATION) ) {
				alt11=1;
			}
			else if ( (LA11_0==ID) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:85:4: DECLARATION ID ASSIGN expression
					{
					match(input,DECLARATION,FOLLOW_DECLARATION_in_declara499); 
					ID23=(Token)match(input,ID,FOLLOW_ID_in_declara501); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_declara503); 
					pushFollow(FOLLOW_expression_in_declara505);
					expression24=expression();
					state._fsp--;

					e =new Decla(ID23.getText(),expression24);
					}
					break;
				case 2 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:86:4: ID ASSIGN expression
					{
					ID26=(Token)match(input,ID,FOLLOW_ID_in_declara512); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_declara514); 
					pushFollow(FOLLOW_expression_in_declara516);
					expression25=expression();
					state._fsp--;

					e =new Assign(expression25,ID26.getText());
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "declara"



	// $ANTLR start "turn_r"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:89:3: turn_r returns [Evaluator e] : ROTATE_R expression ;
	public final Evaluator turn_r() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression27 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:90:3: ( ROTATE_R expression )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:90:4: ROTATE_R expression
			{
			match(input,ROTATE_R,FOLLOW_ROTATE_R_in_turn_r538); 
			pushFollow(FOLLOW_expression_in_turn_r540);
			expression27=expression();
			state._fsp--;

			e =new Move_Right(expression27,turtle);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "turn_r"



	// $ANTLR start "turn_l"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:93:3: turn_l returns [Evaluator e] : ROTATE_L expression ;
	public final Evaluator turn_l() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression28 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:94:3: ( ROTATE_L expression )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:94:4: ROTATE_L expression
			{
			match(input,ROTATE_L,FOLLOW_ROTATE_L_in_turn_l562); 
			pushFollow(FOLLOW_expression_in_turn_l564);
			expression28=expression();
			state._fsp--;

			e =new Move_Left(expression28,turtle);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "turn_l"



	// $ANTLR start "move_f"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:97:3: move_f returns [Evaluator e] : MOVE_F expression ;
	public final Evaluator move_f() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression29 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:98:3: ( MOVE_F expression )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:98:4: MOVE_F expression
			{
			match(input,MOVE_F,FOLLOW_MOVE_F_in_move_f588); 
			pushFollow(FOLLOW_expression_in_move_f590);
			expression29=expression();
			state._fsp--;

			e =new Move_Forward(expression29,turtle);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "move_f"



	// $ANTLR start "move_b"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:101:3: move_b returns [Evaluator e] : MOVE_B expression ;
	public final Evaluator move_b() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression30 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:102:3: ( MOVE_B expression )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:102:4: MOVE_B expression
			{
			match(input,MOVE_B,FOLLOW_MOVE_B_in_move_b614); 
			pushFollow(FOLLOW_expression_in_move_b616);
			expression30=expression();
			state._fsp--;

			e =new Move_Backward(expression30,turtle);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "move_b"



	// $ANTLR start "color"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:105:3: color returns [Evaluator e] : PENCOLOR a= expression COMMA b= expression COMMA c= expression COMMA d= expression ;
	public final Evaluator color() throws RecognitionException {
		Evaluator e = null;


		Evaluator a =null;
		Evaluator b =null;
		Evaluator c =null;
		Evaluator d =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:106:3: ( PENCOLOR a= expression COMMA b= expression COMMA c= expression COMMA d= expression )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:106:4: PENCOLOR a= expression COMMA b= expression COMMA c= expression COMMA d= expression
			{
			match(input,PENCOLOR,FOLLOW_PENCOLOR_in_color642); 
			pushFollow(FOLLOW_expression_in_color646);
			a=expression();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_color648); 
			pushFollow(FOLLOW_expression_in_color652);
			b=expression();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_color654); 
			pushFollow(FOLLOW_expression_in_color658);
			c=expression();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_color660); 
			pushFollow(FOLLOW_expression_in_color664);
			d=expression();
			state._fsp--;

			e =new Color (a,b,c,d,turtle);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "color"



	// $ANTLR start "imprime"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:109:3: imprime returns [Evaluator e] : ( PRINT QUOT expression QUOT | PRINT QUOT_O expression QUOT_C | PRINT expression );
	public final Evaluator imprime() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression31 =null;
		Evaluator expression32 =null;
		Evaluator expression33 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:110:3: ( PRINT QUOT expression QUOT | PRINT QUOT_O expression QUOT_C | PRINT expression )
			int alt12=3;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==PRINT) ) {
				switch ( input.LA(2) ) {
				case QUOT:
					{
					alt12=1;
					}
					break;
				case QUOT_O:
					{
					alt12=2;
					}
					break;
				case FLOTANTE:
				case ID:
				case NUMBER:
				case PAR_O:
				case REST:
				case STR:
				case STRING:
				case SUM:
					{
					alt12=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:110:4: PRINT QUOT expression QUOT
					{
					match(input,PRINT,FOLLOW_PRINT_in_imprime686); 
					match(input,QUOT,FOLLOW_QUOT_in_imprime688); 
					pushFollow(FOLLOW_expression_in_imprime690);
					expression31=expression();
					state._fsp--;

					match(input,QUOT,FOLLOW_QUOT_in_imprime692); 
					e =new Imprimir(expression31);
					}
					break;
				case 2 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:111:4: PRINT QUOT_O expression QUOT_C
					{
					match(input,PRINT,FOLLOW_PRINT_in_imprime699); 
					match(input,QUOT_O,FOLLOW_QUOT_O_in_imprime701); 
					pushFollow(FOLLOW_expression_in_imprime703);
					expression32=expression();
					state._fsp--;

					match(input,QUOT_C,FOLLOW_QUOT_C_in_imprime705); 
					e =new Imprimir(expression32);
					}
					break;
				case 3 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:112:4: PRINT expression
					{
					match(input,PRINT,FOLLOW_PRINT_in_imprime712); 
					pushFollow(FOLLOW_expression_in_imprime714);
					expression33=expression();
					state._fsp--;

					e =new Imprimir(expression33);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "imprime"



	// $ANTLR start "term"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:115:3: term returns [Evaluator e] : ( PAR_O expression PAR_C | NUMBER | FLOTANTE | ID | ID PAR_O paramLlamada PAR_C | STRING | STR );
	public final Evaluator term() throws RecognitionException {
		Evaluator e = null;


		Token NUMBER35=null;
		Token FLOTANTE36=null;
		Token ID37=null;
		Token ID38=null;
		Token STRING40=null;
		Token STR41=null;
		Evaluator expression34 =null;
		List<Evaluator> paramLlamada39 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:117:3: ( PAR_O expression PAR_C | NUMBER | FLOTANTE | ID | ID PAR_O paramLlamada PAR_C | STRING | STR )
			int alt13=7;
			switch ( input.LA(1) ) {
			case PAR_O:
				{
				alt13=1;
				}
				break;
			case NUMBER:
				{
				alt13=2;
				}
				break;
			case FLOTANTE:
				{
				alt13=3;
				}
				break;
			case ID:
				{
				int LA13_4 = input.LA(2);
				if ( (LA13_4==PAR_O) ) {
					alt13=5;
				}
				else if ( (LA13_4==EOF||LA13_4==AND||(LA13_4 >= COMMA && LA13_4 <= CORCH_C)||(LA13_4 >= DECLARATION && LA13_4 <= DIVI)||LA13_4==ENDF||LA13_4==EQUAL||(LA13_4 >= ID && LA13_4 <= MULT)||(LA13_4 >= OR && LA13_4 <= PAR_C)||(LA13_4 >= PENCOLOR && LA13_4 <= QUOT_C)||(LA13_4 >= REST && LA13_4 <= ROTATE_R)||LA13_4==SUM||LA13_4==WHILE) ) {
					alt13=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING:
				{
				alt13=6;
				}
				break;
			case STR:
				{
				alt13=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:117:4: PAR_O expression PAR_C
					{
					match(input,PAR_O,FOLLOW_PAR_O_in_term736); 
					pushFollow(FOLLOW_expression_in_term738);
					expression34=expression();
					state._fsp--;

					match(input,PAR_C,FOLLOW_PAR_C_in_term740); 
					e =expression34;
					}
					break;
				case 2 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:118:4: NUMBER
					{
					NUMBER35=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_term747); 
					e =new Numeros(Integer.parseInt(NUMBER35.getText()));
					}
					break;
				case 3 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:119:4: FLOTANTE
					{
					FLOTANTE36=(Token)match(input,FLOTANTE,FOLLOW_FLOTANTE_in_term755); 
					e =new Floatt(Float.parseFloat(FLOTANTE36.getText()));
					}
					break;
				case 4 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:120:4: ID
					{
					ID37=(Token)match(input,ID,FOLLOW_ID_in_term762); 
					e =new Variable((ID37!=null?ID37.getText():null));
					}
					break;
				case 5 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:121:4: ID PAR_O paramLlamada PAR_C
					{
					ID38=(Token)match(input,ID,FOLLOW_ID_in_term769); 
					match(input,PAR_O,FOLLOW_PAR_O_in_term771); 
					pushFollow(FOLLOW_paramLlamada_in_term773);
					paramLlamada39=paramLlamada();
					state._fsp--;

					match(input,PAR_C,FOLLOW_PAR_C_in_term775); 
					e =new Funcion((ID38!=null?ID38.getText():null),paramLlamada39);
					}
					break;
				case 6 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:122:4: STRING
					{
					STRING40=(Token)match(input,STRING,FOLLOW_STRING_in_term782); 
					e =new Sttring((STRING40!=null?STRING40.getText():null));
					}
					break;
				case 7 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:123:4: STR
					{
					STR41=(Token)match(input,STR,FOLLOW_STR_in_term789); 
					e =new Sttring((STR41!=null?STR41.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "term"



	// $ANTLR start "unary"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:126:3: unary returns [Evaluator e] : ( SUM | REST )* term ;
	public final Evaluator unary() throws RecognitionException {
		Evaluator e = null;


		Evaluator term42 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:128:3: ( ( SUM | REST )* term )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:128:5: ( SUM | REST )* term
			{
			boolean bandera=true;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:129:3: ( SUM | REST )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==SUM) ) {
					alt14=1;
				}
				else if ( (LA14_0==REST) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:129:4: SUM
					{
					match(input,SUM,FOLLOW_SUM_in_unary822); 
					}
					break;
				case 2 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:129:8: REST
					{
					match(input,REST,FOLLOW_REST_in_unary824); 
					bandera=! bandera;
					}
					break;

				default :
					break loop14;
				}
			}

			pushFollow(FOLLOW_term_in_unary829);
			term42=term();
			state._fsp--;

			e =term42;
			   if(!bandera) 
			      e =new Nega(e);
			  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "unary"



	// $ANTLR start "mult"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:136:3: mult returns [Evaluator e] : fact= unary ( ( MULT op2= unary | DIVI op2= unary ) )* ;
	public final Evaluator mult() throws RecognitionException {
		Evaluator e = null;


		Evaluator fact =null;
		Evaluator op2 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:138:3: (fact= unary ( ( MULT op2= unary | DIVI op2= unary ) )* )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:138:5: fact= unary ( ( MULT op2= unary | DIVI op2= unary ) )*
			{
			pushFollow(FOLLOW_unary_in_mult859);
			fact=unary();
			state._fsp--;

			e =fact;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:139:3: ( ( MULT op2= unary | DIVI op2= unary ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==DIVI||LA16_0==MULT) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:139:4: ( MULT op2= unary | DIVI op2= unary )
					{
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:139:4: ( MULT op2= unary | DIVI op2= unary )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==MULT) ) {
						alt15=1;
					}
					else if ( (LA15_0==DIVI) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:139:5: MULT op2= unary
							{
							match(input,MULT,FOLLOW_MULT_in_mult867); 
							pushFollow(FOLLOW_unary_in_mult871);
							op2=unary();
							state._fsp--;

							e =new Multlp(e,op2);
							}
							break;
						case 2 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:140:4: DIVI op2= unary
							{
							match(input,DIVI,FOLLOW_DIVI_in_mult877); 
							pushFollow(FOLLOW_unary_in_mult881);
							op2=unary();
							state._fsp--;

							e =new Div(e,op2);
							}
							break;

					}

					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "mult"



	// $ANTLR start "adition"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:144:3: adition returns [Evaluator e] : op1= mult ( ( SUM op2= mult | REST op2= mult ) )* ;
	public final Evaluator adition() throws RecognitionException {
		Evaluator e = null;


		Evaluator op1 =null;
		Evaluator op2 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:146:3: (op1= mult ( ( SUM op2= mult | REST op2= mult ) )* )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:146:5: op1= mult ( ( SUM op2= mult | REST op2= mult ) )*
			{
			pushFollow(FOLLOW_mult_in_adition914);
			op1=mult();
			state._fsp--;

			e =op1;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:147:3: ( ( SUM op2= mult | REST op2= mult ) )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==REST||LA18_0==SUM) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:147:4: ( SUM op2= mult | REST op2= mult )
					{
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:147:4: ( SUM op2= mult | REST op2= mult )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==SUM) ) {
						alt17=1;
					}
					else if ( (LA17_0==REST) ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:147:5: SUM op2= mult
							{
							match(input,SUM,FOLLOW_SUM_in_adition921); 
							pushFollow(FOLLOW_mult_in_adition925);
							op2=mult();
							state._fsp--;

							e =new Suma(e,op2);
							}
							break;
						case 2 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:148:4: REST op2= mult
							{
							match(input,REST,FOLLOW_REST_in_adition931); 
							pushFollow(FOLLOW_mult_in_adition935);
							op2=mult();
							state._fsp--;

							e =new Resta(e,op2);
							}
							break;

					}

					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "adition"



	// $ANTLR start "relation"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:152:3: relation returns [Evaluator e] : op1= adition ( ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition ) )* ;
	public final Evaluator relation() throws RecognitionException {
		Evaluator e = null;


		Evaluator op1 =null;
		Evaluator op2 =null;
		Evaluator ops =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:154:3: (op1= adition ( ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition ) )* )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:154:5: op1= adition ( ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition ) )*
			{
			pushFollow(FOLLOW_adition_in_relation970);
			op1=adition();
			state._fsp--;

			e =op1;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:155:3: ( ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition ) )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==DIFFERENT||LA20_0==EQUAL||(LA20_0 >= MAX_E_THAN && LA20_0 <= MIN_THAN)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:155:4: ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition )
					{
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:155:4: ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition )
					int alt19=6;
					switch ( input.LA(1) ) {
					case EQUAL:
						{
						alt19=1;
						}
						break;
					case DIFFERENT:
						{
						alt19=2;
						}
						break;
					case MIN_THAN:
						{
						alt19=3;
						}
						break;
					case MIN_E_THAN:
						{
						alt19=4;
						}
						break;
					case MAX_E_THAN:
						{
						alt19=5;
						}
						break;
					case MAX_THAN:
						{
						alt19=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:155:5: EQUAL op2= adition
							{
							match(input,EQUAL,FOLLOW_EQUAL_in_relation977); 
							pushFollow(FOLLOW_adition_in_relation981);
							op2=adition();
							state._fsp--;

							e =new Equals (e,op2);
							}
							break;
						case 2 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:156:4: DIFFERENT op2= adition
							{
							match(input,DIFFERENT,FOLLOW_DIFFERENT_in_relation987); 
							pushFollow(FOLLOW_adition_in_relation991);
							op2=adition();
							state._fsp--;

							e =new Different(e,op2);
							}
							break;
						case 3 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:157:4: MIN_THAN op2= adition
							{
							match(input,MIN_THAN,FOLLOW_MIN_THAN_in_relation997); 
							pushFollow(FOLLOW_adition_in_relation1001);
							op2=adition();
							state._fsp--;

							e =new MinThan(e,op2);
							}
							break;
						case 4 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:158:4: MIN_E_THAN op2= adition
							{
							match(input,MIN_E_THAN,FOLLOW_MIN_E_THAN_in_relation1007); 
							pushFollow(FOLLOW_adition_in_relation1011);
							op2=adition();
							state._fsp--;

							e =new MinEThan(e,op2);
							}
							break;
						case 5 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:159:4: MAX_E_THAN op2= adition
							{
							match(input,MAX_E_THAN,FOLLOW_MAX_E_THAN_in_relation1017); 
							pushFollow(FOLLOW_adition_in_relation1021);
							op2=adition();
							state._fsp--;

							e =new MaxEThan(e,op2);
							}
							break;
						case 6 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:160:4: MAX_THAN ops= adition
							{
							match(input,MAX_THAN,FOLLOW_MAX_THAN_in_relation1027); 
							pushFollow(FOLLOW_adition_in_relation1031);
							ops=adition();
							state._fsp--;

							e =new MaxThan(e,op2);
							}
							break;

					}

					}
					break;

				default :
					break loop20;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "relation"



	// $ANTLR start "expression"
	// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:164:3: expression returns [Evaluator e] : op1= relation ( ( AND op2= relation | OR op2= relation ) )* ;
	public final Evaluator expression() throws RecognitionException {
		Evaluator e = null;


		Evaluator op1 =null;
		Evaluator op2 =null;

		try {
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:166:3: (op1= relation ( ( AND op2= relation | OR op2= relation ) )* )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:166:5: op1= relation ( ( AND op2= relation | OR op2= relation ) )*
			{
			pushFollow(FOLLOW_relation_in_expression1065);
			op1=relation();
			state._fsp--;

			e =op1;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:167:3: ( ( AND op2= relation | OR op2= relation ) )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==AND||LA22_0==OR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:167:4: ( AND op2= relation | OR op2= relation )
					{
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:167:4: ( AND op2= relation | OR op2= relation )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==AND) ) {
						alt21=1;
					}
					else if ( (LA21_0==OR) ) {
						alt21=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:167:5: AND op2= relation
							{
							match(input,AND,FOLLOW_AND_in_expression1073); 
							pushFollow(FOLLOW_relation_in_expression1077);
							op2=relation();
							state._fsp--;

							e =new And(e,op2);
							}
							break;
						case 2 :
							// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:168:4: OR op2= relation
							{
							match(input,OR,FOLLOW_OR_in_expression1083); 
							pushFollow(FOLLOW_relation_in_expression1087);
							op2=relation();
							state._fsp--;

							e =new Or(e,op2);
							}
							break;

					}

					}
					break;

				default :
					break loop22;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_func_in_program54 = new BitSet(new long[]{0x0002183018700200L});
	public static final BitSet FOLLOW_command_in_program63 = new BitSet(new long[]{0x0002183018600202L});
	public static final BitSet FOLLOW_FUNC_in_func94 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_func96 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_O_in_func98 = new BitSet(new long[]{0x0000000400000200L});
	public static final BitSet FOLLOW_param_in_func100 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_PAR_C_in_func102 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DOSP_in_func104 = new BitSet(new long[]{0x00021C3018608200L});
	public static final BitSet FOLLOW_command_in_func109 = new BitSet(new long[]{0x00021C3018608200L});
	public static final BitSet FOLLOW_retorno_in_func115 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ENDF_in_func121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_declaF145 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_O_in_declaF147 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_paramLlamada_in_declaF149 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_PAR_C_in_declaF151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_paramLlamada184 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_paramLlamada188 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_paramLlamada192 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_DECLARATION_in_param225 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_param229 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_param235 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_DECLARATION_in_param237 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_param241 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_RETORNO_in_retorno272 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_retorno274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_conditional304 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_O_in_conditional306 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_conditional308 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_PAR_C_in_conditional310 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CORCH_O_in_conditional312 = new BitSet(new long[]{0x0002183018600200L});
	public static final BitSet FOLLOW_command_in_conditional317 = new BitSet(new long[]{0x0002183018600280L});
	public static final BitSet FOLLOW_CORCH_C_in_conditional322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_ciclo353 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_O_in_ciclo355 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_ciclo357 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_PAR_C_in_ciclo359 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CORCH_O_in_ciclo361 = new BitSet(new long[]{0x0002183018600200L});
	public static final BitSet FOLLOW_command_in_ciclo368 = new BitSet(new long[]{0x0002183018600280L});
	public static final BitSet FOLLOW_CORCH_C_in_ciclo373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ciclo_in_command396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_command405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turn_r_in_command414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turn_l_in_command423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_move_f_in_command432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_move_b_in_command441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declara_in_command450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaF_in_command459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_color_in_command468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_imprime_in_command477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLARATION_in_declara499 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_declara501 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_declara503 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_declara505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_declara512 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_declara514 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_declara516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROTATE_R_in_turn_r538 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_turn_r540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROTATE_L_in_turn_l562 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_turn_l564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOVE_F_in_move_f588 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_move_f590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOVE_B_in_move_b614 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_move_b616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PENCOLOR_in_color642 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_color646 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_color648 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_color652 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_color654 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_color658 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_color660 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_color664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_imprime686 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_QUOT_in_imprime688 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_imprime690 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_QUOT_in_imprime692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_imprime699 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_QUOT_O_in_imprime701 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_imprime703 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_QUOT_C_in_imprime705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_imprime712 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_imprime714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAR_O_in_term736 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_expression_in_term738 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_PAR_C_in_term740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_term747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOTANTE_in_term755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_term762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_term769 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_O_in_term771 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_paramLlamada_in_term773 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_PAR_C_in_term775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_term782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_term789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUM_in_unary822 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_REST_in_unary824 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_term_in_unary829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult859 = new BitSet(new long[]{0x0000000020000802L});
	public static final BitSet FOLLOW_MULT_in_mult867 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_unary_in_mult871 = new BitSet(new long[]{0x0000000020000802L});
	public static final BitSet FOLLOW_DIVI_in_mult877 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_unary_in_mult881 = new BitSet(new long[]{0x0000000020000802L});
	public static final BitSet FOLLOW_mult_in_adition914 = new BitSet(new long[]{0x0000820000000002L});
	public static final BitSet FOLLOW_SUM_in_adition921 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_mult_in_adition925 = new BitSet(new long[]{0x0000820000000002L});
	public static final BitSet FOLLOW_REST_in_adition931 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_mult_in_adition935 = new BitSet(new long[]{0x0000820000000002L});
	public static final BitSet FOLLOW_adition_in_relation970 = new BitSet(new long[]{0x0000000007840402L});
	public static final BitSet FOLLOW_EQUAL_in_relation977 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_adition_in_relation981 = new BitSet(new long[]{0x0000000007840402L});
	public static final BitSet FOLLOW_DIFFERENT_in_relation987 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_adition_in_relation991 = new BitSet(new long[]{0x0000000007840402L});
	public static final BitSet FOLLOW_MIN_THAN_in_relation997 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_adition_in_relation1001 = new BitSet(new long[]{0x0000000007840402L});
	public static final BitSet FOLLOW_MIN_E_THAN_in_relation1007 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_adition_in_relation1011 = new BitSet(new long[]{0x0000000007840402L});
	public static final BitSet FOLLOW_MAX_E_THAN_in_relation1017 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_adition_in_relation1021 = new BitSet(new long[]{0x0000000007840402L});
	public static final BitSet FOLLOW_MAX_THAN_in_relation1027 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_adition_in_relation1031 = new BitSet(new long[]{0x0000000007840402L});
	public static final BitSet FOLLOW_relation_in_expression1065 = new BitSet(new long[]{0x0000000200000012L});
	public static final BitSet FOLLOW_AND_in_expression1073 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_relation_in_expression1077 = new BitSet(new long[]{0x0000000200000012L});
	public static final BitSet FOLLOW_OR_in_expression1083 = new BitSet(new long[]{0x0000E20900280000L});
	public static final BitSet FOLLOW_relation_in_expression1087 = new BitSet(new long[]{0x0000000200000012L});
}
