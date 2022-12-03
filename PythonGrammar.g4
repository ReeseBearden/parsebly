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


conds: type ctype type
	;

ifblock
    : 'if' conds ':' block
    | 'if' conds ':' block '\n' elseblock
    ;

elseblock
    : 'elif' conds ':' block
    | 'elif' conds ':' block '\n' elseblock
    | 'else' ':' block
    ;

whileblock: 'while' conds ':' block
;

forblock
    : 'for' (ID|CHAR) 'in' ID ':' block
    ;

type
    : STR 
    | INT 
    | FLOAT 
    | CHAR 
    | ID
    ;

ctype
    : '<'
    | '<='
    | '>'
    | '>='
    | '=='
    | '!='
    | 'and'
    | 'or'
    | 'not'
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
COMMENT : '#' ~[\r\n]* -> skip; //removes everything after # except newline
BLOCKCOMMENT : '"""' .*? '"""' -> skip; //anything in """ """ is disregarded

