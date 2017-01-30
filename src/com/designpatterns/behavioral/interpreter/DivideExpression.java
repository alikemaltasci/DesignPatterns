package com.designpatterns.behavioral.interpreter;

public class DivideExpression implements Expression {

	private OperationContext context;

	public DivideExpression(OperationContext context) {
		this.context = context;
	}

	@Override
	public int interpret(int operand1, int operand2) {
		return context.divide(operand1, operand2);
	}

}
