package com.kh.silsub5.student.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	public Student() {}
	public Student(int grade, int classroom, String name, double height, char gender) {
		Student.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	public static int getGrade() {
		return grade;
	}
	public static void setGrade(int grade) {
		Student.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void information() {
		System.out.println("이름 : "+ name);
		System.out.println(" 반 : "+ classroom);
		System.out.println(" 키 : "+ height);
		System.out.println("성별: "+ gender);
		System.out.println("성적:" + grade);
	}
}
