// Generated from PythonGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonGrammarParser}.
 */
public interface PythonGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PythonGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PythonGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PythonGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PythonGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PythonGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PythonGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#printRule}.
	 * @param ctx the parse tree
	 */
	void enterPrintRule(PythonGrammarParser.PrintRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#printRule}.
	 * @param ctx the parse tree
	 */
	void exitPrintRule(PythonGrammarParser.PrintRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#conds}.
	 * @param ctx the parse tree
	 */
	void enterConds(PythonGrammarParser.CondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#conds}.
	 * @param ctx the parse tree
	 */
	void exitConds(PythonGrammarParser.CondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(PythonGrammarParser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(PythonGrammarParser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void enterElseblock(PythonGrammarParser.ElseblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void exitElseblock(PythonGrammarParser.ElseblockContext ctx);
}