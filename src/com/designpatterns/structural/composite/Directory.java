package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends PathComponent {

	private String directoryName;
	private List<PathComponent> subComponentList;

	public Directory(String directoryName) {
		subComponentList = new ArrayList<PathComponent>();
		this.directoryName = directoryName;
	}

	@Override
	public String getName() {
		return directoryName;
	}

	public void addSubComponent(PathComponent subComponent) {
		subComponentList.add(subComponent);
	}

	public void removeSubComponent(PathComponent subComponent) {
		subComponentList.remove(subComponent);
	}

	@Override
	public void printInfo(int indent) {
		putIndent(indent);
		System.out.println(">" + getName());
		for (PathComponent subComponent : subComponentList) {
			subComponent.printInfo(indent + 2);
		}
	}
}
