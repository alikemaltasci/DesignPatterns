package com.designpatterns.behavioral.interpreter;

public class InterpreterTest {

	OperationContext context;

	public InterpreterTest() {
		context = new OperationContext();
	}

	public int interpret(String input) {
		Expression expression = null;

		String[] splitArr = input.split(" ");
		String operation = splitArr[0];		
		String operands = splitArr[1];
		
		splitArr = operands.split(",");
		int operand1 = Integer.valueOf(splitArr[0]);
		int operand2 = Integer.valueOf(splitArr[1]);
		
		if (operation.equals("ADD")) {
			expression = new AddExpression(context);
		} else if (operation.equals("SUBTRACT")) {
			expression = new SubtractExpression(context);
		} else if (operation.equals("DIVIDE")) {
			expression = new DivideExpression(context);
		} else if (operation.equals("MULTIPLY")) {
			expression = new MultiplyExpression(context);
		} else
			return 0;

		return expression.interpret(operand1, operand2);

	}

	public static void main(String[] args) {

		String expression1 = "ADD 6,4";
		String expression2 = "SUBTRACT 10,4";
		String expression3 = "MULTIPLY 3,4";
		String expression4 = "DIVIDE 12,4";
		
		InterpreterTest client = new InterpreterTest();
		System.out.println(expression1 + " " + client.interpret(expression1));
		System.out.println(expression2 + " " + client.interpret(expression2));
		System.out.println(expression3 + " " + client.interpret(expression3));
		System.out.println(expression4 + " " + client.interpret(expression4));

	}

}
