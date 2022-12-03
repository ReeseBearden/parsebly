grammar PythonGrammar;


start: (block '\n')* EOF;

block:
    | variable 
    | printRule 
    | ifblock
    | expr
    | whileblock
    | forblock
    ;

//start: ((variable | expr) NEWLINE)*;


expr: expr ('*' | '/' | '+' | '-' | '%' | ' * '  | ' / ' | ' + ' | ' - ' | ' % ') expr
    | expr ('=' | '+=' | '-=' | '*=' | '/=' | ' = ' | ' += ' | ' -= ' | ' *= ' | ' /= ') expr 
    | INT
    | '(' expr ')'
    | printRule;



variable: ID '=' (STRING | INT | FLOAT) //spacing is broke for some reason
        | ID '='  CAST '(' (STRING | INT | FLOAT) ')'
        ;


printRule: 'print(' expr ')';



conds: (STR | INT | FLOAT | CHAR | ID) ('>' | '<' | '>=' | '<=' | '==' | '!=' | '&&' | '||' | '!' | ' > ' | ' < ' | ' >= ' | ' <= ' | ' == ' | ' != ' | ' && ' | ' || ' | ' !') (STR | INT | FLOAT | CHAR)
	| '('(STR | INT | FLOAT | CHAR | ID) ('>' | '<' | '>=' | '<=' | '==' | '!=' | '&&' | '||' | '!' | ' > ' | ' < ' | ' >= ' | ' <= ' | ' == ' | ' != ' | ' && ' | ' || ' | ' !') (STR | INT | FLOAT | CHAR)')'
	;


ifblock : 'if ' conds ':' NEWLINE TAB (expr | variable | conds) NEWLINE 'else:' NEWLINE TAB (expr | variable | conds)
	| 'if ' conds ':' NEWLINE TAB (expr | variable | conds)
	;

whileblock: 'while' conds ':' block
;

forblock
    : 'for' (ID|CHAR) 'in' ID ':' block
    ;


NEWLINE : [\n]+;
CAST    : 'str'
        | 'int'
        | 'float'
        ;



CHAR	: [A-Za-z];
INT     : [0-9]+;
FLOAT   : INT '.' INT;

STRING  : DSTRING
        | SSTRING
        ;





DSTRING : '"' ~('"')+ '"';
SSTRING : '\'' ~('\'')+ '\'';

STR	: [a-zA-Z]+;
ID  : [a-zA-Z_][a-zA-Z_0-9]*;
TAB	: [\t]+;
WS  : [ \r\n]+ -> skip; //removes whitespace
COMMENT : '#' ~[\r\n]* -> skip;
BLOCKCOMMENT : '"""' .* '"""' -> skip; //wildcard zero or more optional zero or one

