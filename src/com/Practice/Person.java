package com.Practice;

public class Person {
	private String Name ;
	private int age;
	private String state;
	private double height;
	private double weight;
	
	public Person() {
	}
		
	public Person(String name, int age, String state, double d, double e) {
		Name = name;
		this.age = age;
		this.state = state;
		this.height = d;
		this.weight = e;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String toString() {
		return "Person [Name=" + Name + ", age=" + age + ", state=" + state
				+ ", height=" + height + ", weight=" + weight + "]";
	}

}


