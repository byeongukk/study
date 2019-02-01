package com.kh.collection.part01_list.arrayListSort.model.vo;

public class Customer implements java.io.Serializable{
	private String name;
	private int age;
	private char gender;
	private double point;

	public Customer() {
		
	}
	public Customer(String name, int age, char gender, double point) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}


	public double getPoint() {
		return point;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPoint(double point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", gender=" + gender + ", point=" + point + "]";
	}
	
	
}

















