enum TokenType {

  LEFT_PAREN, RIGHT_PAREN, 
  COMMA, DOT, MINUS, PLUS, SLASH, STAR,


  BANG, BANG_EQUAL,
  EQUAL, EQUAL_EQUAL,
  GREATER, GREATER_EQUAL,
  LESS, LESS_EQUAL,
  PLUS_EQUAL, MINUS_EQUAL,
  STAR_EQUAL,SLASH_EQUAL,

  // Literals.
  IDENTIFIER, STRING, NUMBER,

  // Keywords.
  AND, CLASS, ELSE, FALSE, FUNCTION, FOR, IF, NIL, OR,
  PRINT, PRINTLN,RETURN, SUPER, THIS, TRUE, VAR, WHILE, END,
  BEGIN,BREAK,DO,BAREMODULE,GLOBAL,CATCH,CONTINUE,
  CONST,FINALLY,TRY,IMPORT,STRUCT,LET,MODULE,
  EXPORT,LOCAL,QUOTE,IN, ELSEIF,ISA,MACRO,

  EOF
}