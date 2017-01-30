package com.designpatterns.creational.singleton;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {
	
	private static Singleton instance = null;
	private String[] letters = {"a","b","c","d","e","f","g","h"};
	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(letters));
	
	private static boolean firstThread = true;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		
		if(instance == null){
			
			if(firstThread){
				
				firstThread = false;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			synchronized (Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
			
		}
		
		return instance;
	}
	
	public LinkedList<String> getLetters(){
		return this.letterList;
	}
	
	public LinkedList<String> getPart(int size){
		LinkedList<String> partList = new LinkedList<String>();
		for (int i = 0; i < size; i++) {
			partList.add(letterList.removeFirst());
		}
		
		return partList;
		
		
		
	}

}
