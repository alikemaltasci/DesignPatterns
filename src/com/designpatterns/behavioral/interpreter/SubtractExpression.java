package com.designpatterns.behavioral.interpreter;

public class SubtractExpression implements Expression {
	
	private OperationContext context;
	
	public SubtractExpression(OperationContext context) {
		this.context = context;
	}

	@Override
	public int interpret(int operand1, int operand2) {
		return context.subtract(operand1, operand2);
	}

}
