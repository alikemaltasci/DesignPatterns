package com.designpatterns.behavioral.interpreter;

public class MultiplyExpression implements Expression {

	private OperationContext context;

	public MultiplyExpression(OperationContext context) {
		this.context = context;
	}

	@Override
	public int interpret(int operand1, int operand2) {
		return context.multiply(operand1, operand2);
	}

}
