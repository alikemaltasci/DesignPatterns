package com.designpatterns.creational.singleton;

public class SingletonThreadTest{

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new SingletonThread("thread1"));
		Thread thread2 = new Thread(new SingletonThread("thread2"));
		 
		long t = System.currentTimeMillis();
				
		
		thread1.start();
		thread2.start();
		System.out.println("time passed is " + (System.currentTimeMillis()-t));
		

	}
}
