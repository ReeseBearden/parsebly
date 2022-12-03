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
    : varname ('=' | ' = ') type 
    | varname ('=' | ' = ') cast '(' type ')'
    ;

conds
    : type space ctype space conds 
    | type
	;

ifblock
    : 'if' space conds ':' (newline tab block)+
    | 'if' space conds ':' (newline tab block)+ newline elseblock
    ;

elseblock
    : 'elif' space conds ':' (newline tab block)+
    | 'elif' space conds ':' (newline tab block)+ newline elseblock
    | 'else' ':' (newline tab block)+
    ;

whileblock
    : 'while' space conds ':' (newline tab block)+
    ;

forblock
    : 'for' space varname space 'in' space varname ':' (newline tab block)+
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

space 
    : space space
    | SPACE
    | TAB
    ;

tab : TAB
    | tab tab
    ;

newline
    : '\n'
    | newline newline
    ;

NEWLINE : '\n'+;

CHAR	: [A-Za-z];
INT     : [0-9]+;
FLOAT   : INT '.' INT;

STRING  : DSTRING
        | SSTRING
        ;

DSTRING : '"' ~('"')+ '"';
SSTRING : '\'' ~('\'')+ '\'';
STR	: [a-zA-Z]+;
ID  : [_a-zA-Z][_a-zA-Z0-9]*;
TAB	: '  ';
SPACE: ' ';
WS  : [\r\n]+ -> skip; //removes whitespace
COMMENT : '#' ~[\r\n]* -> skip; //removes everything after # except newline
BLOCKCOMMENT : '"""' .*? '"""' -> skip; //anything in """ """ is disregarded