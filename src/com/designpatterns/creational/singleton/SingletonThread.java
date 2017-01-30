package com.designpatterns.creational.singleton;

public class SingletonThread implements Runnable {

	private String name;
	
	public SingletonThread(String name){
		this.name = name;
	}

	@Override
	public void run() {
		
		long t = System.currentTimeMillis();
		Singleton instance1 = Singleton.getInstance();
		System.out.println("instance " + this.name + " id is " + System.identityHashCode(instance1));
		System.out.println("instance " + this.name + "  is " + instance1.getLetters());
		System.out.println("partList is " + instance1.getPart(2));
		System.out.println("instance " + this.name + "  is " + instance1.getLetters());
		
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println("instance " + this.name + "  id is " + System.identityHashCode(instance2));
		System.out.println("instance " + this.name + "  is " + instance2.getLetters());
		System.out.println("time passed in "+  this.name +" is" + (System.currentTimeMillis()-t));

		
	}

}
