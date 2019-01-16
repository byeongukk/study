package com.kh.silsub5.student.controller;

import java.util.Scanner;

import com.kh.silsub5.student.model.vo.Book;
import com.kh.silsub5.student.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book("드래곤볼","어딘가","일본인");
		b1.information();
		Book b2 = new Book("원피스","ㅁㄴㅇ","오다",10000,20.0);
		b2.information();
		Book b = new Book();
		b.information();
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력 : ");
		int grade = scan.nextInt();
		System.out.println("반을 입력 : ");
		int classroom = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("이름 입력 : ");
		String name = scan.nextLine();
		System.out.println("키를 입력 : ");
		double height = scan.nextDouble();
		System.out.println("성별 입력 : ");
		char gender = scan.next().charAt(0);
		
		Student s1 = new Student(grade,classroom,name,height,gender);
		s1.information();
	}

}
