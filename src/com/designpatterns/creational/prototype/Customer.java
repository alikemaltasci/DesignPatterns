package com.designpatterns.creational.prototype;

public class Customer implements Cloneable {

	private String name;
	private String surname;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	protected Object clone(){
		Object clone = null;
		try {
			clone = super.clone();
			System.out.println("Customer is cloned");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

}
