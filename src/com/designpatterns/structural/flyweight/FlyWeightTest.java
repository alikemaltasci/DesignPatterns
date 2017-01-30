package com.designpatterns.structural.flyweight;

public class FlyWeightTest {

	public static void main(String[] args) {

		SquareFactory factory = new SquareFactory();

		System.out.println("Drawing chess board");
		for (int i = 0; i < 8; i++) {
			System.out.println("Drawing row:" + (i + 1));
			for (int j = 0; j < 4; j++) {
				Square black = factory.getSquare("Black");
				Square white = factory.getSquare("White");
				System.out.print("(id: " + System.identityHashCode(black)+" ) ");
				black.draw();
				System.out.print("(id: " + System.identityHashCode(white)+" ) ");
				white.draw();
			}
		}
	}

}
