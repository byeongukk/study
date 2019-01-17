package com.kh.objectArray.person.model.vo;

public class Person {
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;

	public Person() {}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name,int age,char gender,double height,double weight) {
		this(name,age);
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	//복사 생성자 : 깊은복사용
	public Person(Person p) {
		this.name = p.name;
		this.age = p.age;
		this.gender = p.gender;
		this.height = p.height;
		this.weight = p.weight;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	//출력용 메소드
	public String showPersonInfo() {
		return this.name + ", " 
				+ this.age + ", " 
				+ this.gender + ", " 
				+ this.height + ", " 
				+ this.weight;
	}
	
	
	
}














