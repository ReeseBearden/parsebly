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

ifblock : 'if ' conds ':'
        | 'if ' conds ':' NL '    ' (expr | variable | conds)  NL 'else:' NL '    ' (expr | variable | conds)
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

NL	: [\n];
STR	: [a-zA-Z]+;
ID      : [a-zA-Z0-9]+;
WS      : [ \t\r\n]+ -> skip;

