package org.openarchitectureware.var.features.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFeaturesLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int Tokens=22;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalFeaturesLexer() {;} 
    public InternalFeaturesLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:10:5: ( 'featureAndList' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:10:7: 'featureAndList'
            {
            match("featureAndList"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:11:5: ( 'retain' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:11:7: 'retain'
            {
            match("retain"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:12:5: ( '(' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:12:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:13:5: ( ',' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:13:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:14:5: ( ')' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:14:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:15:5: ( 'featureOrList' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:15:7: 'featureOrList'
            {
            match("featureOrList"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:16:5: ( 'featureExp' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:16:7: 'featureExp'
            {
            match("featureExp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:17:5: ( 'feature' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:17:7: 'feature'
            {
            match("feature"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:18:5: ( 'or' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:18:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:19:5: ( 'and' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:19:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:20:5: ( 'not' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:20:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:736:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:736:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:736:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:736:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:736:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:738:10: ( ( '0' .. '9' )+ )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:738:12: ( '0' .. '9' )+
            {
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:738:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:738:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("740:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:740:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:742:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:742:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:742:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:742:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:744:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:744:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:744:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:744:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:744:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:744:41: ( '\\r' )? '\\n'
                    {
                    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:744:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:744:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:746:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:746:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:746:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:748:16: ( . )
            // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:748:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=18;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='f') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='e') ) {
                int LA12_17 = input.LA(3);

                if ( (LA12_17=='a') ) {
                    int LA12_31 = input.LA(4);

                    if ( (LA12_31=='t') ) {
                        int LA12_36 = input.LA(5);

                        if ( (LA12_36=='u') ) {
                            int LA12_40 = input.LA(6);

                            if ( (LA12_40=='r') ) {
                                int LA12_42 = input.LA(7);

                                if ( (LA12_42=='e') ) {
                                    switch ( input.LA(8) ) {
                                    case 'E':
                                        {
                                        int LA12_46 = input.LA(9);

                                        if ( (LA12_46=='x') ) {
                                            int LA12_50 = input.LA(10);

                                            if ( (LA12_50=='p') ) {
                                                int LA12_53 = input.LA(11);

                                                if ( ((LA12_53>='0' && LA12_53<='9')||(LA12_53>='A' && LA12_53<='Z')||LA12_53=='_'||(LA12_53>='a' && LA12_53<='z')) ) {
                                                    alt12=12;
                                                }
                                                else {
                                                    alt12=7;}
                                            }
                                            else {
                                                alt12=12;}
                                        }
                                        else {
                                            alt12=12;}
                                        }
                                        break;
                                    case 'O':
                                        {
                                        int LA12_47 = input.LA(9);

                                        if ( (LA12_47=='r') ) {
                                            int LA12_51 = input.LA(10);

                                            if ( (LA12_51=='L') ) {
                                                int LA12_54 = input.LA(11);

                                                if ( (LA12_54=='i') ) {
                                                    int LA12_57 = input.LA(12);

                                                    if ( (LA12_57=='s') ) {
                                                        int LA12_59 = input.LA(13);

                                                        if ( (LA12_59=='t') ) {
                                                            int LA12_61 = input.LA(14);

                                                            if ( ((LA12_61>='0' && LA12_61<='9')||(LA12_61>='A' && LA12_61<='Z')||LA12_61=='_'||(LA12_61>='a' && LA12_61<='z')) ) {
                                                                alt12=12;
                                                            }
                                                            else {
                                                                alt12=6;}
                                                        }
                                                        else {
                                                            alt12=12;}
                                                    }
                                                    else {
                                                        alt12=12;}
                                                }
                                                else {
                                                    alt12=12;}
                                            }
                                            else {
                                                alt12=12;}
                                        }
                                        else {
                                            alt12=12;}
                                        }
                                        break;
                                    case 'A':
                                        {
                                        int LA12_48 = input.LA(9);

                                        if ( (LA12_48=='n') ) {
                                            int LA12_52 = input.LA(10);

                                            if ( (LA12_52=='d') ) {
                                                int LA12_55 = input.LA(11);

                                                if ( (LA12_55=='L') ) {
                                                    int LA12_58 = input.LA(12);

                                                    if ( (LA12_58=='i') ) {
                                                        int LA12_60 = input.LA(13);

                                                        if ( (LA12_60=='s') ) {
                                                            int LA12_62 = input.LA(14);

                                                            if ( (LA12_62=='t') ) {
                                                                int LA12_64 = input.LA(15);

                                                                if ( ((LA12_64>='0' && LA12_64<='9')||(LA12_64>='A' && LA12_64<='Z')||LA12_64=='_'||(LA12_64>='a' && LA12_64<='z')) ) {
                                                                    alt12=12;
                                                                }
                                                                else {
                                                                    alt12=1;}
                                                            }
                                                            else {
                                                                alt12=12;}
                                                        }
                                                        else {
                                                            alt12=12;}
                                                    }
                                                    else {
                                                        alt12=12;}
                                                }
                                                else {
                                                    alt12=12;}
                                            }
                                            else {
                                                alt12=12;}
                                        }
                                        else {
                                            alt12=12;}
                                        }
                                        break;
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '_':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        {
                                        alt12=12;
                                        }
                                        break;
                                    default:
                                        alt12=8;}

                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='e') ) {
                int LA12_19 = input.LA(3);

                if ( (LA12_19=='t') ) {
                    int LA12_32 = input.LA(4);

                    if ( (LA12_32=='a') ) {
                        int LA12_37 = input.LA(5);

                        if ( (LA12_37=='i') ) {
                            int LA12_41 = input.LA(6);

                            if ( (LA12_41=='n') ) {
                                int LA12_43 = input.LA(7);

                                if ( ((LA12_43>='0' && LA12_43<='9')||(LA12_43>='A' && LA12_43<='Z')||LA12_43=='_'||(LA12_43>='a' && LA12_43<='z')) ) {
                                    alt12=12;
                                }
                                else {
                                    alt12=2;}
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=3;
        }
        else if ( (LA12_0==',') ) {
            alt12=4;
        }
        else if ( (LA12_0==')') ) {
            alt12=5;
        }
        else if ( (LA12_0=='o') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='r') ) {
                int LA12_23 = input.LA(3);

                if ( ((LA12_23>='0' && LA12_23<='9')||(LA12_23>='A' && LA12_23<='Z')||LA12_23=='_'||(LA12_23>='a' && LA12_23<='z')) ) {
                    alt12=12;
                }
                else {
                    alt12=9;}
            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='a') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='n') ) {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='d') ) {
                    int LA12_34 = input.LA(4);

                    if ( ((LA12_34>='0' && LA12_34<='9')||(LA12_34>='A' && LA12_34<='Z')||LA12_34=='_'||(LA12_34>='a' && LA12_34<='z')) ) {
                        alt12=12;
                    }
                    else {
                        alt12=10;}
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='n') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='o') ) {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='t') ) {
                    int LA12_35 = input.LA(4);

                    if ( ((LA12_35>='0' && LA12_35<='9')||(LA12_35>='A' && LA12_35<='Z')||LA12_35=='_'||(LA12_35>='a' && LA12_35<='z')) ) {
                        alt12=12;
                    }
                    else {
                        alt12=11;}
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_9 = input.LA(2);

            if ( ((LA12_9>='A' && LA12_9<='Z')||LA12_9=='_'||(LA12_9>='a' && LA12_9<='z')) ) {
                alt12=12;
            }
            else {
                alt12=18;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='m')||(LA12_0>='p' && LA12_0<='q')||(LA12_0>='s' && LA12_0<='z')) ) {
            alt12=12;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=13;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_12 = input.LA(2);

            if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFE')) ) {
                alt12=14;
            }
            else {
                alt12=18;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_13 = input.LA(2);

            if ( ((LA12_13>='\u0000' && LA12_13<='\uFFFE')) ) {
                alt12=14;
            }
            else {
                alt12=18;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=16;
                }
                break;
            case '*':
                {
                alt12=15;
                }
                break;
            default:
                alt12=18;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=17;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=18;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:54: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:62: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:71: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:83: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:99: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:115: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // ../org.openarchitectureware.var.features/src-gen/org/openarchitectureware/var/features/parser/antlr/internal/InternalFeatures.g:1:123: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}