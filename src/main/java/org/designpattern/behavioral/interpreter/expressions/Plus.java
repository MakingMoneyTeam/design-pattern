package org.designpattern.behavioral.interpreter.expressions;

public class Plus implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public Plus(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
