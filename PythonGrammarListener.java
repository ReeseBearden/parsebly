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
	 * Enter a parse tree produced by {@link PythonGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PythonGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PythonGrammarParser.BlockContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#whileblock}.
	 * @param ctx the parse tree
	 */
	void enterWhileblock(PythonGrammarParser.WhileblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#whileblock}.
	 * @param ctx the parse tree
	 */
	void exitWhileblock(PythonGrammarParser.WhileblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#forblock}.
	 * @param ctx the parse tree
	 */
	void enterForblock(PythonGrammarParser.ForblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#forblock}.
	 * @param ctx the parse tree
	 */
	void exitForblock(PythonGrammarParser.ForblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#functionblock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionblock(PythonGrammarParser.FunctionblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#functionblock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionblock(PythonGrammarParser.FunctionblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PythonGrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PythonGrammarParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PythonGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PythonGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PythonGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PythonGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PythonGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PythonGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(PythonGrammarParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(PythonGrammarParser.VarnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#ctype}.
	 * @param ctx the parse tree
	 */
	void enterCtype(PythonGrammarParser.CtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#ctype}.
	 * @param ctx the parse tree
	 */
	void exitCtype(PythonGrammarParser.CtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(PythonGrammarParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(PythonGrammarParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(PythonGrammarParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(PythonGrammarParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(PythonGrammarParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(PythonGrammarParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonGrammarParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(PythonGrammarParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonGrammarParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(PythonGrammarParser.NewlineContext ctx);
}