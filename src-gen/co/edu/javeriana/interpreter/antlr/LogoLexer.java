// $ANTLR 3.5 C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g 2016-05-02 00:15:13

package co.edu.javeriana.interpreter.antlr;  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LogoLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LogoLexer() {} 
	public LogoLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LogoLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:168:4: ( ( '&&' ) )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:168:6: ( '&&' )
			{
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:168:6: ( '&&' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:168:7: '&&'
			{
			match("&&"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:169:3: ( ( '||' ) )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:169:5: ( '||' )
			{
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:169:5: ( '||' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:169:6: '||'
			{
			match("||"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:170:4: ( ( 'not' ) )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:170:6: ( 'not' )
			{
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:170:6: ( 'not' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:170:7: 'not'
			{
			match("not"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:171:7: ( '=' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:171:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:172:6: ( '==' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:172:7: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "DIFFERENT"
	public final void mDIFFERENT() throws RecognitionException {
		try {
			int _type = DIFFERENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:173:10: ( '!=' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:173:11: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIFFERENT"

	// $ANTLR start "SUM"
	public final void mSUM() throws RecognitionException {
		try {
			int _type = SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:174:4: ( '+' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:174:6: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUM"

	// $ANTLR start "REST"
	public final void mREST() throws RecognitionException {
		try {
			int _type = REST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:175:5: ( '-' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:175:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REST"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:176:5: ( '*' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:176:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIVI"
	public final void mDIVI() throws RecognitionException {
		try {
			int _type = DIVI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:177:5: ( '/' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:177:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVI"

	// $ANTLR start "MIN_E_THAN"
	public final void mMIN_E_THAN() throws RecognitionException {
		try {
			int _type = MIN_E_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:178:11: ( '<=' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:178:13: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN_E_THAN"

	// $ANTLR start "MIN_THAN"
	public final void mMIN_THAN() throws RecognitionException {
		try {
			int _type = MIN_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:179:9: ( '<' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:179:11: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN_THAN"

	// $ANTLR start "MAX_E_THAN"
	public final void mMAX_E_THAN() throws RecognitionException {
		try {
			int _type = MAX_E_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:180:11: ( '>=' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:180:13: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAX_E_THAN"

	// $ANTLR start "MAX_THAN"
	public final void mMAX_THAN() throws RecognitionException {
		try {
			int _type = MAX_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:181:9: ( '>' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:181:11: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAX_THAN"

	// $ANTLR start "NEGA"
	public final void mNEGA() throws RecognitionException {
		try {
			int _type = NEGA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:182:5: ( '!' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:182:6: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEGA"

	// $ANTLR start "PAR_O"
	public final void mPAR_O() throws RecognitionException {
		try {
			int _type = PAR_O;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:183:6: ( '(' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:183:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAR_O"

	// $ANTLR start "PAR_C"
	public final void mPAR_C() throws RecognitionException {
		try {
			int _type = PAR_C;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:184:6: ( ')' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:184:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAR_C"

	// $ANTLR start "CORCH_O"
	public final void mCORCH_O() throws RecognitionException {
		try {
			int _type = CORCH_O;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:185:8: ( '{' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:185:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CORCH_O"

	// $ANTLR start "CORCH_C"
	public final void mCORCH_C() throws RecognitionException {
		try {
			int _type = CORCH_C;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:186:8: ( '}' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:186:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CORCH_C"

	// $ANTLR start "QUOT"
	public final void mQUOT() throws RecognitionException {
		try {
			int _type = QUOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:187:5: ( '\"' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:187:6: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOT"

	// $ANTLR start "QUOT_O"
	public final void mQUOT_O() throws RecognitionException {
		try {
			int _type = QUOT_O;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:188:7: ( '“' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:188:8: '“'
			{
			match('\u201C'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOT_O"

	// $ANTLR start "QUOT_C"
	public final void mQUOT_C() throws RecognitionException {
		try {
			int _type = QUOT_C;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:189:7: ( '”' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:189:8: '”'
			{
			match('\u201D'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOT_C"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:190:3: ( 'if' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:190:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:191:5: ( 'then' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:191:7: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:192:5: ( 'else' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:192:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ENDWHILE"
	public final void mENDWHILE() throws RecognitionException {
		try {
			int _type = ENDWHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:193:9: ( 'endwhile' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:193:11: 'endwhile'
			{
			match("endwhile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDWHILE"

	// $ANTLR start "ENDF"
	public final void mENDF() throws RecognitionException {
		try {
			int _type = ENDF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:194:5: ( 'endfunction' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:194:7: 'endfunction'
			{
			match("endfunction"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDF"

	// $ANTLR start "ENDIF"
	public final void mENDIF() throws RecognitionException {
		try {
			int _type = ENDIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:195:6: ( 'endif' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:195:8: 'endif'
			{
			match("endif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDIF"

	// $ANTLR start "RETORNO"
	public final void mRETORNO() throws RecognitionException {
		try {
			int _type = RETORNO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:196:8: ( 'return' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:196:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETORNO"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:197:7: ( ( '0' .. '9' )* )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:197:9: ( '0' .. '9' )*
			{
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:197:9: ( '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "FLOTANTE"
	public final void mFLOTANTE() throws RecognitionException {
		try {
			int _type = FLOTANTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:198:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' ) )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:198:11: ( '0' .. '9' )+ '.' ( '0' .. '9' )
			{
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:198:11: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match('.'); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOTANTE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:199:6: ( ',' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:199:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "DECLARATION"
	public final void mDECLARATION() throws RecognitionException {
		try {
			int _type = DECLARATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:200:12: ( 'var' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:200:14: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECLARATION"

	// $ANTLR start "MOVE_F"
	public final void mMOVE_F() throws RecognitionException {
		try {
			int _type = MOVE_F;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:201:7: ( 'move_forward' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:201:9: 'move_forward'
			{
			match("move_forward"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOVE_F"

	// $ANTLR start "MOVE_B"
	public final void mMOVE_B() throws RecognitionException {
		try {
			int _type = MOVE_B;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:202:7: ( 'move_backward' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:202:9: 'move_backward'
			{
			match("move_backward"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOVE_B"

	// $ANTLR start "ROTATE_L"
	public final void mROTATE_L() throws RecognitionException {
		try {
			int _type = ROTATE_L;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:203:9: ( 'rotate_left' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:203:11: 'rotate_left'
			{
			match("rotate_left"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROTATE_L"

	// $ANTLR start "ROTATE_R"
	public final void mROTATE_R() throws RecognitionException {
		try {
			int _type = ROTATE_R;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:204:9: ( 'rotate_right' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:204:11: 'rotate_right'
			{
			match("rotate_right"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROTATE_R"

	// $ANTLR start "PENCOLOR"
	public final void mPENCOLOR() throws RecognitionException {
		try {
			int _type = PENCOLOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:205:9: ( 'pen_color' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:205:11: 'pen_color'
			{
			match("pen_color"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PENCOLOR"

	// $ANTLR start "FUNC"
	public final void mFUNC() throws RecognitionException {
		try {
			int _type = FUNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:206:5: ( 'function' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:206:7: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNC"

	// $ANTLR start "MIENTRAS"
	public final void mMIENTRAS() throws RecognitionException {
		try {
			int _type = MIENTRAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:207:9: ( 'while' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:207:11: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIENTRAS"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:208:6: ( 'println' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:208:8: 'println'
			{
			match("println"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:209:3: ( 'do' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:209:5: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DOSP"
	public final void mDOSP() throws RecognitionException {
		try {
			int _type = DOSP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:210:5: ( ':' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:210:7: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOSP"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:211:7: ( ( '\"' (~ '\"' )* '\"' ) )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:211:9: ( '\"' (~ '\"' )* '\"' )
			{
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:211:9: ( '\"' (~ '\"' )* '\"' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:211:10: '\"' (~ '\"' )* '\"'
			{
			match('\"'); 
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:211:14: (~ '\"' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			match('\"'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "STR"
	public final void mSTR() throws RecognitionException {
		try {
			int _type = STR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:212:4: ( '\"' ( . )* '\"' )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:212:6: '\"' ( . )* '\"'
			{
			match('\"'); 
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:212:9: ( . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\"') ) {
					alt4=2;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:212:10: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:213:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:213:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:213:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:214:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:214:5: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:8: ( AND | OR | NOT | ASSIGN | EQUAL | DIFFERENT | SUM | REST | MULT | DIVI | MIN_E_THAN | MIN_THAN | MAX_E_THAN | MAX_THAN | NEGA | PAR_O | PAR_C | CORCH_O | CORCH_C | QUOT | QUOT_O | QUOT_C | IF | THEN | ELSE | ENDWHILE | ENDF | ENDIF | RETORNO | NUMBER | FLOTANTE | COMMA | DECLARATION | MOVE_F | MOVE_B | ROTATE_L | ROTATE_R | PENCOLOR | FUNC | MIENTRAS | PRINT | DO | DOSP | STRING | STR | ID | WS )
		int alt6=47;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:14: OR
				{
				mOR(); 

				}
				break;
			case 3 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:17: NOT
				{
				mNOT(); 

				}
				break;
			case 4 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:21: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 5 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:28: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 6 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:34: DIFFERENT
				{
				mDIFFERENT(); 

				}
				break;
			case 7 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:44: SUM
				{
				mSUM(); 

				}
				break;
			case 8 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:48: REST
				{
				mREST(); 

				}
				break;
			case 9 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:53: MULT
				{
				mMULT(); 

				}
				break;
			case 10 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:58: DIVI
				{
				mDIVI(); 

				}
				break;
			case 11 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:63: MIN_E_THAN
				{
				mMIN_E_THAN(); 

				}
				break;
			case 12 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:74: MIN_THAN
				{
				mMIN_THAN(); 

				}
				break;
			case 13 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:83: MAX_E_THAN
				{
				mMAX_E_THAN(); 

				}
				break;
			case 14 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:94: MAX_THAN
				{
				mMAX_THAN(); 

				}
				break;
			case 15 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:103: NEGA
				{
				mNEGA(); 

				}
				break;
			case 16 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:108: PAR_O
				{
				mPAR_O(); 

				}
				break;
			case 17 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:114: PAR_C
				{
				mPAR_C(); 

				}
				break;
			case 18 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:120: CORCH_O
				{
				mCORCH_O(); 

				}
				break;
			case 19 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:128: CORCH_C
				{
				mCORCH_C(); 

				}
				break;
			case 20 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:136: QUOT
				{
				mQUOT(); 

				}
				break;
			case 21 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:141: QUOT_O
				{
				mQUOT_O(); 

				}
				break;
			case 22 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:148: QUOT_C
				{
				mQUOT_C(); 

				}
				break;
			case 23 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:155: IF
				{
				mIF(); 

				}
				break;
			case 24 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:158: THEN
				{
				mTHEN(); 

				}
				break;
			case 25 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:163: ELSE
				{
				mELSE(); 

				}
				break;
			case 26 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:168: ENDWHILE
				{
				mENDWHILE(); 

				}
				break;
			case 27 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:177: ENDF
				{
				mENDF(); 

				}
				break;
			case 28 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:182: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 29 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:188: RETORNO
				{
				mRETORNO(); 

				}
				break;
			case 30 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:196: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 31 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:203: FLOTANTE
				{
				mFLOTANTE(); 

				}
				break;
			case 32 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:212: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 33 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:218: DECLARATION
				{
				mDECLARATION(); 

				}
				break;
			case 34 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:230: MOVE_F
				{
				mMOVE_F(); 

				}
				break;
			case 35 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:237: MOVE_B
				{
				mMOVE_B(); 

				}
				break;
			case 36 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:244: ROTATE_L
				{
				mROTATE_L(); 

				}
				break;
			case 37 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:253: ROTATE_R
				{
				mROTATE_R(); 

				}
				break;
			case 38 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:262: PENCOLOR
				{
				mPENCOLOR(); 

				}
				break;
			case 39 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:271: FUNC
				{
				mFUNC(); 

				}
				break;
			case 40 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:276: MIENTRAS
				{
				mMIENTRAS(); 

				}
				break;
			case 41 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:285: PRINT
				{
				mPRINT(); 

				}
				break;
			case 42 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:291: DO
				{
				mDO(); 

				}
				break;
			case 43 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:294: DOSP
				{
				mDOSP(); 

				}
				break;
			case 44 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:299: STRING
				{
				mSTRING(); 

				}
				break;
			case 45 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:306: STR
				{
				mSTR(); 

				}
				break;
			case 46 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:310: ID
				{
				mID(); 

				}
				break;
			case 47 :
				// C:\\Users\\USER\\workspace-pl\\BasicProject\\bin\\Logo.g:1:313: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\1\30\2\uffff\1\41\1\45\1\47\4\uffff\1\51\1\53\4\uffff\1\54\2\uffff\4"+
		"\41\1\30\2\uffff\6\41\3\uffff\1\41\12\uffff\1\76\1\100\5\41\1\uffff\6"+
		"\41\1\114\1\115\3\uffff\5\41\1\125\5\41\2\uffff\1\133\1\134\5\41\1\uffff"+
		"\5\41\2\uffff\2\41\1\151\6\41\1\161\2\41\1\uffff\1\164\6\41\1\uffff\2"+
		"\41\1\uffff\4\41\1\u0082\1\41\1\u0084\6\41\1\uffff\1\u008b\1\uffff\5\41"+
		"\1\u0091\1\uffff\5\41\1\uffff\1\u0097\1\u0098\3\41\2\uffff\1\u009c\1\u009d"+
		"\1\41\2\uffff\1\u009f\1\uffff";
	static final String DFA6_eofS =
		"\u00a0\uffff";
	static final String DFA6_minS =
		"\1\11\2\uffff\1\157\2\75\4\uffff\2\75\4\uffff\1\0\2\uffff\1\146\1\150"+
		"\1\154\1\145\1\56\2\uffff\1\141\1\157\1\145\1\165\1\150\1\157\3\uffff"+
		"\1\164\11\uffff\2\0\1\60\1\145\1\163\1\144\2\164\1\uffff\1\162\1\166\1"+
		"\156\1\151\1\156\1\151\2\60\3\uffff\1\156\1\145\1\146\1\165\1\141\1\60"+
		"\1\145\1\137\1\156\1\143\1\154\2\uffff\2\60\1\150\1\165\1\146\1\162\1"+
		"\164\1\uffff\1\137\1\143\2\164\1\145\2\uffff\1\151\1\156\1\60\1\156\1"+
		"\145\1\142\1\157\1\154\1\151\1\60\1\154\1\143\1\uffff\1\60\1\137\1\157"+
		"\1\141\1\154\1\156\1\157\1\uffff\1\145\1\164\1\uffff\1\154\1\162\1\143"+
		"\1\157\1\60\1\156\1\60\1\151\1\145\1\151\1\167\1\153\1\162\1\uffff\1\60"+
		"\1\uffff\1\157\1\146\1\147\1\141\1\167\1\60\1\uffff\1\156\1\164\1\150"+
		"\1\162\1\141\1\uffff\2\60\1\164\1\144\1\162\2\uffff\2\60\1\144\2\uffff"+
		"\1\60\1\uffff";
	static final String DFA6_maxS =
		"\1\u201d\2\uffff\1\157\2\75\4\uffff\2\75\4\uffff\1\uffff\2\uffff\1\146"+
		"\1\150\1\156\1\157\1\71\2\uffff\1\141\1\157\1\162\1\165\1\150\1\157\3"+
		"\uffff\1\164\11\uffff\2\uffff\1\172\1\145\1\163\1\144\2\164\1\uffff\1"+
		"\162\1\166\1\156\1\151\1\156\1\151\2\172\3\uffff\1\156\1\145\1\167\1\165"+
		"\1\141\1\172\1\145\1\137\1\156\1\143\1\154\2\uffff\2\172\1\150\1\165\1"+
		"\146\1\162\1\164\1\uffff\1\137\1\143\2\164\1\145\2\uffff\1\151\1\156\1"+
		"\172\1\156\1\145\1\146\1\157\1\154\1\151\1\172\1\154\1\143\1\uffff\1\172"+
		"\1\137\1\157\1\141\1\154\1\156\1\157\1\uffff\1\145\1\164\1\uffff\2\162"+
		"\1\143\1\157\1\172\1\156\1\172\1\151\1\145\1\151\1\167\1\153\1\162\1\uffff"+
		"\1\172\1\uffff\1\157\1\146\1\147\1\141\1\167\1\172\1\uffff\1\156\1\164"+
		"\1\150\1\162\1\141\1\uffff\2\172\1\164\1\144\1\162\2\uffff\2\172\1\144"+
		"\2\uffff\1\172\1\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\1\2\3\uffff\1\7\1\10\1\11\1\12\2\uffff\1\20\1\21\1\22\1\23"+
		"\1\uffff\1\25\1\26\5\uffff\1\36\1\40\6\uffff\1\53\1\56\1\57\1\uffff\1"+
		"\5\1\4\1\6\1\17\1\13\1\14\1\15\1\16\1\24\10\uffff\1\37\10\uffff\1\54\1"+
		"\55\1\27\13\uffff\1\52\1\3\7\uffff\1\41\5\uffff\1\30\1\31\14\uffff\1\34"+
		"\7\uffff\1\50\2\uffff\1\35\15\uffff\1\51\1\uffff\1\32\6\uffff\1\47\5\uffff"+
		"\1\46\5\uffff\1\33\1\44\3\uffff\1\45\1\42\1\uffff\1\43";
	static final String DFA6_specialS =
		"\20\uffff\1\1\34\uffff\1\0\1\2\161\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\42\2\uffff\1\42\22\uffff\1\42\1\5\1\20\3\uffff\1\1\1\uffff\1\14\1"+
			"\15\1\10\1\6\1\31\1\7\1\uffff\1\11\12\27\1\40\1\uffff\1\12\1\4\1\13\2"+
			"\uffff\32\41\4\uffff\1\41\1\uffff\3\41\1\37\1\25\1\35\2\41\1\23\3\41"+
			"\1\33\1\3\1\41\1\34\1\41\1\26\1\41\1\24\1\41\1\32\1\36\3\41\1\16\1\2"+
			"\1\17\u1f9e\uffff\1\21\1\22",
			"",
			"",
			"\1\43",
			"\1\44",
			"\1\46",
			"",
			"",
			"",
			"",
			"\1\50",
			"\1\52",
			"",
			"",
			"",
			"",
			"\42\55\1\56\uffdd\55",
			"",
			"",
			"\1\57",
			"\1\60",
			"\1\61\1\uffff\1\62",
			"\1\63\11\uffff\1\64",
			"\1\65\1\uffff\12\27",
			"",
			"",
			"\1\66",
			"\1\67",
			"\1\70\14\uffff\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"",
			"",
			"",
			"\1\75",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\42\55\1\56\uffdd\55",
			"\0\77",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"",
			"\1\116",
			"\1\117",
			"\1\121\2\uffff\1\122\15\uffff\1\120",
			"\1\123",
			"\1\124",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"",
			"",
			"\1\147",
			"\1\150",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\152",
			"\1\153",
			"\1\155\3\uffff\1\154",
			"\1\156",
			"\1\157",
			"\1\160",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\162",
			"\1\163",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"",
			"\1\173",
			"\1\174",
			"",
			"\1\175\5\uffff\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u0083",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u009e",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | OR | NOT | ASSIGN | EQUAL | DIFFERENT | SUM | REST | MULT | DIVI | MIN_E_THAN | MIN_THAN | MAX_E_THAN | MAX_THAN | NEGA | PAR_O | PAR_C | CORCH_O | CORCH_C | QUOT | QUOT_O | QUOT_C | IF | THEN | ELSE | ENDWHILE | ENDF | ENDIF | RETORNO | NUMBER | FLOTANTE | COMMA | DECLARATION | MOVE_F | MOVE_B | ROTATE_L | ROTATE_R | PENCOLOR | FUNC | MIENTRAS | PRINT | DO | DOSP | STRING | STR | ID | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_45 = input.LA(1);
						s = -1;
						if ( (LA6_45=='\"') ) {s = 46;}
						else if ( ((LA6_45 >= '\u0000' && LA6_45 <= '!')||(LA6_45 >= '#' && LA6_45 <= '\uFFFF')) ) {s = 45;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA6_16 = input.LA(1);
						s = -1;
						if ( ((LA6_16 >= '\u0000' && LA6_16 <= '!')||(LA6_16 >= '#' && LA6_16 <= '\uFFFF')) ) {s = 45;}
						else if ( (LA6_16=='\"') ) {s = 46;}
						else s = 44;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA6_46 = input.LA(1);
						s = -1;
						if ( ((LA6_46 >= '\u0000' && LA6_46 <= '\uFFFF')) ) {s = 63;}
						else s = 62;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 6, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
