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
    ;

printRule
    :'print' '(' printRule ')'
    | expr
    | STRING
    ;

variable
    : varname ('=' | ' = ' ) type 
    | varname ('=' | ' = ' ) cast '(' type ')'
    ;

conds
    : type ctype conds
    | type
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

whileblock
    : 'while' conds ':' block 
    ;

forblock
    : 'for' varname 'in' varname ':' block
    ;

type
    : STRING 
    | INT 
    | FLOAT 
    | CHAR 
    | ID
    ;

varname
    : CHAR
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

cast: 'str'
    | 'int'
    | 'float'
    ;


NEWLINE : [\n]+;

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