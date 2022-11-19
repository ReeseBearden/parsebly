grammar PythonGrammar;


start: ((variable | expr) NEWLINE)*;


expr: expr ('*' | '/' | '+' | '-' | '%' | ' * '  | ' / ' | ' + ' | ' - ' | ' % ') expr
    | expr ('=' | '+=' | '-=' | '*=' | '/=' | ' = ' | ' += ' | ' -= ' | ' *= ' | ' /= ') expr 
    | INT
    | '(' expr ')'
    | printRule;



variable: ID '=' (STRING | INT | FLOAT)
        | ID '=' CAST '(' (STRING | INT | FLOAT) ')'
        | WS
        ;


printRule: 'print(' expr ')';



conds: (STR | INT | FLOAT | CHAR) ('>' | '<' | '>=' | '<=' | '==' | '!=' | '&&' | '||' | '!' | ' > ' | ' < ' | ' >= ' | ' <= ' | ' == ' | ' != ' | ' && ' | ' || ' | ' !') (STR | INT | FLOAT | CHAR)
	| '('(STR | INT | FLOAT | CHAR) ('>' | '<' | '>=' | '<=' | '==' | '!=' | '&&' | '||' | '!' | ' > ' | ' < ' | ' >= ' | ' <= ' | ' == ' | ' != ' | ' && ' | ' || ' | ' !') (STR | INT | FLOAT | CHAR)')'
	;


ifblock : 'if ' conds ':' NEWLINE TAB (expr | variable | conds) NEWLINE 'else:' NEWLINE TAB (expr | variable | conds)
	| 'if ' conds ':' NEWLINE TAB (expr | variable | conds)
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




DSTRING  : '"' ~('"')+ '"';
SSTRING  : '\'' ~('\'')+ '\'';

STR	: [a-zA-Z]+;
ID      : [a-zA-Z0-9]+;
TAB	: [\t]+;
WS      : [ \r\n]+ -> skip;

