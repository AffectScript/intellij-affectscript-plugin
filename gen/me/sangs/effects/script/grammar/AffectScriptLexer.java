// Generated from /Users/dsa28s/Desktop/intellij-affectscript-plugin/src/me/sangs/effects/script/grammar/AffectScript.g4 by ANTLR 4.7
package me.sangs.effects.script.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AffectScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, USE_K=11, SCRIPT_k=12, CREATE_K=13, COMPOSITION_K=14, SHAPE_K=15, 
		SET_K=16, TO_K=17, ADD_K=18, TEXT_K=19, OPEN_K=20, SHOW_K=21, MSGBOX_K=22, 
		IMPORT_K=23, FILE_K=24, SELECT=25, SOLID_K=26, APPLY_K=27, EFFECT_K=28, 
		PARAMS_K=29, NEW_K=30, FOLDER_K=31, ANNOTATION_MARK=32, MOVE_K=33, NEW_=34, 
		RECTANGLE_K=35, SETVALUES_FUNC=36, LPAREN=37, RPAREN=38, COLON=39, COMMA=40, 
		LBRACK=41, RBRACK=42, LBRACE=43, RBRACE=44, IF=45, ELSE=46, WHILE=47, 
		VAR=48, EQUAL=49, RETURN=50, PRINT=51, FUNC=52, TYPEINT=53, TYPEFLOAT=54, 
		TYPESTRING=55, TYPEBOOLEAN=56, TRUE=57, FALSE=58, SUB=59, BANG=60, MUL=61, 
		DIV=62, ADD=63, LT=64, LE=65, EQUAL_EQUAL=66, NOT_EQUAL=67, GT=68, GE=69, 
		OR=70, AND=71, DOT=72, LINE_COMMENT=73, COMMENT=74, ID=75, ANNO=76, INT=77, 
		FLOAT=78, STRING=79, WS=80, ERRCHAR=81;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "USE_K", "SCRIPT_k", "CREATE_K", "COMPOSITION_K", "SHAPE_K", "SET_K", 
		"TO_K", "ADD_K", "TEXT_K", "OPEN_K", "SHOW_K", "MSGBOX_K", "IMPORT_K", 
		"FILE_K", "SELECT", "SOLID_K", "APPLY_K", "EFFECT_K", "PARAMS_K", "NEW_K", 
		"FOLDER_K", "ANNOTATION_MARK", "MOVE_K", "NEW_", "RECTANGLE_K", "SETVALUES_FUNC", 
		"LPAREN", "RPAREN", "COLON", "COMMA", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
		"IF", "ELSE", "WHILE", "VAR", "EQUAL", "RETURN", "PRINT", "FUNC", "TYPEINT", 
		"TYPEFLOAT", "TYPESTRING", "TYPEBOOLEAN", "TRUE", "FALSE", "SUB", "BANG", 
		"MUL", "DIV", "ADD", "LT", "LE", "EQUAL_EQUAL", "NOT_EQUAL", "GT", "GE", 
		"OR", "AND", "DOT", "LINE_COMMENT", "COMMENT", "ID", "ANNO", "INT", "FLOAT", 
		"EXP", "STRING", "ESC", "WS", "ERRCHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'question'", "'params'", "'oval'", "'yes'", "'no'", "'>>>'", "'answer'", 
		"'->'", "'rgb'", "'.'", "'use'", "'script'", "'create'", "'composition'", 
		"'shape'", "'set'", "'to'", "'add'", "'text'", "'open'", "'show'", "'messagebox'", 
		"'import'", "'file'", "'select'", "'solid'", "'apply'", "'effect'", "'parameters'", 
		"'new'", "'folder'", "'@'", "'move'", null, "'rectangle'", "'setValues'", 
		"'('", "')'", "':'", "','", "'['", "']'", "'{'", "'}'", "'if'", "'else'", 
		"'while'", "'var'", "'='", "'return'", "'print'", "'func'", "'int'", "'float'", 
		"'string'", "'boolean'", "'true'", "'false'", "'-'", "'!'", "'*'", "'/'", 
		"'+'", "'<'", "'<='", "'=='", "'!='", "'>'", "'>='", "'||'", "'&&'", "' . '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "USE_K", 
		"SCRIPT_k", "CREATE_K", "COMPOSITION_K", "SHAPE_K", "SET_K", "TO_K", "ADD_K", 
		"TEXT_K", "OPEN_K", "SHOW_K", "MSGBOX_K", "IMPORT_K", "FILE_K", "SELECT", 
		"SOLID_K", "APPLY_K", "EFFECT_K", "PARAMS_K", "NEW_K", "FOLDER_K", "ANNOTATION_MARK", 
		"MOVE_K", "NEW_", "RECTANGLE_K", "SETVALUES_FUNC", "LPAREN", "RPAREN", 
		"COLON", "COMMA", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "IF", "ELSE", 
		"WHILE", "VAR", "EQUAL", "RETURN", "PRINT", "FUNC", "TYPEINT", "TYPEFLOAT", 
		"TYPESTRING", "TYPEBOOLEAN", "TRUE", "FALSE", "SUB", "BANG", "MUL", "DIV", 
		"ADD", "LT", "LE", "EQUAL_EQUAL", "NOT_EQUAL", "GT", "GE", "OR", "AND", 
		"DOT", "LINE_COMMENT", "COMMENT", "ID", "ANNO", "INT", "FLOAT", "STRING", 
		"WS", "ERRCHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AffectScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AffectScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u0258\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\3"+
		"9\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3"+
		"A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3"+
		"I\3I\3I\3J\3J\3J\3J\7J\u0203\nJ\fJ\16J\u0206\13J\3J\5J\u0209\nJ\3J\3J"+
		"\3K\3K\3K\3K\7K\u0211\nK\fK\16K\u0214\13K\3K\3K\3K\3K\3K\3L\3L\7L\u021d"+
		"\nL\fL\16L\u0220\13L\3M\3M\3M\3N\6N\u0226\nN\rN\16N\u0227\3O\5O\u022b"+
		"\nO\3O\3O\3O\3O\5O\u0231\nO\3O\5O\u0234\nO\3O\3O\3O\5O\u0239\nO\3P\3P"+
		"\5P\u023d\nP\3P\3P\3Q\3Q\3Q\7Q\u0244\nQ\fQ\16Q\u0247\13Q\3Q\3Q\3R\3R\3"+
		"R\3S\6S\u024f\nS\rS\16S\u0250\3S\3S\3T\3T\3T\3T\4\u0204\u0212\2U\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f\2\u00a1Q\u00a3"+
		"\2\u00a5R\u00a7S\3\2\13\3\3\f\f\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2"+
		"GGgg\4\2--//\4\2$$^^\b\2\n\n$$hhppttvv\5\2\13\f\17\17\"\"\2\u0261\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\3\u00a9\3\2\2\2\5\u00b2\3\2\2\2\7\u00b9"+
		"\3\2\2\2\t\u00be\3\2\2\2\13\u00c2\3\2\2\2\r\u00c5\3\2\2\2\17\u00c9\3\2"+
		"\2\2\21\u00d0\3\2\2\2\23\u00d3\3\2\2\2\25\u00d7\3\2\2\2\27\u00d9\3\2\2"+
		"\2\31\u00dd\3\2\2\2\33\u00e4\3\2\2\2\35\u00eb\3\2\2\2\37\u00f7\3\2\2\2"+
		"!\u00fd\3\2\2\2#\u0101\3\2\2\2%\u0104\3\2\2\2\'\u0108\3\2\2\2)\u010d\3"+
		"\2\2\2+\u0112\3\2\2\2-\u0117\3\2\2\2/\u0122\3\2\2\2\61\u0129\3\2\2\2\63"+
		"\u012e\3\2\2\2\65\u0135\3\2\2\2\67\u013b\3\2\2\29\u0141\3\2\2\2;\u0148"+
		"\3\2\2\2=\u0153\3\2\2\2?\u0157\3\2\2\2A\u015e\3\2\2\2C\u0160\3\2\2\2E"+
		"\u0165\3\2\2\2G\u016c\3\2\2\2I\u0176\3\2\2\2K\u0180\3\2\2\2M\u0182\3\2"+
		"\2\2O\u0184\3\2\2\2Q\u0186\3\2\2\2S\u0188\3\2\2\2U\u018a\3\2\2\2W\u018c"+
		"\3\2\2\2Y\u018e\3\2\2\2[\u0190\3\2\2\2]\u0193\3\2\2\2_\u0198\3\2\2\2a"+
		"\u019e\3\2\2\2c\u01a2\3\2\2\2e\u01a4\3\2\2\2g\u01ab\3\2\2\2i\u01b1\3\2"+
		"\2\2k\u01b6\3\2\2\2m\u01ba\3\2\2\2o\u01c0\3\2\2\2q\u01c7\3\2\2\2s\u01cf"+
		"\3\2\2\2u\u01d4\3\2\2\2w\u01da\3\2\2\2y\u01dc\3\2\2\2{\u01de\3\2\2\2}"+
		"\u01e0\3\2\2\2\177\u01e2\3\2\2\2\u0081\u01e4\3\2\2\2\u0083\u01e6\3\2\2"+
		"\2\u0085\u01e9\3\2\2\2\u0087\u01ec\3\2\2\2\u0089\u01ef\3\2\2\2\u008b\u01f1"+
		"\3\2\2\2\u008d\u01f4\3\2\2\2\u008f\u01f7\3\2\2\2\u0091\u01fa\3\2\2\2\u0093"+
		"\u01fe\3\2\2\2\u0095\u020c\3\2\2\2\u0097\u021a\3\2\2\2\u0099\u0221\3\2"+
		"\2\2\u009b\u0225\3\2\2\2\u009d\u0238\3\2\2\2\u009f\u023a\3\2\2\2\u00a1"+
		"\u0240\3\2\2\2\u00a3\u024a\3\2\2\2\u00a5\u024e\3\2\2\2\u00a7\u0254\3\2"+
		"\2\2\u00a9\u00aa\7s\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7u\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"\u00b1\7p\2\2\u00b1\4\3\2\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7t\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7u\2\2"+
		"\u00b8\6\3\2\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7x\2\2\u00bb\u00bc\7c"+
		"\2\2\u00bc\u00bd\7n\2\2\u00bd\b\3\2\2\2\u00be\u00bf\7{\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0\u00c1\7u\2\2\u00c1\n\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4"+
		"\7q\2\2\u00c4\f\3\2\2\2\u00c5\u00c6\7@\2\2\u00c6\u00c7\7@\2\2\u00c7\u00c8"+
		"\7@\2\2\u00c8\16\3\2\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc"+
		"\7u\2\2\u00cc\u00cd\7y\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7t\2\2\u00cf"+
		"\20\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d2\7@\2\2\u00d2\22\3\2\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4\u00d5\7i\2\2\u00d5\u00d6\7d\2\2\u00d6\24\3\2\2\2\u00d7"+
		"\u00d8\7\60\2\2\u00d8\26\3\2\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7u\2\2"+
		"\u00db\u00dc\7g\2\2\u00dc\30\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7"+
		"e\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3\32\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\34\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7o\2\2\u00ee"+
		"\u00ef\7r\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7k\2\2"+
		"\u00f2\u00f3\7v\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6"+
		"\7p\2\2\u00f6\36\3\2\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7j\2\2\u00f9\u00fa"+
		"\7c\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7g\2\2\u00fc \3\2\2\2\u00fd\u00fe"+
		"\7u\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7v\2\2\u0100\"\3\2\2\2\u0101\u0102"+
		"\7v\2\2\u0102\u0103\7q\2\2\u0103$\3\2\2\2\u0104\u0105\7c\2\2\u0105\u0106"+
		"\7f\2\2\u0106\u0107\7f\2\2\u0107&\3\2\2\2\u0108\u0109\7v\2\2\u0109\u010a"+
		"\7g\2\2\u010a\u010b\7z\2\2\u010b\u010c\7v\2\2\u010c(\3\2\2\2\u010d\u010e"+
		"\7q\2\2\u010e\u010f\7r\2\2\u010f\u0110\7g\2\2\u0110\u0111\7p\2\2\u0111"+
		"*\3\2\2\2\u0112\u0113\7u\2\2\u0113\u0114\7j\2\2\u0114\u0115\7q\2\2\u0115"+
		"\u0116\7y\2\2\u0116,\3\2\2\2\u0117\u0118\7o\2\2\u0118\u0119\7g\2\2\u0119"+
		"\u011a\7u\2\2\u011a\u011b\7u\2\2\u011b\u011c\7c\2\2\u011c\u011d\7i\2\2"+
		"\u011d\u011e\7g\2\2\u011e\u011f\7d\2\2\u011f\u0120\7q\2\2\u0120\u0121"+
		"\7z\2\2\u0121.\3\2\2\2\u0122\u0123\7k\2\2\u0123\u0124\7o\2\2\u0124\u0125"+
		"\7r\2\2\u0125\u0126\7q\2\2\u0126\u0127\7t\2\2\u0127\u0128\7v\2\2\u0128"+
		"\60\3\2\2\2\u0129\u012a\7h\2\2\u012a\u012b\7k\2\2\u012b\u012c\7n\2\2\u012c"+
		"\u012d\7g\2\2\u012d\62\3\2\2\2\u012e\u012f\7u\2\2\u012f\u0130\7g\2\2\u0130"+
		"\u0131\7n\2\2\u0131\u0132\7g\2\2\u0132\u0133\7e\2\2\u0133\u0134\7v\2\2"+
		"\u0134\64\3\2\2\2\u0135\u0136\7u\2\2\u0136\u0137\7q\2\2\u0137\u0138\7"+
		"n\2\2\u0138\u0139\7k\2\2\u0139\u013a\7f\2\2\u013a\66\3\2\2\2\u013b\u013c"+
		"\7c\2\2\u013c\u013d\7r\2\2\u013d\u013e\7r\2\2\u013e\u013f\7n\2\2\u013f"+
		"\u0140\7{\2\2\u01408\3\2\2\2\u0141\u0142\7g\2\2\u0142\u0143\7h\2\2\u0143"+
		"\u0144\7h\2\2\u0144\u0145\7g\2\2\u0145\u0146\7e\2\2\u0146\u0147\7v\2\2"+
		"\u0147:\3\2\2\2\u0148\u0149\7r\2\2\u0149\u014a\7c\2\2\u014a\u014b\7t\2"+
		"\2\u014b\u014c\7c\2\2\u014c\u014d\7o\2\2\u014d\u014e\7g\2\2\u014e\u014f"+
		"\7v\2\2\u014f\u0150\7g\2\2\u0150\u0151\7t\2\2\u0151\u0152\7u\2\2\u0152"+
		"<\3\2\2\2\u0153\u0154\7p\2\2\u0154\u0155\7g\2\2\u0155\u0156\7y\2\2\u0156"+
		">\3\2\2\2\u0157\u0158\7h\2\2\u0158\u0159\7q\2\2\u0159\u015a\7n\2\2\u015a"+
		"\u015b\7f\2\2\u015b\u015c\7g\2\2\u015c\u015d\7t\2\2\u015d@\3\2\2\2\u015e"+
		"\u015f\7B\2\2\u015fB\3\2\2\2\u0160\u0161\7o\2\2\u0161\u0162\7q\2\2\u0162"+
		"\u0163\7x\2\2\u0163\u0164\7g\2\2\u0164D\3\2\2\2\u0165\u0166\7p\2\2\u0166"+
		"\u0167\7g\2\2\u0167\u0168\7y\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7\"\2"+
		"\2\u016a\u016b\5\u0097L\2\u016bF\3\2\2\2\u016c\u016d\7t\2\2\u016d\u016e"+
		"\7g\2\2\u016e\u016f\7e\2\2\u016f\u0170\7v\2\2\u0170\u0171\7c\2\2\u0171"+
		"\u0172\7p\2\2\u0172\u0173\7i\2\2\u0173\u0174\7n\2\2\u0174\u0175\7g\2\2"+
		"\u0175H\3\2\2\2\u0176\u0177\7u\2\2\u0177\u0178\7g\2\2\u0178\u0179\7v\2"+
		"\2\u0179\u017a\7X\2\2\u017a\u017b\7c\2\2\u017b\u017c\7n\2\2\u017c\u017d"+
		"\7w\2\2\u017d\u017e\7g\2\2\u017e\u017f\7u\2\2\u017fJ\3\2\2\2\u0180\u0181"+
		"\7*\2\2\u0181L\3\2\2\2\u0182\u0183\7+\2\2\u0183N\3\2\2\2\u0184\u0185\7"+
		"<\2\2\u0185P\3\2\2\2\u0186\u0187\7.\2\2\u0187R\3\2\2\2\u0188\u0189\7]"+
		"\2\2\u0189T\3\2\2\2\u018a\u018b\7_\2\2\u018bV\3\2\2\2\u018c\u018d\7}\2"+
		"\2\u018dX\3\2\2\2\u018e\u018f\7\177\2\2\u018fZ\3\2\2\2\u0190\u0191\7k"+
		"\2\2\u0191\u0192\7h\2\2\u0192\\\3\2\2\2\u0193\u0194\7g\2\2\u0194\u0195"+
		"\7n\2\2\u0195\u0196\7u\2\2\u0196\u0197\7g\2\2\u0197^\3\2\2\2\u0198\u0199"+
		"\7y\2\2\u0199\u019a\7j\2\2\u019a\u019b\7k\2\2\u019b\u019c\7n\2\2\u019c"+
		"\u019d\7g\2\2\u019d`\3\2\2\2\u019e\u019f\7x\2\2\u019f\u01a0\7c\2\2\u01a0"+
		"\u01a1\7t\2\2\u01a1b\3\2\2\2\u01a2\u01a3\7?\2\2\u01a3d\3\2\2\2\u01a4\u01a5"+
		"\7t\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7w\2\2\u01a8"+
		"\u01a9\7t\2\2\u01a9\u01aa\7p\2\2\u01aaf\3\2\2\2\u01ab\u01ac\7r\2\2\u01ac"+
		"\u01ad\7t\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7p\2\2\u01af\u01b0\7v\2\2"+
		"\u01b0h\3\2\2\2\u01b1\u01b2\7h\2\2\u01b2\u01b3\7w\2\2\u01b3\u01b4\7p\2"+
		"\2\u01b4\u01b5\7e\2\2\u01b5j\3\2\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7"+
		"p\2\2\u01b8\u01b9\7v\2\2\u01b9l\3\2\2\2\u01ba\u01bb\7h\2\2\u01bb\u01bc"+
		"\7n\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be\7c\2\2\u01be\u01bf\7v\2\2\u01bf"+
		"n\3\2\2\2\u01c0\u01c1\7u\2\2\u01c1\u01c2\7v\2\2\u01c2\u01c3\7t\2\2\u01c3"+
		"\u01c4\7k\2\2\u01c4\u01c5\7p\2\2\u01c5\u01c6\7i\2\2\u01c6p\3\2\2\2\u01c7"+
		"\u01c8\7d\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca\7q\2\2\u01ca\u01cb\7n\2\2"+
		"\u01cb\u01cc\7g\2\2\u01cc\u01cd\7c\2\2\u01cd\u01ce\7p\2\2\u01cer\3\2\2"+
		"\2\u01cf\u01d0\7v\2\2\u01d0\u01d1\7t\2\2\u01d1\u01d2\7w\2\2\u01d2\u01d3"+
		"\7g\2\2\u01d3t\3\2\2\2\u01d4\u01d5\7h\2\2\u01d5\u01d6\7c\2\2\u01d6\u01d7"+
		"\7n\2\2\u01d7\u01d8\7u\2\2\u01d8\u01d9\7g\2\2\u01d9v\3\2\2\2\u01da\u01db"+
		"\7/\2\2\u01dbx\3\2\2\2\u01dc\u01dd\7#\2\2\u01ddz\3\2\2\2\u01de\u01df\7"+
		",\2\2\u01df|\3\2\2\2\u01e0\u01e1\7\61\2\2\u01e1~\3\2\2\2\u01e2\u01e3\7"+
		"-\2\2\u01e3\u0080\3\2\2\2\u01e4\u01e5\7>\2\2\u01e5\u0082\3\2\2\2\u01e6"+
		"\u01e7\7>\2\2\u01e7\u01e8\7?\2\2\u01e8\u0084\3\2\2\2\u01e9\u01ea\7?\2"+
		"\2\u01ea\u01eb\7?\2\2\u01eb\u0086\3\2\2\2\u01ec\u01ed\7#\2\2\u01ed\u01ee"+
		"\7?\2\2\u01ee\u0088\3\2\2\2\u01ef\u01f0\7@\2\2\u01f0\u008a\3\2\2\2\u01f1"+
		"\u01f2\7@\2\2\u01f2\u01f3\7?\2\2\u01f3\u008c\3\2\2\2\u01f4\u01f5\7~\2"+
		"\2\u01f5\u01f6\7~\2\2\u01f6\u008e\3\2\2\2\u01f7\u01f8\7(\2\2\u01f8\u01f9"+
		"\7(\2\2\u01f9\u0090\3\2\2\2\u01fa\u01fb\7\"\2\2\u01fb\u01fc\7\60\2\2\u01fc"+
		"\u01fd\7\"\2\2\u01fd\u0092\3\2\2\2\u01fe\u01ff\7\61\2\2\u01ff\u0200\7"+
		"\61\2\2\u0200\u0204\3\2\2\2\u0201\u0203\13\2\2\2\u0202\u0201\3\2\2\2\u0203"+
		"\u0206\3\2\2\2\u0204\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2"+
		"\2\2\u0206\u0204\3\2\2\2\u0207\u0209\t\2\2\2\u0208\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\bJ\2\2\u020b\u0094\3\2\2\2\u020c\u020d\7\61"+
		"\2\2\u020d\u020e\7,\2\2\u020e\u0212\3\2\2\2\u020f\u0211\13\2\2\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0213\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7,\2\2\u0216"+
		"\u0217\7\61\2\2\u0217\u0218\3\2\2\2\u0218\u0219\bK\2\2\u0219\u0096\3\2"+
		"\2\2\u021a\u021e\t\3\2\2\u021b\u021d\t\4\2\2\u021c\u021b\3\2\2\2\u021d"+
		"\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0098\3\2"+
		"\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7B\2\2\u0222\u0223\5\u0097L\2\u0223"+
		"\u009a\3\2\2\2\u0224\u0226\t\5\2\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u009c\3\2\2\2\u0229"+
		"\u022b\7/\2\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c\u022d\5\u009bN\2\u022d\u022e\7\60\2\2\u022e\u0230\5\u009bN"+
		"\2\u022f\u0231\5\u009fP\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0239\3\2\2\2\u0232\u0234\7/\2\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0236\5\u009bN\2\u0236\u0237\5\u009fP\2"+
		"\u0237\u0239\3\2\2\2\u0238\u022a\3\2\2\2\u0238\u0233\3\2\2\2\u0239\u009e"+
		"\3\2\2\2\u023a\u023c\t\6\2\2\u023b\u023d\t\7\2\2\u023c\u023b\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5\u009bN\2\u023f\u00a0"+
		"\3\2\2\2\u0240\u0245\7$\2\2\u0241\u0244\5\u00a3R\2\u0242\u0244\n\b\2\2"+
		"\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248"+
		"\u0249\7$\2\2\u0249\u00a2\3\2\2\2\u024a\u024b\7^\2\2\u024b\u024c\t\t\2"+
		"\2\u024c\u00a4\3\2\2\2\u024d\u024f\t\n\2\2\u024e\u024d\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\bS\2\2\u0253\u00a6\3\2\2\2\u0254\u0255\13\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0257\bT\2\2\u0257\u00a8\3\2\2\2\20\2\u0204\u0208\u0212\u021e"+
		"\u0227\u022a\u0230\u0233\u0238\u023c\u0243\u0245\u0250\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}