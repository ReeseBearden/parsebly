grammar PythonGrammar;


start: ((variable | expr) NEWLINE)*;


expr: expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | INT
    | '(' expr ')'
    | printRule;



variable: ID '=' (STRING | INT)
        | WS
        ;

printRule: 'print(' expr ')';

NEWLINE : [\n]+;
STRING  : '"' ~('"')+ '"';

INT     : [0-9]+;
ID     : [a-zA-Z0-9]+;
WS     : [ \t\r\n]+ -> skip;