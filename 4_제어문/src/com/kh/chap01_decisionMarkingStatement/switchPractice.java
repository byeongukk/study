package com.kh.chap01_decisionMarkingStatement;

public class switchPractice {
	public static void main(String[] args) {
		switchTest();
	}
	public static void switchTest() {
		String str = "abc";
		switch(str) {
		case "abc" : System.out.println(str); break;
		default : System.out.println("error");
		
		}
		
		
	}
	
}
