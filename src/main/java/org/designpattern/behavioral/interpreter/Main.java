package org.designpattern.behavioral.interpreter;

import org.designpattern.behavioral.interpreter.expressions.Expression;
import org.designpattern.behavioral.interpreter.expressions.Minus;
import org.designpattern.behavioral.interpreter.expressions.Number;
import org.designpattern.behavioral.interpreter.expressions.Plus;

public class Main {
    public static void main(String[] args) {
        Expression firstNumber = new Number(5);
        Expression secondNumber = new Number(10);

        // (5 + 10) - 5
        Expression addition = new Plus(firstNumber, secondNumber);
        Expression subtraction = new Minus(addition, firstNumber);

        System.out.println("(5 + 10) - 5 = " + subtraction.interpret());
    }
}
