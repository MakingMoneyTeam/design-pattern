package org.designpattern.behavioral.interpreter.expressions;

public class Minus implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public Minus(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
