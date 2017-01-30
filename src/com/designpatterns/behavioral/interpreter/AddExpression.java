package com.designpatterns.behavioral.interpreter;

public class AddExpression implements Expression {
	
	private OperationContext context;
	
	public AddExpression(OperationContext context) {
		this.context = context;
	}

	@Override
	public int interpret(int operand1, int operand2) {
		return context.add(operand1, operand2);
	}

}
