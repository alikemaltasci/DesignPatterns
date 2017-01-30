package com.designpatterns.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {

		long t = System.currentTimeMillis();
		Singleton instance1 = Singleton.getInstance();
		System.out.println("instance1 id is " + System.identityHashCode(instance1));
		System.out.println("instance 1 is " + instance1.getLetters());
		System.out.println("partList is " + instance1.getPart(2));
		System.out.println("instance 1 is " + instance1.getLetters());
		
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println("instance1 id is " + System.identityHashCode(instance2));
		System.out.println("instance 1 is " + instance2.getLetters());
		
		System.out.println("time passed is " + (System.currentTimeMillis()-t));
		
		 
	}

}
