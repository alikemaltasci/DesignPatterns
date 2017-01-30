package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SquareFactory {
	
	Map<String,Square> squareMap = new HashMap<String,Square>();
	
	public Square getSquare(String color){
		Square square = squareMap.get(color);
		if(square == null){
			square = new Square(color);
			squareMap.put(color, square);
		}
		
		return square;
	}

}
