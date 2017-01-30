package com.designpatterns.structural.composite;

public abstract class PathComponent {

	public abstract String getName();
	public void printInfo(int indent){
		putIndent(indent);
	}
	public void putIndent(int indent){
		for(int i = 0; i<indent;i++){
			System.out.print("-");
		}
	}

}
