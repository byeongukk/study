package com.kh.silsub1.student.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private int stdNo;
	private String name;
	
	public Student() {}
	public Student(int grade, int classroom, int stdNo, String name) {
		this.grade = grade;
		this.classroom = classroom;
		this.stdNo = stdNo;
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public int getStdNo() {
		return stdNo;
	}
	public String getName() {
		return name;
	}
	
	public String information() {
		String std = grade + "반 " +
					 classroom + "번" +
					 stdNo + "번" +
					 name;
		return std;
	}
	
}
