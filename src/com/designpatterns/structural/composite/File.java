package com.designpatterns.structural.composite;

public class File extends PathComponent {

	private String fileName;

	public File(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String getName() {
		return fileName;
	}

	@Override
	public void printInfo(int indent) {
		putIndent(indent);
		System.out.println(getName());
	}

}
