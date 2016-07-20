grammar IQDEP;

KW_ON: 'on';
KW_SELECT: 'select' | 'SELECT';
KW_WITHIN: 'within';
KW_RADIUS:'radius';
KW_KNN: 'kNN' | 'KNN' | 'nn';
KW_FROM: 'from';
KW_WHERE: 'where';
KW_AND: '&';
KW_OR: '|';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
STAR: '*';


ID: [a-zA-Z0-9]+;

NEWLINE: '\r'? '\n' ;
SPACES: [ \u000B\t\r\n] -> skip;


select_statment: KW_SELECT column_name KW_FROM on_core (KW_WHERE conditions)?;

column_name: STAR
			| column_core
			;
column_core: ID ( COMMA ID)*;

conditions: ID ( '=' | '==' | '!=' | '<>') ID	# predicates
			;				
on_core: event_name 									# singleEvent
		| LPAREN event_name ( COMMA event_name)* RPAREN # sequenceEvents
		;
     
event_name: ID (ID)?;									


