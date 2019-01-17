package com.kh.silsub1.student.controller;

import java.util.Scanner;

import com.kh.silsub1.student.model.vo.Student;

public class StudentManager {
	private Scanner sc = new Scanner(System.in);
	private Student[] students = new Student[3];
	
	public StudentManager() {}
	
	public void insertStudentData() {
		System.out.println("===학생정보 입력====");
		for(int i=0; i < students.length; i++) {
			System.out.print(i+1 + "번째 학생 이름 입력 : ");
			String name = sc.nextLine();
			System.out.print(i+1 + "번째 학생 학년 입력 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.print(i+1 + "번째 학생 반 입력 : ");
			int classroom = sc.nextInt();
			System.out.print(i+1 + "번째 학생 번호 입력 : ");
			int stdNo = sc.nextInt();
			sc.nextLine();
			students[i] = new Student(grade,classroom,stdNo,name);
		}
	}
	public void printStudentData() {
		for(int i=0; i < students.length; i++) {
			System.out.println(students[i].information());
		}
	}
	
}
