package com.kh.variable;

import java.util.Scanner;

public class C_변수값변경테스트 {
	public static void main(String[] args) {
		changeValue();
	}
	public static void changeValue() {
		String name;
		char gender;
		int age;
		double height;
		
		name = "최병욱";
		gender = 'M';
		age = 20;
		height = 199.9;
		
		
		System.out.println("이름은 :" + name);
		System.out.println("성별은 :" + gender);
		System.out.println("나이는 :" + age);
		System.out.println("키는   :" + height);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		name = scan.nextLine();
		System.out.println("성별을 입력해주세요 : ");
		//문자를 읽어오는 메소드는 charAt 메소드로 받아온다 
		gender = scan.next().charAt(0);
		System.out.println("나이를 입력해주세요");
		age = scan.nextInt();
		System.out.println("키를 입력해 주세요 : ");
		height = scan.nextDouble();
		System.out.println("이름은 :" + name);
		System.out.println("성별은 :" + gender);
		System.out.println("나이는 :" + age);
		System.out.println("키는   :" + height);
		
		
	}
	
}
