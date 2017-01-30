package com.designpatterns.structural.composite;

public class CompositeTest {

	public static void main(String[] args) {
		Directory myDirectory = new Directory("MyDirectory");
		
		Directory myPhotos = new Directory("MyPhotos");
		myDirectory.addSubComponent(myPhotos);

		Directory myPrivatePhotos = new Directory("MyPrivatePhotos");
		myPhotos.addSubComponent(myPrivatePhotos);
		
		File myPhoto = new File("MyPhoto");
		myPhotos.addSubComponent(myPhoto);
		
		
		File myPrivatePhoto = new File("MyPrivatePhoto");
		myPrivatePhotos.addSubComponent(myPrivatePhoto);
		
		
		Directory myDocuments = new Directory("MyDocuments");
		myDirectory.addSubComponent(myDocuments);
		
		File myCV = new File("MyCV.pdf");
		File myTodos = new File("MyTodos.tct");
		myDocuments.addSubComponent(myCV);
		myDocuments.addSubComponent(myTodos);
		
		myDirectory.printInfo(0);
		
				
		
		

	}

}
