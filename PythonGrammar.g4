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
	;

ifblock : 'if ' conds ':' NEWLINE '    ' (expr | variable | conds)
	; 
elseblock : 'else:' NEWLINE '    ' (expr | variable | conds) ;

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
WS      : [ \t\r\n]+ -> skip;

