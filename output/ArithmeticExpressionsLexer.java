// $ANTLR 3.4 E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g 2024-05-12 22:53:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int AndOr=4;
    public static final int Args=5;
    public static final int Assigment=6;
    public static final int BOOLEAN=7;
    public static final int Big_init=8;
    public static final int Br_close=9;
    public static final int Br_open=10;
    public static final int COMMENT=11;
    public static final int Class=12;
    public static final int ClassDec=13;
    public static final int Condition=14;
    public static final int Conditions=15;
    public static final int DNUM=16;
    public static final int DOUBLE=17;
    public static final int Decl=18;
    public static final int Dot=19;
    public static final int Double_dec=20;
    public static final int Factor=21;
    public static final int Forloop=22;
    public static final int Fun=23;
    public static final int GeneralArithExpr=24;
    public static final int INT=25;
    public static final int Ifstmt=26;
    public static final int Ifstmt_2=27;
    public static final int Init_4=28;
    public static final int Initialize=29;
    public static final int Initialize_1=30;
    public static final int Int_dec=31;
    public static final int ML_COMMENT=32;
    public static final int Main=33;
    public static final int Main_METHOD=34;
    public static final int Method=35;
    public static final int Minus=36;
    public static final int Modifier=37;
    public static final int NUM=38;
    public static final int New=39;
    public static final int Out=40;
    public static final int Plus=41;
    public static final int Print=42;
    public static final int Println=43;
    public static final int RelationalOperators=44;
    public static final int SEMICOLON=45;
    public static final int SL_COMMENT=46;
    public static final int STRING=47;
    public static final int Start=48;
    public static final int StartgeneralArithExpr=49;
    public static final int Static=50;
    public static final int String_Dec=51;
    public static final int Strings=52;
    public static final int Sys_print=53;
    public static final int System=54;
    public static final int TYPE=55;
    public static final int Term=56;
    public static final int VAR=57;
    public static final int VOID=58;
    public static final int Whilestmt=59;
    public static final int WhiteSpace=60;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ArithmeticExpressionsLexer() {} 
    public ArithmeticExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArithmeticExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g"; }

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:2:7: ( '!' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:3:7: ( '(' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:3:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:4:7: ( ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:4:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:5:7: ( '*' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:5:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:6:7: ( '++' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:6:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:7:7: ( '+=' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:7:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:8:7: ( ',' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:9:7: ( '--' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:9:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:10:7: ( '-=' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:10:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:11:7: ( '/' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:11:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:12:7: ( '<' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:12:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:13:7: ( '=' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:14:7: ( '>' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:14:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:15:7: ( '[' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:16:7: ( ']' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:17:7: ( 'a' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:17:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:18:7: ( 'else if' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:18:9: 'else if'
            {
            match("else if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:19:7: ( 'else' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:19:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:20:7: ( 'for' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:20:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:21:7: ( 'if' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:21:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:22:7: ( 'return' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:22:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:23:7: ( 'this' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:23:9: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:24:7: ( 'while' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:24:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:235:6: ( 'class' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:235:7: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "Plus"
    public final void mPlus() throws RecognitionException {
        try {
            int _type = Plus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:236:6: ( '+' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:236:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Plus"

    // $ANTLR start "Minus"
    public final void mMinus() throws RecognitionException {
        try {
            int _type = Minus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:237:7: ( '-' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:237:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Minus"

    // $ANTLR start "System"
    public final void mSystem() throws RecognitionException {
        try {
            int _type = System;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:238:8: ( 'System' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:238:9: 'System'
            {
            match("System"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "System"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:239:5: ( 'new' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:239:7: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "Dot"
    public final void mDot() throws RecognitionException {
        try {
            int _type = Dot;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:240:5: ( '.' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:240:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Dot"

    // $ANTLR start "Out"
    public final void mOut() throws RecognitionException {
        try {
            int _type = Out;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:241:5: ( 'out' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:241:7: 'out'
            {
            match("out"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Out"

    // $ANTLR start "Println"
    public final void mPrintln() throws RecognitionException {
        try {
            int _type = Println;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:242:9: ( 'println' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:242:11: 'println'
            {
            match("println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Println"

    // $ANTLR start "Br_close"
    public final void mBr_close() throws RecognitionException {
        try {
            int _type = Br_close;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:243:9: ( '}' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:243:11: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Br_close"

    // $ANTLR start "Br_open"
    public final void mBr_open() throws RecognitionException {
        try {
            int _type = Br_open;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:244:9: ( '{' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:244:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Br_open"

    // $ANTLR start "Args"
    public final void mArgs() throws RecognitionException {
        try {
            int _type = Args;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:245:6: ( 'args' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:245:8: 'args'
            {
            match("args"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Args"

    // $ANTLR start "Static"
    public final void mStatic() throws RecognitionException {
        try {
            int _type = Static;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:246:8: ( 'static' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:246:10: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Static"

    // $ANTLR start "Main"
    public final void mMain() throws RecognitionException {
        try {
            int _type = Main;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:247:6: ( 'main' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:247:8: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Main"

    // $ANTLR start "AndOr"
    public final void mAndOr() throws RecognitionException {
        try {
            int _type = AndOr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:249:7: ( '&&' | '||' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='&') ) {
                alt1=1;
            }
            else if ( (LA1_0=='|') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:249:9: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:249:14: '||'
                    {
                    match("||"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AndOr"

    // $ANTLR start "Modifier"
    public final void mModifier() throws RecognitionException {
        try {
            int _type = Modifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:250:9: ( 'private' | 'public' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='p') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='r') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='u') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:250:11: 'private'
                    {
                    match("private"); 



                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:250:21: 'public'
                    {
                    match("public"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Modifier"

    // $ANTLR start "Fun"
    public final void mFun() throws RecognitionException {
        try {
            int _type = Fun;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:251:5: ( 'sin' | 'cos' | 'tan' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt3=1;
                }
                break;
            case 'c':
                {
                alt3=2;
                }
                break;
            case 't':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:251:7: 'sin'
                    {
                    match("sin"); 



                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:251:15: 'cos'
                    {
                    match("cos"); 



                    }
                    break;
                case 3 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:251:22: 'tan'
                    {
                    match("tan"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Fun"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:252:5: ( 'int' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:252:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:253:8: ( 'double' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:253:10: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:254:6: ( 'void' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:254:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:255:9: ( 'boolean' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:255:11: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:256:9: ( 'String' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:256:11: 'String'
            {
            match("String"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:257:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )* )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:257:7: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:257:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:258:5: ( ( '-' )? ( '0' .. '9' )* )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:258:7: ( '-' )? ( '0' .. '9' )*
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:258:7: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:258:8: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:258:13: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "DNUM"
    public final void mDNUM() throws RecognitionException {
        try {
            int _type = DNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:259:6: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )* )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:259:8: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )*
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:259:8: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:259:9: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:259:14: ( '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('.'); 

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:259:30: ( '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DNUM"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:260:10: ( ';' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:260:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "Strings"
    public final void mStrings() throws RecognitionException {
        try {
            int _type = Strings;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:261:9: ( '\"' ( . )* '\"' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:261:11: '\"' ( . )* '\"'
            {
            match('\"'); 

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:261:15: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\"') ) {
                    alt10=2;
                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:261:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Strings"

    // $ANTLR start "RelationalOperators"
    public final void mRelationalOperators() throws RecognitionException {
        try {
            int _type = RelationalOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:262:20: ( '==' | '!=' | '>' | '<' | '>=' | '<=' |)
            int alt11=7;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt11=1;
                }
                break;
            case '!':
                {
                alt11=2;
                }
                break;
            case '>':
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3=='=') ) {
                    alt11=5;
                }
                else {
                    alt11=3;
                }
                }
                break;
            case '<':
                {
                int LA11_4 = input.LA(2);

                if ( (LA11_4=='=') ) {
                    alt11=6;
                }
                else {
                    alt11=4;
                }
                }
                break;
            default:
                alt11=7;
            }

            switch (alt11) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:262:24: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:262:29: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 3 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:262:34: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:262:38: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 5 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:262:42: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 6 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:262:47: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 7 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:262:52: 
                    {
                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RelationalOperators"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:263:12: ( '/*' ( options {greedy=false; } : . )* ( '*/' )+ )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:263:14: '/*' ( options {greedy=false; } : . )* ( '*/' )+
            {
            match("/*"); 



            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:263:19: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:263:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:263:51: ( '*/' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:263:51: '*/'
            	    {
            	    match("*/"); 



            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:264:12: ( '//' ( . )* ( '\\n' )+ )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:264:14: '//' ( . )* ( '\\n' )+
            {
            match("//"); 



            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:264:19: ( . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\n') ) {
                    alt14=2;
                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:264:20: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:264:23: ( '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\n') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:264:23: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:265:11: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:265:13: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:265:13: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WhiteSpace"

    public void mTokens() throws RecognitionException {
        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:8: ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | Class | Plus | Minus | System | New | Dot | Out | Println | Br_close | Br_open | Args | Static | Main | AndOr | Modifier | Fun | INT | DOUBLE | VOID | BOOLEAN | STRING | VAR | NUM | DNUM | SEMICOLON | Strings | RelationalOperators | ML_COMMENT | SL_COMMENT | WhiteSpace )
        int alt17=53;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:10: T__61
                {
                mT__61(); 


                }
                break;
            case 2 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:16: T__62
                {
                mT__62(); 


                }
                break;
            case 3 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:22: T__63
                {
                mT__63(); 


                }
                break;
            case 4 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:28: T__64
                {
                mT__64(); 


                }
                break;
            case 5 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:34: T__65
                {
                mT__65(); 


                }
                break;
            case 6 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:40: T__66
                {
                mT__66(); 


                }
                break;
            case 7 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:46: T__67
                {
                mT__67(); 


                }
                break;
            case 8 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:52: T__68
                {
                mT__68(); 


                }
                break;
            case 9 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:58: T__69
                {
                mT__69(); 


                }
                break;
            case 10 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:64: T__70
                {
                mT__70(); 


                }
                break;
            case 11 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:70: T__71
                {
                mT__71(); 


                }
                break;
            case 12 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:76: T__72
                {
                mT__72(); 


                }
                break;
            case 13 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:82: T__73
                {
                mT__73(); 


                }
                break;
            case 14 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:88: T__74
                {
                mT__74(); 


                }
                break;
            case 15 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:94: T__75
                {
                mT__75(); 


                }
                break;
            case 16 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:100: T__76
                {
                mT__76(); 


                }
                break;
            case 17 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:106: T__77
                {
                mT__77(); 


                }
                break;
            case 18 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:112: T__78
                {
                mT__78(); 


                }
                break;
            case 19 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:118: T__79
                {
                mT__79(); 


                }
                break;
            case 20 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:124: T__80
                {
                mT__80(); 


                }
                break;
            case 21 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:130: T__81
                {
                mT__81(); 


                }
                break;
            case 22 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:136: T__82
                {
                mT__82(); 


                }
                break;
            case 23 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:142: T__83
                {
                mT__83(); 


                }
                break;
            case 24 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:148: Class
                {
                mClass(); 


                }
                break;
            case 25 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:154: Plus
                {
                mPlus(); 


                }
                break;
            case 26 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:159: Minus
                {
                mMinus(); 


                }
                break;
            case 27 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:165: System
                {
                mSystem(); 


                }
                break;
            case 28 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:172: New
                {
                mNew(); 


                }
                break;
            case 29 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:176: Dot
                {
                mDot(); 


                }
                break;
            case 30 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:180: Out
                {
                mOut(); 


                }
                break;
            case 31 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:184: Println
                {
                mPrintln(); 


                }
                break;
            case 32 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:192: Br_close
                {
                mBr_close(); 


                }
                break;
            case 33 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:201: Br_open
                {
                mBr_open(); 


                }
                break;
            case 34 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:209: Args
                {
                mArgs(); 


                }
                break;
            case 35 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:214: Static
                {
                mStatic(); 


                }
                break;
            case 36 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:221: Main
                {
                mMain(); 


                }
                break;
            case 37 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:226: AndOr
                {
                mAndOr(); 


                }
                break;
            case 38 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:232: Modifier
                {
                mModifier(); 


                }
                break;
            case 39 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:241: Fun
                {
                mFun(); 


                }
                break;
            case 40 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:245: INT
                {
                mINT(); 


                }
                break;
            case 41 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:249: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 42 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:256: VOID
                {
                mVOID(); 


                }
                break;
            case 43 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:261: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 44 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:269: STRING
                {
                mSTRING(); 


                }
                break;
            case 45 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:276: VAR
                {
                mVAR(); 


                }
                break;
            case 46 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:280: NUM
                {
                mNUM(); 


                }
                break;
            case 47 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:284: DNUM
                {
                mDNUM(); 


                }
                break;
            case 48 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:289: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 49 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:299: Strings
                {
                mStrings(); 


                }
                break;
            case 50 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:307: RelationalOperators
                {
                mRelationalOperators(); 


                }
                break;
            case 51 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:327: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 52 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:338: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 53 :
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:1:349: WhiteSpace
                {
                mWhiteSpace(); 


                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\45\1\52\3\uffff\1\55\1\uffff\1\60\1\64\1\65\1\66\1\67\2\uffff"+
        "\1\71\11\43\1\107\2\43\2\uffff\2\43\1\uffff\3\43\1\uffff\1\45\23"+
        "\uffff\1\43\1\uffff\2\43\1\124\12\43\1\uffff\13\43\1\152\1\uffff"+
        "\1\153\2\43\1\156\2\43\1\156\2\43\1\163\1\164\3\43\1\156\4\43\1"+
        "\175\1\177\2\uffff\1\43\1\u0081\1\uffff\4\43\2\uffff\4\43\1\u008a"+
        "\1\43\1\u008c\1\43\3\uffff\1\43\1\uffff\1\u008f\1\u0090\6\43\1\uffff"+
        "\1\43\1\uffff\1\43\1\u0099\2\uffff\1\u009a\1\u009b\2\43\1\u009e"+
        "\1\u009f\1\u00a0\1\43\3\uffff\1\u00a2\1\u009e\3\uffff\1\u00a3\2"+
        "\uffff";
    static final String DFA17_eofS =
        "\u00a4\uffff";
    static final String DFA17_minS =
        "\1\11\1\75\3\uffff\1\53\1\uffff\1\55\1\52\3\75\2\uffff\1\44\1\154"+
        "\1\157\1\146\1\145\1\141\1\150\1\154\1\164\1\145\1\60\1\165\1\162"+
        "\2\uffff\1\151\1\141\1\uffff\3\157\1\uffff\1\56\23\uffff\1\147\1"+
        "\uffff\1\163\1\162\1\44\2\164\1\151\1\156\1\151\1\141\2\163\1\162"+
        "\1\167\1\uffff\1\164\1\151\1\142\1\141\1\156\1\151\1\165\1\151\1"+
        "\157\1\163\1\145\1\44\1\uffff\1\44\1\165\1\163\1\44\1\154\1\163"+
        "\1\44\1\164\1\151\2\44\1\156\1\154\1\164\1\44\1\156\1\142\1\144"+
        "\1\154\1\44\1\40\2\uffff\1\162\1\44\1\uffff\1\145\1\163\1\145\1"+
        "\156\2\uffff\1\164\1\141\2\151\1\44\1\154\1\44\1\145\3\uffff\1\156"+
        "\1\uffff\2\44\1\155\1\147\1\154\1\164\2\143\1\uffff\1\145\1\uffff"+
        "\1\141\1\44\2\uffff\2\44\1\156\1\145\3\44\1\156\3\uffff\2\44\3\uffff"+
        "\1\44\2\uffff";
    static final String DFA17_maxS =
        "\1\175\1\75\3\uffff\1\75\1\uffff\1\75\1\57\3\75\2\uffff\1\172\1"+
        "\154\1\157\1\156\1\145\2\150\1\157\1\171\1\145\1\71\2\165\2\uffff"+
        "\1\164\1\141\1\uffff\3\157\1\uffff\1\71\23\uffff\1\147\1\uffff\1"+
        "\163\1\162\1\172\2\164\1\151\1\156\1\151\1\141\2\163\1\162\1\167"+
        "\1\uffff\1\164\1\151\1\142\1\141\1\156\1\151\1\165\1\151\1\157\1"+
        "\163\1\145\1\172\1\uffff\1\172\1\165\1\163\1\172\1\154\1\163\1\172"+
        "\1\164\1\151\2\172\1\166\1\154\1\164\1\172\1\156\1\142\1\144\1\154"+
        "\2\172\2\uffff\1\162\1\172\1\uffff\1\145\1\163\1\145\1\156\2\uffff"+
        "\1\164\1\141\2\151\1\172\1\154\1\172\1\145\3\uffff\1\156\1\uffff"+
        "\2\172\1\155\1\147\1\154\1\164\2\143\1\uffff\1\145\1\uffff\1\141"+
        "\1\172\2\uffff\2\172\1\156\1\145\3\172\1\156\3\uffff\2\172\3\uffff"+
        "\1\172\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\7\5\uffff\1\16\1\17\15\uffff\1\40"+
        "\1\41\2\uffff\1\45\3\uffff\1\55\1\uffff\1\56\1\60\1\61\1\65\1\62"+
        "\1\1\1\5\1\6\1\31\1\10\1\11\1\32\1\57\1\63\1\64\1\12\1\13\1\14\1"+
        "\15\1\uffff\1\20\15\uffff\1\35\14\uffff\1\24\25\uffff\1\23\1\50"+
        "\2\uffff\1\47\4\uffff\1\34\1\36\10\uffff\1\42\1\21\1\22\1\uffff"+
        "\1\26\10\uffff\1\44\1\uffff\1\52\2\uffff\1\27\1\30\10\uffff\1\25"+
        "\1\33\1\54\2\uffff\1\46\1\43\1\51\1\uffff\1\37\1\53";
    static final String DFA17_specialS =
        "\u00a4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\1\1\47\1\uffff\1\43\1\uffff"+
            "\1\37\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\30\1\10\12\44\1\uffff"+
            "\1\46\1\11\1\12\1\13\2\uffff\22\43\1\26\7\43\1\14\1\uffff\1"+
            "\15\1\uffff\1\43\1\uffff\1\16\1\42\1\25\1\40\1\17\1\20\2\43"+
            "\1\21\3\43\1\36\1\27\1\31\1\32\1\43\1\22\1\35\1\23\1\43\1\41"+
            "\1\24\3\43\1\34\1\37\1\33",
            "\1\51",
            "",
            "",
            "",
            "\1\53\21\uffff\1\54",
            "",
            "\1\56\1\61\1\uffff\12\44\3\uffff\1\57",
            "\1\62\4\uffff\1\63",
            "\1\51",
            "\1\51",
            "\1\51",
            "",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21"+
            "\43\1\70\10\43",
            "\1\72",
            "\1\73",
            "\1\74\7\uffff\1\75",
            "\1\76",
            "\1\100\6\uffff\1\77",
            "\1\101",
            "\1\102\2\uffff\1\103",
            "\1\105\4\uffff\1\104",
            "\1\106",
            "\12\61",
            "\1\110",
            "\1\111\2\uffff\1\112",
            "",
            "",
            "\1\114\12\uffff\1\113",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\61\1\uffff\12\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\154",
            "\1\155",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\157",
            "\1\160",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\161",
            "\1\162",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\165\7\uffff\1\166",
            "\1\167",
            "\1\170",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\176\3\uffff\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1"+
            "\43\1\uffff\32\43",
            "",
            "",
            "\1\u0080",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u008b",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u008d",
            "",
            "",
            "",
            "\1\u008e",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u009c",
            "\1\u009d",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u00a1",
            "",
            "",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | Class | Plus | Minus | System | New | Dot | Out | Println | Br_close | Br_open | Args | Static | Main | AndOr | Modifier | Fun | INT | DOUBLE | VOID | BOOLEAN | STRING | VAR | NUM | DNUM | SEMICOLON | Strings | RelationalOperators | ML_COMMENT | SL_COMMENT | WhiteSpace );";
        }
    }
 

}