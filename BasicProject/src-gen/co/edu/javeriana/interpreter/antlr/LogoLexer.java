// $ANTLR 3.5 C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g 2016-04-28 17:09:16

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
	@Override public String getGrammarFileName() { return "C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:172:4: ( ( '&&' ) )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:172:6: ( '&&' )
			{
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:172:6: ( '&&' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:172:7: '&&'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:173:3: ( ( '||' ) )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:173:5: ( '||' )
			{
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:173:5: ( '||' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:173:6: '||'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:174:4: ( ( 'not' ) )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:174:6: ( 'not' )
			{
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:174:6: ( 'not' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:174:7: 'not'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:175:7: ( '=' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:175:9: '='
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:176:6: ( '==' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:176:7: '=='
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:177:10: ( '!=' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:177:11: '!='
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:178:4: ( '+' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:178:6: '+'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:179:5: ( '-' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:179:7: '-'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:180:5: ( '*' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:180:7: '*'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:181:5: ( '/' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:181:7: '/'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:182:11: ( '<=' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:182:13: '<='
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:183:9: ( '<' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:183:11: '<'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:184:11: ( '>=' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:184:13: '>='
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:185:9: ( '>' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:185:11: '>'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:186:5: ( '!' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:186:6: '!'
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

	// $ANTLR start "DOSP"
	public final void mDOSP() throws RecognitionException {
		try {
			int _type = DOSP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:187:5: ( ':' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:187:7: ':'
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

	// $ANTLR start "PAR_O"
	public final void mPAR_O() throws RecognitionException {
		try {
			int _type = PAR_O;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:188:6: ( '(' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:188:8: '('
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:189:6: ( ')' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:189:8: ')'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:190:8: ( '{' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:190:10: '{'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:191:8: ( '}' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:191:10: '}'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:192:5: ( '\"' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:192:6: '\"'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:193:7: ( '“' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:193:8: '“'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:194:7: ( '”' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:194:8: '”'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:195:3: ( 'if' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:195:5: 'if'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:196:5: ( 'then' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:196:7: 'then'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:197:5: ( 'else' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:197:7: 'else'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:198:9: ( 'endwhile' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:198:11: 'endwhile'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:199:5: ( 'endfunction' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:199:7: 'endfunction'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:200:6: ( 'endif' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:200:8: 'endif'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:201:8: ( 'return' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:201:10: 'return'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:202:7: ( ( '0' .. '9' )+ )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:202:9: ( '0' .. '9' )+
			{
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:202:9: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:203:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' ) )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:203:11: ( '0' .. '9' )+ '.' ( '0' .. '9' )
			{
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:203:11: ( '0' .. '9' )+
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
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:204:6: ( ',' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:204:8: ','
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:205:12: ( 'var' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:205:14: 'var'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:206:7: ( 'move_forward' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:206:9: 'move_forward'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:207:7: ( 'move_backward' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:207:9: 'move_backward'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:208:9: ( 'rotate_left' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:208:11: 'rotate_left'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:209:9: ( 'rotate_right' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:209:11: 'rotate_right'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:210:9: ( 'pen_color' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:210:11: 'pen_color'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:211:5: ( 'function' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:211:7: 'function'
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

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:212:6: ( 'while' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:212:8: 'while'
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
	// $ANTLR end "WHILE"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:213:6: ( 'println' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:213:8: 'println'
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:214:3: ( 'do' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:214:5: 'do'
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

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:215:7: ( ( '\"' (~ '\"' )* '\"' ) )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:215:9: ( '\"' (~ '\"' )* '\"' )
			{
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:215:9: ( '\"' (~ '\"' )* '\"' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:215:10: '\"' (~ '\"' )* '\"'
			{
			match('\"'); 
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:215:14: (~ '\"' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:216:4: ( '\"' ( . )* '\"' )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:216:6: '\"' ( . )* '\"'
			{
			match('\"'); 
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:216:9: ( . )*
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
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:216:10: .
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:217:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ ( '0' .. '9' )+ )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:217:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ ( '0' .. '9' )+
			{
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:217:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:217:29: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:218:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:218:5: ( ' ' | '\\t' | '\\r' | '\\n' )
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
		// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:8: ( AND | OR | NOT | ASSIGN | EQUAL | DIFFERENT | SUM | REST | MULT | DIVI | MIN_E_THAN | MIN_THAN | MAX_E_THAN | MAX_THAN | NEGA | DOSP | PAR_O | PAR_C | CORCH_O | CORCH_C | QUOT | QUOT_O | QUOT_C | IF | THEN | ELSE | ENDWHILE | ENDF | ENDIF | RETORNO | NUMBER | FLOTANTE | COMMA | DECLARATION | MOVE_F | MOVE_B | ROTATE_L | ROTATE_R | PENCOLOR | FUNC | WHILE | PRINT | DO | STRING | STR | ID | WS )
		int alt7=47;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:14: OR
				{
				mOR(); 

				}
				break;
			case 3 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:17: NOT
				{
				mNOT(); 

				}
				break;
			case 4 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:21: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 5 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:28: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 6 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:34: DIFFERENT
				{
				mDIFFERENT(); 

				}
				break;
			case 7 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:44: SUM
				{
				mSUM(); 

				}
				break;
			case 8 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:48: REST
				{
				mREST(); 

				}
				break;
			case 9 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:53: MULT
				{
				mMULT(); 

				}
				break;
			case 10 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:58: DIVI
				{
				mDIVI(); 

				}
				break;
			case 11 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:63: MIN_E_THAN
				{
				mMIN_E_THAN(); 

				}
				break;
			case 12 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:74: MIN_THAN
				{
				mMIN_THAN(); 

				}
				break;
			case 13 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:83: MAX_E_THAN
				{
				mMAX_E_THAN(); 

				}
				break;
			case 14 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:94: MAX_THAN
				{
				mMAX_THAN(); 

				}
				break;
			case 15 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:103: NEGA
				{
				mNEGA(); 

				}
				break;
			case 16 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:108: DOSP
				{
				mDOSP(); 

				}
				break;
			case 17 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:113: PAR_O
				{
				mPAR_O(); 

				}
				break;
			case 18 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:119: PAR_C
				{
				mPAR_C(); 

				}
				break;
			case 19 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:125: CORCH_O
				{
				mCORCH_O(); 

				}
				break;
			case 20 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:133: CORCH_C
				{
				mCORCH_C(); 

				}
				break;
			case 21 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:141: QUOT
				{
				mQUOT(); 

				}
				break;
			case 22 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:146: QUOT_O
				{
				mQUOT_O(); 

				}
				break;
			case 23 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:153: QUOT_C
				{
				mQUOT_C(); 

				}
				break;
			case 24 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:160: IF
				{
				mIF(); 

				}
				break;
			case 25 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:163: THEN
				{
				mTHEN(); 

				}
				break;
			case 26 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:168: ELSE
				{
				mELSE(); 

				}
				break;
			case 27 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:173: ENDWHILE
				{
				mENDWHILE(); 

				}
				break;
			case 28 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:182: ENDF
				{
				mENDF(); 

				}
				break;
			case 29 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:187: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 30 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:193: RETORNO
				{
				mRETORNO(); 

				}
				break;
			case 31 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:201: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 32 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:208: FLOTANTE
				{
				mFLOTANTE(); 

				}
				break;
			case 33 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:217: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 34 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:223: DECLARATION
				{
				mDECLARATION(); 

				}
				break;
			case 35 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:235: MOVE_F
				{
				mMOVE_F(); 

				}
				break;
			case 36 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:242: MOVE_B
				{
				mMOVE_B(); 

				}
				break;
			case 37 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:249: ROTATE_L
				{
				mROTATE_L(); 

				}
				break;
			case 38 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:258: ROTATE_R
				{
				mROTATE_R(); 

				}
				break;
			case 39 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:267: PENCOLOR
				{
				mPENCOLOR(); 

				}
				break;
			case 40 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:276: FUNC
				{
				mFUNC(); 

				}
				break;
			case 41 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:281: WHILE
				{
				mWHILE(); 

				}
				break;
			case 42 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:287: PRINT
				{
				mPRINT(); 

				}
				break;
			case 43 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:293: DO
				{
				mDO(); 

				}
				break;
			case 44 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:296: STRING
				{
				mSTRING(); 

				}
				break;
			case 45 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:303: STR
				{
				mSTR(); 

				}
				break;
			case 46 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:307: ID
				{
				mID(); 

				}
				break;
			case 47 :
				// C:\\Users\\salaBD\\workspacePL\\BasicProject\\src\\Logo.g:1:310: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\4\uffff\1\44\1\46\4\uffff\1\50\1\52\5\uffff\1\53\6\uffff\1\64\24\uffff"+
		"\1\76\1\100\15\uffff\1\114\1\115\10\uffff\1\125\7\uffff\1\133\1\134\17"+
		"\uffff\1\151\6\uffff\1\161\3\uffff\1\164\16\uffff\1\u0082\1\uffff\1\u0084"+
		"\7\uffff\1\u008b\6\uffff\1\u0091\7\uffff\1\u0097\1\u0098\5\uffff\1\u009c"+
		"\1\u009d\3\uffff\1\u009f\1\uffff";
	static final String DFA7_eofS =
		"\u00a0\uffff";
	static final String DFA7_minS =
		"\1\11\2\uffff\1\60\2\75\4\uffff\2\75\5\uffff\1\0\2\uffff\4\60\1\56\1\uffff"+
		"\6\60\2\uffff\1\60\11\uffff\2\0\6\60\2\uffff\10\60\3\uffff\13\60\2\uffff"+
		"\7\60\1\uffff\5\60\2\uffff\14\60\1\uffff\7\60\1\uffff\2\60\1\uffff\15"+
		"\60\1\uffff\1\60\1\uffff\6\60\1\uffff\5\60\1\uffff\5\60\2\uffff\3\60\2"+
		"\uffff\1\60\1\uffff";
	static final String DFA7_maxS =
		"\1\u201d\2\uffff\1\172\2\75\4\uffff\2\75\5\uffff\1\uffff\2\uffff\4\172"+
		"\1\71\1\uffff\6\172\2\uffff\1\172\11\uffff\2\uffff\6\172\2\uffff\10\172"+
		"\3\uffff\13\172\2\uffff\7\172\1\uffff\5\172\2\uffff\14\172\1\uffff\7\172"+
		"\1\uffff\2\172\1\uffff\15\172\1\uffff\1\172\1\uffff\6\172\1\uffff\5\172"+
		"\1\uffff\5\172\2\uffff\3\172\2\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\3\uffff\1\7\1\10\1\11\1\12\2\uffff\1\20\1\21\1\22\1\23"+
		"\1\24\1\uffff\1\26\1\27\5\uffff\1\41\6\uffff\1\56\1\57\1\uffff\1\5\1\4"+
		"\1\6\1\17\1\13\1\14\1\15\1\16\1\25\10\uffff\1\37\1\40\10\uffff\1\54\1"+
		"\55\1\30\13\uffff\1\53\1\3\7\uffff\1\42\5\uffff\1\31\1\32\14\uffff\1\35"+
		"\7\uffff\1\51\2\uffff\1\36\15\uffff\1\52\1\uffff\1\33\6\uffff\1\50\5\uffff"+
		"\1\47\5\uffff\1\34\1\45\3\uffff\1\46\1\43\1\uffff\1\44";
	static final String DFA7_specialS =
		"\21\uffff\1\0\32\uffff\1\1\1\2\162\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\41\2\uffff\1\41\22\uffff\1\41\1\5\1\21\3\uffff\1\1\1\uffff\1\15\1"+
			"\16\1\10\1\6\1\31\1\7\1\uffff\1\11\12\30\1\14\1\uffff\1\12\1\4\1\13\2"+
			"\uffff\32\40\4\uffff\1\40\1\uffff\3\40\1\37\1\26\1\35\2\40\1\24\3\40"+
			"\1\33\1\3\1\40\1\34\1\40\1\27\1\40\1\25\1\40\1\32\1\36\3\40\1\17\1\2"+
			"\1\20\u1f9e\uffff\1\22\1\23",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\16\40\1\42\13\40",
			"\1\43",
			"\1\45",
			"",
			"",
			"",
			"",
			"\1\47",
			"\1\51",
			"",
			"",
			"",
			"",
			"",
			"\42\54\1\55\uffdd\54",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\5\40\1\56\24\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\7\40\1\57\22\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\60\1\40\1\61\14\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\62\11\40\1\63\13\40",
			"\1\65\1\uffff\12\30",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\1\66\31\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\16\40\1\67\13\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\70\14\40\1\71\10\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\24\40\1\72\5\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\7\40\1\73\22\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\16\40\1\74\13\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\75\6\40",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\42\54\1\55\uffdd\54",
			"\0\77",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\101\25\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\22\40\1\102\7\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\3\40\1\103\26\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\104\6\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\105\6\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\21\40\1\106\10\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\25\40\1\107\4\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\110\14\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\111\21\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\112\14\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\113\21\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\116\14\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\117\25\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\5\40\1\121\2\40\1\122\15\40"+
			"\1\120\3\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\24\40\1\123\5\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\1\124\31\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\126\25\40",
			"\12\40\7\uffff\32\40\4\uffff\1\127\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\130\14\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\2\40\1\131\27\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\132\16\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\7\40\1\135\22\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\24\40\1\136\5\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\5\40\1\137\24\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\21\40\1\140\10\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\141\6\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\142\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\2\40\1\143\27\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\144\6\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\145\6\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\146\25\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\147\21\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\150\14\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\152\14\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\153\25\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\1\40\1\155\3\40\1\154\24\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\16\40\1\156\13\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\157\16\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\160\21\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\162\16\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\2\40\1\163\27\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\165\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\16\40\1\166\13\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\1\167\31\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\170\16\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\171\14\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\16\40\1\172\13\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\173\25\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\174\6\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\175\5\40\1\176\10"+
			"\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\21\40\1\177\10\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\2\40\1\u0080\27\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\16\40\1\u0081\13\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\u0083\14\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\u0085\21\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\u0086\25\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\u0087\21\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\26\40\1\u0088\3\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\12\40\1\u0089\17\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\21\40\1\u008a\10\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\16\40\1\u008c\13\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\5\40\1\u008d\24\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\6\40\1\u008e\23\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\1\u008f\31\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\26\40\1\u0090\3\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\u0092\14\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\u0093\6\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\7\40\1\u0094\22\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\21\40\1\u0095\10\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\1\u0096\31\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\u0099\6\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\3\40\1\u009a\26\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\21\40\1\u009b\10\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\3\40\1\u009e\26\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | OR | NOT | ASSIGN | EQUAL | DIFFERENT | SUM | REST | MULT | DIVI | MIN_E_THAN | MIN_THAN | MAX_E_THAN | MAX_THAN | NEGA | DOSP | PAR_O | PAR_C | CORCH_O | CORCH_C | QUOT | QUOT_O | QUOT_C | IF | THEN | ELSE | ENDWHILE | ENDF | ENDIF | RETORNO | NUMBER | FLOTANTE | COMMA | DECLARATION | MOVE_F | MOVE_B | ROTATE_L | ROTATE_R | PENCOLOR | FUNC | WHILE | PRINT | DO | STRING | STR | ID | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA7_17 = input.LA(1);
						s = -1;
						if ( ((LA7_17 >= '\u0000' && LA7_17 <= '!')||(LA7_17 >= '#' && LA7_17 <= '\uFFFF')) ) {s = 44;}
						else if ( (LA7_17=='\"') ) {s = 45;}
						else s = 43;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA7_44 = input.LA(1);
						s = -1;
						if ( (LA7_44=='\"') ) {s = 45;}
						else if ( ((LA7_44 >= '\u0000' && LA7_44 <= '!')||(LA7_44 >= '#' && LA7_44 <= '\uFFFF')) ) {s = 44;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA7_45 = input.LA(1);
						s = -1;
						if ( ((LA7_45 >= '\u0000' && LA7_45 <= '\uFFFF')) ) {s = 63;}
						else s = 62;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 7, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
