// $ANTLR 3.5 C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g 2016-05-02 00:15:12

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
		"MAX_THAN", "MIENTRAS", "MIN_E_THAN", "MIN_THAN", "MOVE_B", "MOVE_F", 
		"MULT", "NEGA", "NOT", "NUMBER", "OR", "PAR_C", "PAR_O", "PENCOLOR", "PRINT", 
		"QUOT", "QUOT_C", "QUOT_O", "REST", "RETORNO", "ROTATE_L", "ROTATE_R", 
		"STR", "STRING", "SUM", "THEN", "WS"
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
	public static final int MIENTRAS=25;
	public static final int MIN_E_THAN=26;
	public static final int MIN_THAN=27;
	public static final int MOVE_B=28;
	public static final int MOVE_F=29;
	public static final int MULT=30;
	public static final int NEGA=31;
	public static final int NOT=32;
	public static final int NUMBER=33;
	public static final int OR=34;
	public static final int PAR_C=35;
	public static final int PAR_O=36;
	public static final int PENCOLOR=37;
	public static final int PRINT=38;
	public static final int QUOT=39;
	public static final int QUOT_C=40;
	public static final int QUOT_O=41;
	public static final int REST=42;
	public static final int RETORNO=43;
	public static final int ROTATE_L=44;
	public static final int ROTATE_R=45;
	public static final int STR=46;
	public static final int STRING=47;
	public static final int SUM=48;
	public static final int THEN=49;
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
	@Override public String getGrammarFileName() { return "C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g"; }


	private Turtle turtle;
		public LogoParser(Turtle turtle, TokenStream input) {
		    this(input);
		    this.turtle = turtle;
		}



	// $ANTLR start "program"
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:26:3: program : ( func )* ( command )+ ;
	public final void program() throws RecognitionException {
		Evaluator func1 =null;
		Evaluator command2 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:26:10: ( ( func )* ( command )+ )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:27:3: ( func )* ( command )+
			{
			Comandos c=new Comandos();
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:28:3: ( func )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNC) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:28:4: func
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

			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:29:3: ( command )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DECLARATION||(LA2_0 >= ID && LA2_0 <= IF)||LA2_0==MIENTRAS||(LA2_0 >= MOVE_B && LA2_0 <= MOVE_F)||(LA2_0 >= PENCOLOR && LA2_0 <= PRINT)||(LA2_0 >= ROTATE_L && LA2_0 <= ROTATE_R)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:29:4: command
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:32:3: func returns [Evaluator e] : FUNC ID PAR_O param PAR_C DOSP ( command )* ( retorno )? ENDF ;
	public final Evaluator func() throws RecognitionException {
		Evaluator e = null;


		Token ID4=null;
		Evaluator command3 =null;
		List<Evaluator> param5 =null;
		Evaluator retorno6 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:33:3: ( FUNC ID PAR_O param PAR_C DOSP ( command )* ( retorno )? ENDF )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:33:4: FUNC ID PAR_O param PAR_C DOSP ( command )* ( retorno )? ENDF
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
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:35:3: ( command )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DECLARATION||(LA3_0 >= ID && LA3_0 <= IF)||LA3_0==MIENTRAS||(LA3_0 >= MOVE_B && LA3_0 <= MOVE_F)||(LA3_0 >= PENCOLOR && LA3_0 <= PRINT)||(LA3_0 >= ROTATE_L && LA3_0 <= ROTATE_R)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:35:4: command
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

			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:35:35: ( retorno )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==RETORNO) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:35:36: retorno
					{
					pushFollow(FOLLOW_retorno_in_func116);
					retorno6=retorno();
					state._fsp--;

					}
					break;

			}

			match(input,ENDF,FOLLOW_ENDF_in_func122); 
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:39:3: declaF returns [Evaluator e] : ID PAR_O paramLlamada PAR_C ;
	public final Evaluator declaF() throws RecognitionException {
		Evaluator e = null;


		Token ID7=null;
		List<Evaluator> paramLlamada8 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:40:3: ( ID PAR_O paramLlamada PAR_C )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:40:4: ID PAR_O paramLlamada PAR_C
			{
			ID7=(Token)match(input,ID,FOLLOW_ID_in_declaF146); 
			match(input,PAR_O,FOLLOW_PAR_O_in_declaF148); 
			pushFollow(FOLLOW_paramLlamada_in_declaF150);
			paramLlamada8=paramLlamada();
			state._fsp--;

			match(input,PAR_C,FOLLOW_PAR_C_in_declaF152); 
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:44:3: paramLlamada returns [List<Evaluator> ev] : (exp= expression ( COMMA exp1= expression )* )? ;
	public final List<Evaluator> paramLlamada() throws RecognitionException {
		List<Evaluator> ev = null;


		Evaluator exp =null;
		Evaluator exp1 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:45:3: ( (exp= expression ( COMMA exp1= expression )* )? )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:45:4: (exp= expression ( COMMA exp1= expression )* )?
			{
			List<Evaluator> listP=new ArrayList();
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:46:3: (exp= expression ( COMMA exp1= expression )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==FLOTANTE||LA6_0==ID||LA6_0==NUMBER||LA6_0==PAR_O||LA6_0==REST||(LA6_0 >= STR && LA6_0 <= SUM)) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:46:4: exp= expression ( COMMA exp1= expression )*
					{
					pushFollow(FOLLOW_expression_in_paramLlamada185);
					exp=expression();
					state._fsp--;

					listP.add(exp);
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:46:39: ( COMMA exp1= expression )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMA) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:46:40: COMMA exp1= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_paramLlamada189); 
							pushFollow(FOLLOW_expression_in_paramLlamada193);
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
					break;

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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:49:3: param returns [List<Evaluator> ev] : ( DECLARATION id= ID ( COMMA ( DECLARATION id= ID )* ) )? ;
	public final List<Evaluator> param() throws RecognitionException {
		List<Evaluator> ev = null;


		Token id=null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:50:3: ( ( DECLARATION id= ID ( COMMA ( DECLARATION id= ID )* ) )? )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:50:4: ( DECLARATION id= ID ( COMMA ( DECLARATION id= ID )* ) )?
			{
			List<Evaluator> listP=new ArrayList();
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:51:3: ( DECLARATION id= ID ( COMMA ( DECLARATION id= ID )* ) )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==DECLARATION) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:51:4: DECLARATION id= ID ( COMMA ( DECLARATION id= ID )* )
					{
					match(input,DECLARATION,FOLLOW_DECLARATION_in_param227); 
					id=(Token)match(input,ID,FOLLOW_ID_in_param231); 
					listP.add(new Decla(id.getText(),new Defect()));
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:52:3: ( COMMA ( DECLARATION id= ID )* )
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:52:4: COMMA ( DECLARATION id= ID )*
					{
					match(input,COMMA,FOLLOW_COMMA_in_param237); 
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:52:9: ( DECLARATION id= ID )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==DECLARATION) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:52:10: DECLARATION id= ID
							{
							match(input,DECLARATION,FOLLOW_DECLARATION_in_param239); 
							id=(Token)match(input,ID,FOLLOW_ID_in_param243); 
							listP.add(new Decla(id.getText(),new Defect()));
							}
							break;

						default :
							break loop7;
						}
					}

					}

					}
					break;

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
	// $ANTLR end "param"



	// $ANTLR start "retorno"
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:55:3: retorno returns [Evaluator e] : RETORNO expression ;
	public final Evaluator retorno() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression9 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:56:3: ( RETORNO expression )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:56:4: RETORNO expression
			{
			match(input,RETORNO,FOLLOW_RETORNO_in_retorno274); 
			pushFollow(FOLLOW_expression_in_retorno276);
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



	// $ANTLR start "ciclo"
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:59:3: ciclo returns [Evaluator e] : MIENTRAS PAR_O expression PAR_C DO ( command )+ ENDWHILE ;
	public final Evaluator ciclo() throws RecognitionException {
		Evaluator e = null;


		Evaluator command10 =null;
		Evaluator expression11 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:60:3: ( MIENTRAS PAR_O expression PAR_C DO ( command )+ ENDWHILE )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:60:5: MIENTRAS PAR_O expression PAR_C DO ( command )+ ENDWHILE
			{
			Comandos cc=new Comandos();
			match(input,MIENTRAS,FOLLOW_MIENTRAS_in_ciclo312); 
			match(input,PAR_O,FOLLOW_PAR_O_in_ciclo314); 
			pushFollow(FOLLOW_expression_in_ciclo316);
			expression11=expression();
			state._fsp--;

			match(input,PAR_C,FOLLOW_PAR_C_in_ciclo318); 
			match(input,DO,FOLLOW_DO_in_ciclo320); 
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:62:5: ( command )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DECLARATION||(LA9_0 >= ID && LA9_0 <= IF)||LA9_0==MIENTRAS||(LA9_0 >= MOVE_B && LA9_0 <= MOVE_F)||(LA9_0 >= PENCOLOR && LA9_0 <= PRINT)||(LA9_0 >= ROTATE_L && LA9_0 <= ROTATE_R)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:62:6: command
					{
					pushFollow(FOLLOW_command_in_ciclo327);
					command10=command();
					state._fsp--;

					cc.add(command10);
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input,ENDWHILE,FOLLOW_ENDWHILE_in_ciclo336); 
			e =new Ciclo_Mientras(expression11,cc);
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



	// $ANTLR start "conditional"
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:66:3: conditional returns [Evaluator e] : IF PAR_O expression PAR_C THEN ( command )+ ENDIF ;
	public final Evaluator conditional() throws RecognitionException {
		Evaluator e = null;


		Evaluator command12 =null;
		Evaluator expression13 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:67:3: ( IF PAR_O expression PAR_C THEN ( command )+ ENDIF )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:67:4: IF PAR_O expression PAR_C THEN ( command )+ ENDIF
			{
			Comandos c=new Comandos();
			match(input,IF,FOLLOW_IF_in_conditional362); 
			match(input,PAR_O,FOLLOW_PAR_O_in_conditional364); 
			pushFollow(FOLLOW_expression_in_conditional366);
			expression13=expression();
			state._fsp--;

			match(input,PAR_C,FOLLOW_PAR_C_in_conditional368); 
			match(input,THEN,FOLLOW_THEN_in_conditional370); 
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:69:3: ( command )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==DECLARATION||(LA10_0 >= ID && LA10_0 <= IF)||LA10_0==MIENTRAS||(LA10_0 >= MOVE_B && LA10_0 <= MOVE_F)||(LA10_0 >= PENCOLOR && LA10_0 <= PRINT)||(LA10_0 >= ROTATE_L && LA10_0 <= ROTATE_R)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:69:4: command
					{
					pushFollow(FOLLOW_command_in_conditional375);
					command12=command();
					state._fsp--;

					c.add(command12);
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match(input,ENDIF,FOLLOW_ENDIF_in_conditional383); 
			e =new Condicionales(expression13,c);
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



	// $ANTLR start "command"
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:73:3: command returns [Evaluator e] : ( ciclo | conditional | turn_r | turn_l | move_f | move_b | declara | declaF | color | imprime );
	public final Evaluator command() throws RecognitionException {
		Evaluator e = null;


		Evaluator ciclo14 =null;
		Evaluator conditional15 =null;
		Evaluator turn_r16 =null;
		Evaluator turn_l17 =null;
		Evaluator move_f18 =null;
		Evaluator move_b19 =null;
		Evaluator declara20 =null;
		Evaluator declaF21 =null;
		Evaluator color22 =null;
		Evaluator imprime23 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:74:5: ( ciclo | conditional | turn_r | turn_l | move_f | move_b | declara | declaF | color | imprime )
			int alt11=10;
			switch ( input.LA(1) ) {
			case MIENTRAS:
				{
				alt11=1;
				}
				break;
			case IF:
				{
				alt11=2;
				}
				break;
			case ROTATE_R:
				{
				alt11=3;
				}
				break;
			case ROTATE_L:
				{
				alt11=4;
				}
				break;
			case MOVE_F:
				{
				alt11=5;
				}
				break;
			case MOVE_B:
				{
				alt11=6;
				}
				break;
			case DECLARATION:
				{
				alt11=7;
				}
				break;
			case ID:
				{
				int LA11_8 = input.LA(2);
				if ( (LA11_8==ASSIGN) ) {
					alt11=7;
				}
				else if ( (LA11_8==PAR_O) ) {
					alt11=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PENCOLOR:
				{
				alt11=9;
				}
				break;
			case PRINT:
				{
				alt11=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:74:6: ciclo
					{
					pushFollow(FOLLOW_ciclo_in_command406);
					ciclo14=ciclo();
					state._fsp--;

					e =ciclo14;
					}
					break;
				case 2 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:75:6: conditional
					{
					pushFollow(FOLLOW_conditional_in_command415);
					conditional15=conditional();
					state._fsp--;

					e =conditional15;
					}
					break;
				case 3 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:76:6: turn_r
					{
					pushFollow(FOLLOW_turn_r_in_command424);
					turn_r16=turn_r();
					state._fsp--;

					e =turn_r16;
					}
					break;
				case 4 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:77:6: turn_l
					{
					pushFollow(FOLLOW_turn_l_in_command433);
					turn_l17=turn_l();
					state._fsp--;

					e =turn_l17;
					}
					break;
				case 5 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:78:6: move_f
					{
					pushFollow(FOLLOW_move_f_in_command442);
					move_f18=move_f();
					state._fsp--;

					e =move_f18;
					}
					break;
				case 6 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:79:6: move_b
					{
					pushFollow(FOLLOW_move_b_in_command451);
					move_b19=move_b();
					state._fsp--;

					e =move_b19;
					}
					break;
				case 7 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:80:6: declara
					{
					pushFollow(FOLLOW_declara_in_command460);
					declara20=declara();
					state._fsp--;

					e =declara20;
					}
					break;
				case 8 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:81:6: declaF
					{
					pushFollow(FOLLOW_declaF_in_command469);
					declaF21=declaF();
					state._fsp--;

					e =declaF21;
					}
					break;
				case 9 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:82:6: color
					{
					pushFollow(FOLLOW_color_in_command478);
					color22=color();
					state._fsp--;

					e =color22;
					}
					break;
				case 10 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:83:6: imprime
					{
					pushFollow(FOLLOW_imprime_in_command487);
					imprime23=imprime();
					state._fsp--;

					e =imprime23;
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:86:3: declara returns [Evaluator e] : ( DECLARATION ID ASSIGN expression | ID ASSIGN expression );
	public final Evaluator declara() throws RecognitionException {
		Evaluator e = null;


		Token ID24=null;
		Token ID27=null;
		Evaluator expression25 =null;
		Evaluator expression26 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:87:3: ( DECLARATION ID ASSIGN expression | ID ASSIGN expression )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==DECLARATION) ) {
				alt12=1;
			}
			else if ( (LA12_0==ID) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:87:4: DECLARATION ID ASSIGN expression
					{
					match(input,DECLARATION,FOLLOW_DECLARATION_in_declara509); 
					ID24=(Token)match(input,ID,FOLLOW_ID_in_declara511); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_declara513); 
					pushFollow(FOLLOW_expression_in_declara515);
					expression25=expression();
					state._fsp--;

					e =new Decla(ID24.getText(),expression25);
					}
					break;
				case 2 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:88:4: ID ASSIGN expression
					{
					ID27=(Token)match(input,ID,FOLLOW_ID_in_declara522); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_declara524); 
					pushFollow(FOLLOW_expression_in_declara526);
					expression26=expression();
					state._fsp--;

					e =new Assign(expression26,ID27.getText());
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:91:3: turn_r returns [Evaluator e] : ROTATE_R expression ;
	public final Evaluator turn_r() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression28 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:92:3: ( ROTATE_R expression )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:92:4: ROTATE_R expression
			{
			match(input,ROTATE_R,FOLLOW_ROTATE_R_in_turn_r548); 
			pushFollow(FOLLOW_expression_in_turn_r550);
			expression28=expression();
			state._fsp--;

			e =new Move_Right(expression28,turtle);
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:95:3: turn_l returns [Evaluator e] : ROTATE_L expression ;
	public final Evaluator turn_l() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression29 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:96:3: ( ROTATE_L expression )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:96:4: ROTATE_L expression
			{
			match(input,ROTATE_L,FOLLOW_ROTATE_L_in_turn_l572); 
			pushFollow(FOLLOW_expression_in_turn_l574);
			expression29=expression();
			state._fsp--;

			e =new Move_Left(expression29,turtle);
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:99:3: move_f returns [Evaluator e] : MOVE_F expression ;
	public final Evaluator move_f() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression30 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:100:3: ( MOVE_F expression )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:100:4: MOVE_F expression
			{
			match(input,MOVE_F,FOLLOW_MOVE_F_in_move_f598); 
			pushFollow(FOLLOW_expression_in_move_f600);
			expression30=expression();
			state._fsp--;

			e =new Move_Forward(expression30,turtle);
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:103:3: move_b returns [Evaluator e] : MOVE_B expression ;
	public final Evaluator move_b() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression31 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:104:3: ( MOVE_B expression )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:104:4: MOVE_B expression
			{
			match(input,MOVE_B,FOLLOW_MOVE_B_in_move_b624); 
			pushFollow(FOLLOW_expression_in_move_b626);
			expression31=expression();
			state._fsp--;

			e =new Move_Backward(expression31,turtle);
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:107:3: color returns [Evaluator e] : PENCOLOR a= expression COMMA b= expression COMMA c= expression COMMA d= expression ;
	public final Evaluator color() throws RecognitionException {
		Evaluator e = null;


		Evaluator a =null;
		Evaluator b =null;
		Evaluator c =null;
		Evaluator d =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:108:3: ( PENCOLOR a= expression COMMA b= expression COMMA c= expression COMMA d= expression )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:108:4: PENCOLOR a= expression COMMA b= expression COMMA c= expression COMMA d= expression
			{
			match(input,PENCOLOR,FOLLOW_PENCOLOR_in_color652); 
			pushFollow(FOLLOW_expression_in_color656);
			a=expression();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_color658); 
			pushFollow(FOLLOW_expression_in_color662);
			b=expression();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_color664); 
			pushFollow(FOLLOW_expression_in_color668);
			c=expression();
			state._fsp--;

			match(input,COMMA,FOLLOW_COMMA_in_color670); 
			pushFollow(FOLLOW_expression_in_color674);
			d=expression();
			state._fsp--;

			e =new Pen_Color (a,b,c,d,turtle);
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:111:3: imprime returns [Evaluator e] : ( PRINT QUOT expression QUOT | PRINT QUOT_O expression QUOT_C | PRINT expression );
	public final Evaluator imprime() throws RecognitionException {
		Evaluator e = null;


		Evaluator expression32 =null;
		Evaluator expression33 =null;
		Evaluator expression34 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:112:3: ( PRINT QUOT expression QUOT | PRINT QUOT_O expression QUOT_C | PRINT expression )
			int alt13=3;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==PRINT) ) {
				switch ( input.LA(2) ) {
				case QUOT:
					{
					alt13=1;
					}
					break;
				case QUOT_O:
					{
					alt13=2;
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
					alt13=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:112:4: PRINT QUOT expression QUOT
					{
					match(input,PRINT,FOLLOW_PRINT_in_imprime696); 
					match(input,QUOT,FOLLOW_QUOT_in_imprime698); 
					pushFollow(FOLLOW_expression_in_imprime700);
					expression32=expression();
					state._fsp--;

					match(input,QUOT,FOLLOW_QUOT_in_imprime702); 
					e =new Imprimir(expression32);
					}
					break;
				case 2 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:113:4: PRINT QUOT_O expression QUOT_C
					{
					match(input,PRINT,FOLLOW_PRINT_in_imprime709); 
					match(input,QUOT_O,FOLLOW_QUOT_O_in_imprime711); 
					pushFollow(FOLLOW_expression_in_imprime713);
					expression33=expression();
					state._fsp--;

					match(input,QUOT_C,FOLLOW_QUOT_C_in_imprime715); 
					e =new Imprimir(expression33);
					}
					break;
				case 3 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:114:4: PRINT expression
					{
					match(input,PRINT,FOLLOW_PRINT_in_imprime722); 
					pushFollow(FOLLOW_expression_in_imprime724);
					expression34=expression();
					state._fsp--;

					e =new Imprimir(expression34);
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:117:3: term returns [Evaluator e] : ( PAR_O expression PAR_C | NUMBER | FLOTANTE | ID | ID PAR_O paramLlamada PAR_C | STRING | STR );
	public final Evaluator term() throws RecognitionException {
		Evaluator e = null;


		Token NUMBER36=null;
		Token FLOTANTE37=null;
		Token ID38=null;
		Token ID39=null;
		Token STRING41=null;
		Token STR42=null;
		Evaluator expression35 =null;
		List<Evaluator> paramLlamada40 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:118:3: ( PAR_O expression PAR_C | NUMBER | FLOTANTE | ID | ID PAR_O paramLlamada PAR_C | STRING | STR )
			int alt14=7;
			switch ( input.LA(1) ) {
			case PAR_O:
				{
				alt14=1;
				}
				break;
			case NUMBER:
				{
				alt14=2;
				}
				break;
			case FLOTANTE:
				{
				alt14=3;
				}
				break;
			case ID:
				{
				int LA14_4 = input.LA(2);
				if ( (LA14_4==PAR_O) ) {
					alt14=5;
				}
				else if ( (LA14_4==EOF||LA14_4==AND||LA14_4==COMMA||(LA14_4 >= DECLARATION && LA14_4 <= DIVI)||(LA14_4 >= ENDF && LA14_4 <= EQUAL)||(LA14_4 >= ID && LA14_4 <= MULT)||(LA14_4 >= OR && LA14_4 <= PAR_C)||(LA14_4 >= PENCOLOR && LA14_4 <= QUOT_C)||(LA14_4 >= REST && LA14_4 <= ROTATE_R)||LA14_4==SUM) ) {
					alt14=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING:
				{
				alt14=6;
				}
				break;
			case STR:
				{
				alt14=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:118:4: PAR_O expression PAR_C
					{
					match(input,PAR_O,FOLLOW_PAR_O_in_term743); 
					pushFollow(FOLLOW_expression_in_term745);
					expression35=expression();
					state._fsp--;

					match(input,PAR_C,FOLLOW_PAR_C_in_term747); 
					e =expression35;
					}
					break;
				case 2 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:119:4: NUMBER
					{
					NUMBER36=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_term754); 
					e =new Numeros(Integer.parseInt(NUMBER36.getText()));
					}
					break;
				case 3 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:120:4: FLOTANTE
					{
					FLOTANTE37=(Token)match(input,FLOTANTE,FOLLOW_FLOTANTE_in_term762); 
					e =new Floatt(Float.parseFloat(FLOTANTE37.getText()));
					}
					break;
				case 4 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:121:4: ID
					{
					ID38=(Token)match(input,ID,FOLLOW_ID_in_term769); 
					e =new Variable(ID38.getText());
					}
					break;
				case 5 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:122:4: ID PAR_O paramLlamada PAR_C
					{
					ID39=(Token)match(input,ID,FOLLOW_ID_in_term776); 
					match(input,PAR_O,FOLLOW_PAR_O_in_term778); 
					pushFollow(FOLLOW_paramLlamada_in_term780);
					paramLlamada40=paramLlamada();
					state._fsp--;

					match(input,PAR_C,FOLLOW_PAR_C_in_term782); 
					e =new Funcion(ID39.getText(),paramLlamada40);
					}
					break;
				case 6 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:123:4: STRING
					{
					STRING41=(Token)match(input,STRING,FOLLOW_STRING_in_term789); 
					e =new Sttring(STRING41.getText());
					}
					break;
				case 7 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:124:4: STR
					{
					STR42=(Token)match(input,STR,FOLLOW_STR_in_term796); 
					e =new Sttring(STR42.getText());
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:127:3: unary returns [Evaluator e] : ( SUM | REST )* term ;
	public final Evaluator unary() throws RecognitionException {
		Evaluator e = null;


		Evaluator term43 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:128:3: ( ( SUM | REST )* term )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:128:5: ( SUM | REST )* term
			{
			boolean bandera=true;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:129:3: ( SUM | REST )*
			loop15:
			while (true) {
				int alt15=3;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==SUM) ) {
					alt15=1;
				}
				else if ( (LA15_0==REST) ) {
					alt15=2;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:129:4: SUM
					{
					match(input,SUM,FOLLOW_SUM_in_unary826); 
					}
					break;
				case 2 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:129:8: REST
					{
					match(input,REST,FOLLOW_REST_in_unary828); 
					bandera = !bandera;
					}
					break;

				default :
					break loop15;
				}
			}

			pushFollow(FOLLOW_term_in_unary833);
			term43=term();
			state._fsp--;

			e =term43;
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:136:3: mult returns [Evaluator e] : fact= unary ( ( MULT op2= unary | DIVI op2= unary ) )* ;
	public final Evaluator mult() throws RecognitionException {
		Evaluator e = null;


		Evaluator fact =null;
		Evaluator op2 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:137:3: (fact= unary ( ( MULT op2= unary | DIVI op2= unary ) )* )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:137:5: fact= unary ( ( MULT op2= unary | DIVI op2= unary ) )*
			{
			pushFollow(FOLLOW_unary_in_mult860);
			fact=unary();
			state._fsp--;

			e =fact;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:138:3: ( ( MULT op2= unary | DIVI op2= unary ) )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==DIVI||LA17_0==MULT) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:138:4: ( MULT op2= unary | DIVI op2= unary )
					{
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:138:4: ( MULT op2= unary | DIVI op2= unary )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==MULT) ) {
						alt16=1;
					}
					else if ( (LA16_0==DIVI) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:138:5: MULT op2= unary
							{
							match(input,MULT,FOLLOW_MULT_in_mult868); 
							pushFollow(FOLLOW_unary_in_mult872);
							op2=unary();
							state._fsp--;

							e =new Multlp(e,op2);
							}
							break;
						case 2 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:139:4: DIVI op2= unary
							{
							match(input,DIVI,FOLLOW_DIVI_in_mult878); 
							pushFollow(FOLLOW_unary_in_mult882);
							op2=unary();
							state._fsp--;

							e =new Div(e,op2);
							}
							break;

					}

					}
					break;

				default :
					break loop17;
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:143:3: adition returns [Evaluator e] : op1= mult ( ( SUM op2= mult | REST op2= mult ) )* ;
	public final Evaluator adition() throws RecognitionException {
		Evaluator e = null;


		Evaluator op1 =null;
		Evaluator op2 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:144:3: (op1= mult ( ( SUM op2= mult | REST op2= mult ) )* )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:144:5: op1= mult ( ( SUM op2= mult | REST op2= mult ) )*
			{
			pushFollow(FOLLOW_mult_in_adition912);
			op1=mult();
			state._fsp--;

			e =op1;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:145:3: ( ( SUM op2= mult | REST op2= mult ) )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==REST||LA19_0==SUM) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:145:4: ( SUM op2= mult | REST op2= mult )
					{
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:145:4: ( SUM op2= mult | REST op2= mult )
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==SUM) ) {
						alt18=1;
					}
					else if ( (LA18_0==REST) ) {
						alt18=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:145:5: SUM op2= mult
							{
							match(input,SUM,FOLLOW_SUM_in_adition919); 
							pushFollow(FOLLOW_mult_in_adition923);
							op2=mult();
							state._fsp--;

							e =new Suma(e,op2);
							}
							break;
						case 2 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:146:4: REST op2= mult
							{
							match(input,REST,FOLLOW_REST_in_adition929); 
							pushFollow(FOLLOW_mult_in_adition933);
							op2=mult();
							state._fsp--;

							e =new Resta(e,op2);
							}
							break;

					}

					}
					break;

				default :
					break loop19;
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:150:3: relation returns [Evaluator e] : op1= adition ( ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition ) )* ;
	public final Evaluator relation() throws RecognitionException {
		Evaluator e = null;


		Evaluator op1 =null;
		Evaluator op2 =null;
		Evaluator ops =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:151:3: (op1= adition ( ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition ) )* )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:151:5: op1= adition ( ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition ) )*
			{
			pushFollow(FOLLOW_adition_in_relation965);
			op1=adition();
			state._fsp--;

			e =op1;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:152:3: ( ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition ) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==DIFFERENT||LA21_0==EQUAL||(LA21_0 >= MAX_E_THAN && LA21_0 <= MAX_THAN)||(LA21_0 >= MIN_E_THAN && LA21_0 <= MIN_THAN)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:152:4: ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition )
					{
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:152:4: ( EQUAL op2= adition | DIFFERENT op2= adition | MIN_THAN op2= adition | MIN_E_THAN op2= adition | MAX_E_THAN op2= adition | MAX_THAN ops= adition )
					int alt20=6;
					switch ( input.LA(1) ) {
					case EQUAL:
						{
						alt20=1;
						}
						break;
					case DIFFERENT:
						{
						alt20=2;
						}
						break;
					case MIN_THAN:
						{
						alt20=3;
						}
						break;
					case MIN_E_THAN:
						{
						alt20=4;
						}
						break;
					case MAX_E_THAN:
						{
						alt20=5;
						}
						break;
					case MAX_THAN:
						{
						alt20=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}
					switch (alt20) {
						case 1 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:152:5: EQUAL op2= adition
							{
							match(input,EQUAL,FOLLOW_EQUAL_in_relation972); 
							pushFollow(FOLLOW_adition_in_relation976);
							op2=adition();
							state._fsp--;

							e =new Equals (e,op2);
							}
							break;
						case 2 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:153:4: DIFFERENT op2= adition
							{
							match(input,DIFFERENT,FOLLOW_DIFFERENT_in_relation982); 
							pushFollow(FOLLOW_adition_in_relation986);
							op2=adition();
							state._fsp--;

							e =new Different(e,op2);
							}
							break;
						case 3 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:154:4: MIN_THAN op2= adition
							{
							match(input,MIN_THAN,FOLLOW_MIN_THAN_in_relation992); 
							pushFollow(FOLLOW_adition_in_relation996);
							op2=adition();
							state._fsp--;

							e =new MinThan(e,op2);
							}
							break;
						case 4 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:155:4: MIN_E_THAN op2= adition
							{
							match(input,MIN_E_THAN,FOLLOW_MIN_E_THAN_in_relation1002); 
							pushFollow(FOLLOW_adition_in_relation1006);
							op2=adition();
							state._fsp--;

							e =new MinEThan(e,op2);
							}
							break;
						case 5 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:156:4: MAX_E_THAN op2= adition
							{
							match(input,MAX_E_THAN,FOLLOW_MAX_E_THAN_in_relation1012); 
							pushFollow(FOLLOW_adition_in_relation1016);
							op2=adition();
							state._fsp--;

							e =new MaxEThan(e,op2);
							}
							break;
						case 6 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:157:4: MAX_THAN ops= adition
							{
							match(input,MAX_THAN,FOLLOW_MAX_THAN_in_relation1022); 
							pushFollow(FOLLOW_adition_in_relation1026);
							ops=adition();
							state._fsp--;

							e =new MaxThan(e,op2);
							}
							break;

					}

					}
					break;

				default :
					break loop21;
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
	// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:161:3: expression returns [Evaluator e] : op1= relation ( ( AND op2= relation | OR op2= relation ) )* ;
	public final Evaluator expression() throws RecognitionException {
		Evaluator e = null;


		Evaluator op1 =null;
		Evaluator op2 =null;

		try {
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:162:3: (op1= relation ( ( AND op2= relation | OR op2= relation ) )* )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:162:5: op1= relation ( ( AND op2= relation | OR op2= relation ) )*
			{
			pushFollow(FOLLOW_relation_in_expression1057);
			op1=relation();
			state._fsp--;

			e =op1;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:163:3: ( ( AND op2= relation | OR op2= relation ) )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==AND||LA23_0==OR) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:163:4: ( AND op2= relation | OR op2= relation )
					{
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:163:4: ( AND op2= relation | OR op2= relation )
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==AND) ) {
						alt22=1;
					}
					else if ( (LA22_0==OR) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}

					switch (alt22) {
						case 1 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:163:5: AND op2= relation
							{
							match(input,AND,FOLLOW_AND_in_expression1065); 
							pushFollow(FOLLOW_relation_in_expression1069);
							op2=relation();
							state._fsp--;

							e =new And(e,op2);
							}
							break;
						case 2 :
							// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:164:4: OR op2= relation
							{
							match(input,OR,FOLLOW_OR_in_expression1075); 
							pushFollow(FOLLOW_relation_in_expression1079);
							op2=relation();
							state._fsp--;

							e =new Or(e,op2);
							}
							break;

					}

					}
					break;

				default :
					break loop23;
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



	public static final BitSet FOLLOW_func_in_program54 = new BitSet(new long[]{0x0000306032700200L});
	public static final BitSet FOLLOW_command_in_program63 = new BitSet(new long[]{0x0000306032600202L});
	public static final BitSet FOLLOW_FUNC_in_func94 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_func96 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_PAR_O_in_func98 = new BitSet(new long[]{0x0000000800000200L});
	public static final BitSet FOLLOW_param_in_func100 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_C_in_func102 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DOSP_in_func104 = new BitSet(new long[]{0x0000386032608200L});
	public static final BitSet FOLLOW_command_in_func109 = new BitSet(new long[]{0x0000386032608200L});
	public static final BitSet FOLLOW_retorno_in_func116 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ENDF_in_func122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_declaF146 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_PAR_O_in_declaF148 = new BitSet(new long[]{0x0001C41A00280000L});
	public static final BitSet FOLLOW_paramLlamada_in_declaF150 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_C_in_declaF152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_paramLlamada185 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_paramLlamada189 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_paramLlamada193 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_DECLARATION_in_param227 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_param231 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_param237 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_DECLARATION_in_param239 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_param243 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_RETORNO_in_retorno274 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_retorno276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIENTRAS_in_ciclo312 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_PAR_O_in_ciclo314 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_ciclo316 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_C_in_ciclo318 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DO_in_ciclo320 = new BitSet(new long[]{0x0000306032600200L});
	public static final BitSet FOLLOW_command_in_ciclo327 = new BitSet(new long[]{0x0000306032620200L});
	public static final BitSet FOLLOW_ENDWHILE_in_ciclo336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_conditional362 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_PAR_O_in_conditional364 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_conditional366 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_C_in_conditional368 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_THEN_in_conditional370 = new BitSet(new long[]{0x0000306032600200L});
	public static final BitSet FOLLOW_command_in_conditional375 = new BitSet(new long[]{0x0000306032610200L});
	public static final BitSet FOLLOW_ENDIF_in_conditional383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ciclo_in_command406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_command415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turn_r_in_command424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turn_l_in_command433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_move_f_in_command442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_move_b_in_command451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declara_in_command460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaF_in_command469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_color_in_command478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_imprime_in_command487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLARATION_in_declara509 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_declara511 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_declara513 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_declara515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_declara522 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_declara524 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_declara526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROTATE_R_in_turn_r548 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_turn_r550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROTATE_L_in_turn_l572 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_turn_l574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOVE_F_in_move_f598 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_move_f600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOVE_B_in_move_b624 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_move_b626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PENCOLOR_in_color652 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_color656 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_color658 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_color662 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_color664 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_color668 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_color670 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_color674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_imprime696 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_QUOT_in_imprime698 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_imprime700 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_QUOT_in_imprime702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_imprime709 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_QUOT_O_in_imprime711 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_imprime713 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_QUOT_C_in_imprime715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_imprime722 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_imprime724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAR_O_in_term743 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_expression_in_term745 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_C_in_term747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_term754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOTANTE_in_term762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_term769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_term776 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_PAR_O_in_term778 = new BitSet(new long[]{0x0001C41A00280000L});
	public static final BitSet FOLLOW_paramLlamada_in_term780 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_PAR_C_in_term782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_term789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_term796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUM_in_unary826 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_REST_in_unary828 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_term_in_unary833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult860 = new BitSet(new long[]{0x0000000040000802L});
	public static final BitSet FOLLOW_MULT_in_mult868 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_unary_in_mult872 = new BitSet(new long[]{0x0000000040000802L});
	public static final BitSet FOLLOW_DIVI_in_mult878 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_unary_in_mult882 = new BitSet(new long[]{0x0000000040000802L});
	public static final BitSet FOLLOW_mult_in_adition912 = new BitSet(new long[]{0x0001040000000002L});
	public static final BitSet FOLLOW_SUM_in_adition919 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_mult_in_adition923 = new BitSet(new long[]{0x0001040000000002L});
	public static final BitSet FOLLOW_REST_in_adition929 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_mult_in_adition933 = new BitSet(new long[]{0x0001040000000002L});
	public static final BitSet FOLLOW_adition_in_relation965 = new BitSet(new long[]{0x000000000D840402L});
	public static final BitSet FOLLOW_EQUAL_in_relation972 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_adition_in_relation976 = new BitSet(new long[]{0x000000000D840402L});
	public static final BitSet FOLLOW_DIFFERENT_in_relation982 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_adition_in_relation986 = new BitSet(new long[]{0x000000000D840402L});
	public static final BitSet FOLLOW_MIN_THAN_in_relation992 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_adition_in_relation996 = new BitSet(new long[]{0x000000000D840402L});
	public static final BitSet FOLLOW_MIN_E_THAN_in_relation1002 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_adition_in_relation1006 = new BitSet(new long[]{0x000000000D840402L});
	public static final BitSet FOLLOW_MAX_E_THAN_in_relation1012 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_adition_in_relation1016 = new BitSet(new long[]{0x000000000D840402L});
	public static final BitSet FOLLOW_MAX_THAN_in_relation1022 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_adition_in_relation1026 = new BitSet(new long[]{0x000000000D840402L});
	public static final BitSet FOLLOW_relation_in_expression1057 = new BitSet(new long[]{0x0000000400000012L});
	public static final BitSet FOLLOW_AND_in_expression1065 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_relation_in_expression1069 = new BitSet(new long[]{0x0000000400000012L});
	public static final BitSet FOLLOW_OR_in_expression1075 = new BitSet(new long[]{0x0001C41200280000L});
	public static final BitSet FOLLOW_relation_in_expression1079 = new BitSet(new long[]{0x0000000400000012L});
}
