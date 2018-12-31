package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class ifPractice {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ifTest();
	}
	public static void ifTest() {
		int random1 = (int)(Math.random()*3)+1;
		int random2 = (int)(Math.random()*3)+1;
		int random3 = (int)(Math.random()*3)+1;
		
		System.out.println("random1 의 값 : " + random1);
		System.out.println("random2 의 값 : " + random2);
		System.out.println("random3 의 값 : " + random3);
		
		
		
		if((random1==random2)&&(random2==random3)&&(random1==random3)) {
			System.out.println("셋이 비겼습니다");
		} else {
			if(random1==random2) {
				System.out.println("");
			}

		}
		
	}

}
