grammar Logo;

options {
  language = Java;
}

@header {
package co.edu.javeriana.interpreter.antlr;
import co.edu.javeriana.turtle.*;
import co.edu.javeriana.interpreter.*;
import clases_Interpreter.*;
}

@lexer::header {
package co.edu.javeriana.interpreter.antlr;  
}

@members {
private Turtle turtle;
	public LogoParser(Turtle turtle, TokenStream input) {
	    this(input);
	    this.turtle = turtle;
	}
}

  program: 
  {Comandos c=new Comandos();}
  (func {c.add($func.e);})*
  (command {c.add($command.e);})+{c.evaluate(new TS());}
  ;
    
  func returns [Evaluator e]
  :{Comandos c=new Comandos();}
  FUNC ID PAR_O param PAR_C DOSP
  (command {c.add($command.e);})*(retorno)?
  ENDF {$e=new DeclaF(c,$ID.text,$param.ep,$retorno.e);}
  ;  
  
  declaF returns [Evaluator e]
  :ID PAR_O paramLlamada PAR_C
  {$e=new Funcion($ID.text,$paramLlamada.ev);}
  ;   
 
  paramLlamada returns [List<Evaluator> ev]
  :{List<Evaluator> listP=new ArrayList();}
  (exp=expression{listP.add($exp.e);} (COMMA exp1=expression{listP.add($exp1.e);})*){$ev=listP;}
  ;  
    
  param returns[List<Evaluator> ep]
  :{List<Evaluator> ab=new ArrayList();}
  (DECLARATION id=ID{ab.add(new Decla($id.getText(),new Defect()));}
  (COMMA(DECLARATION id=ID{ab.add(new Decla($id.getText(),new Defect()));})*))?{$ep=ab;}
  ;  
    
  retorno returns [Evaluator e]
  :RETORNO expression {$e=new Retorno($expression.e);}
  ;  
    
  conditional returns [Evaluator e]
  :{Comandos c=new Comandos();}
  IF PAR_O expression PAR_C CORCH_O
  (command {c.add($command.e);})+CORCH_C {$e=new Conditional($expression.e,c);}
  ;
    
  ciclo returns [Evaluator e]
  : {Comandos comandos=new Comandos();}
    WHILE PAR_O expression PAR_C CORCH_O
    (command{comandos.add(e);})+ CORCH_C {$e=new While($expression.e,comandos);}
  ;
 
  command returns [Evaluator e]
    :ciclo {$e=$ciclo.e;}
    |conditional {$e=$conditional.e;}
    |turn_r {$e=$turn_r.e;}
    |turn_l {$e=$turn_l.e;}
    |move_f {$e=$move_f.e;}
    |move_b {$e=$move_b.e;}
    |declara {$e=$declara.e;}
    |declaF {$e=$declaF.e;}
    |color {$e=$color.e;}
    |imprime {$e=$imprime.e;}
  ;
  
  declara returns [Evaluator e]
  :DECLARATION ID ASSIGN expression {$e=new Decla($ID.getText(),$expression.e);}
  |ID ASSIGN expression {$e=new Assign($expression.e,$ID.getText());}
  ;
  
  turn_r returns [Evaluator e]
  :ROTATE_R expression {$e=new Move_Right($expression.e,turtle);}
  ;
  
  turn_l returns [Evaluator e]
  :ROTATE_L expression {$e=new Move_Left($expression.e,turtle);}
  ;  
  
  move_f returns [Evaluator e]
  :MOVE_F expression {$e=new Move_Forward($expression.e,turtle);}
  ;  
  
  move_b returns [Evaluator e]
  :MOVE_B expression {$e=new Move_Backward($expression.e,turtle);}
  ;    
  
  color returns [Evaluator e]
  :PENCOLOR a=expression COMMA b=expression COMMA c=expression COMMA d=expression {$e=new Color ($a.e,$b.e,$c.e,$d.e,turtle);}
  ;
  
  imprime returns [Evaluator e]
  :PRINT QUOT expression QUOT {$e=new Imprimir($expression.e);}
  |PRINT QUOT_O expression QUOT_C {$e=new Imprimir($expression.e);}
  |PRINT expression{$e=new Imprimir($expression.e);}
  ;

  term returns [Evaluator e]
  ///*: ID   | '(' expression PAR_C ')'  | NUMBER
  :PAR_O expression PAR_C {$e=$expression.e;}
  |NUMBER {$e=new Numeros(Integer.parseInt($NUMBER.getText()));} 
  |FLOTANTE {$e=new Floatt(Float.parseFloat($FLOTANTE.getText()));}
  |ID {$e=new Variable($ID.text);}
  |ID PAR_O paramLlamada PAR_C {$e=new Funcion($ID.text,$paramLlamada.ev);}
  |STRING {$e=new Sttring($STRING.text);}
  |STR {$e=new Sttring($STR.text);}
  ;  
  
  unary returns [Evaluator e]
  //: ('+'|'-')*negation
  : {boolean bandera=true;}
  (SUM|REST {bandera=! bandera;})*term
  {$e=$term.e;
   if(!bandera) 
      $e=new Nega($e);
  }
  ;
  
  mult returns [Evaluator e]
  //: unary(('*'|'/'|'mod') unary)*
  : fact=unary {$e=$fact.e;}
  ((MULT op2=unary{$e=new Multlp($e,$op2.e);}
  |DIVI op2=unary{$e=new Div($e,$op2.e);}
  ))*
  ;
  
  adition returns [Evaluator e]
  //: mult (('+'|'-') mult)*
  : op1=mult{$e=$op1.e;}
  ((SUM op2=mult{$e=new Suma($e,$op2.e);}
  |REST op2=mult{$e=new Resta($e,$op2.e);}
  ))*
  ; 
   
  relation returns [Evaluator e]
  //: addd (('='|'!='|'<'|'<='|'>='|'>') addd)*
  : op1=adition{$e=$op1.e;}
  ((EQUAL op2=adition{$e=new Equals ($e,$op2.e);}
  |DIFFERENT op2=adition{$e=new Different($e,$op2.e);}
  |MIN_THAN op2=adition{$e=new MinThan($e,$op2.e);}
  |MIN_E_THAN op2=adition{$e=new MinEThan($e,$op2.e);}
  |MAX_E_THAN op2=adition{$e=new MaxEThan($e,$op2.e);}
  |MAX_THAN ops=adition{$e=new MaxThan($e,$op2.e);}
  ))*
  ; 
  
  expression returns [Evaluator e]
  //relation(('and'|'or')relation)*
  : op1=relation {$e=$op1.e;}
  ((AND op2=relation{$e=new And($e,$op2.e);}
  |OR op2=relation{$e=new Or($e,$op2.e);}
  ))*
  ; 
     
  AND: ('&&');
  OR: ('||');
  NOT: ('not');
  ASSIGN: '=';
  EQUAL:'==';
  DIFFERENT:'!=';
  SUM: '+';
  REST: '-';
  MULT: '*';
  DIVI: '/';
  MIN_E_THAN: '<=';
  MIN_THAN: '<';
  MAX_E_THAN: '>=';
  MAX_THAN: '>';
  NEGA:'!';
  DOSP: ':';
  PAR_O: '(';
  PAR_C: ')'; 
  CORCH_O: '{';
  CORCH_C: '}';
  QUOT:'"';
  QUOT_O:'“';
  QUOT_C:'”';
  IF: 'if';
  THEN: 'then';
  ELSE: 'else';
  ENDWHILE: 'endwhile';
  ENDF: 'endfunction';
  ENDIF: 'endif';
  RETORNO: 'return';
  NUMBER: ('0'..'9')+; 
  FLOTANTE: ('0'..'9')+'.'('0'..'9');
  COMMA: ',';
  DECLARATION: 'var';
  MOVE_F: 'move_forward';
  MOVE_B: 'move_backward';
  ROTATE_L: 'rotate_left';
  ROTATE_R: 'rotate_right';
  PENCOLOR: 'pen_color';
  FUNC: 'function';
  WHILE: 'while'; 
  PRINT: 'println';
  DO: 'do';
  STRING: ('"' (~'"')* '"');
  STR: '"'(.)*'"';
  ID: ('a'..'z'|'A'..'Z'|'_')+('0'..'9')+;
  WS: (' '|'\t'|'\r'|'\n'){$channel=HIDDEN;};  