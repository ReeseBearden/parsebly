grammar PythonGrammar;


start: ((variable | expr) NEWLINE)*;


expr: expr ('*' | '/' | '+' | '-' | '%') expr
    | expr ('=' | '+=' | '-=' | '*=' | '/=') expr 
    | INT
    | '(' expr ')'
    | printRule;



variable: ID '=' (STRING | INT | FLOAT)
        | ID '=' CAST '(' (STRING | INT | FLOAT) ')'
        | WS
        ;

printRule: 'print(' expr ')';

NEWLINE : [\n]+;
CAST    : 'str'
        | 'int'
        | 'float'
        ;

INT     : [0-9]+;
FLOAT   : INT '.' INT;
STRING  : '"' ~('"')+ '"';

ID      : [a-zA-Z0-9]+;
WS      : [ \t\r\n]+ -> skip;
