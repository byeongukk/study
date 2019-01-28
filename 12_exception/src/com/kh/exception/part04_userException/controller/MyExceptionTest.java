package com.kh.exception.part04_userException.controller;

import java.util.Scanner;

import com.kh.exception.part04_userException.exception.MyException;

public class MyExceptionTest {
	public void inputAge() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void checkAge(int age) throws MyException {
		if(age < 19) {
			throw new MyException("입장 불가!");
		} else {
			System.out.println("즐감여");
		}
	}
}
