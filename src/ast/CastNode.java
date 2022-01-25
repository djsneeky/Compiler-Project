package ast;

import ast.visitor.ASTVisitor;
import compiler.Scope;

public class CastNode extends ExpressionNode {
    
    private ExpressionNode expr;
    private Scope.Type type;

    public CastNode(ExpressionNode expr, Scope.Type type) {
        this.setExpr(expr);
        this.setCastType(type);
    }

    @Override
	public <R> R accept(ASTVisitor<R> visitor) {
		return visitor.visit(this);
	}
    
    public ASTNode getExpr() {
        return expr;
    }

    private void setExpr(ExpressionNode expr) {
        this.expr = expr;
    }

    public Scope.Type getCastType() {
        return type;
    }

    private void setCastType(Scope.Type type) {
        this.type = type;
    }
}
