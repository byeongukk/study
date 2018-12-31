package com.kh.chap00_beforeTest;

import java.util.Random;

public class MathTest {
	
/*	
 * 자바에서는 클래스가 제공하는 필드(전역변수)나 메소드 사용시
	반드시new를 사용해 객체를 생성해야 사용할 수 이다.
	해당하는 주소를 가진 레퍼런스변수를 이용해 실행해야만 한다
	클래스명 레퍼런스변수명 = new 클래스명();
	레퍼런스변수명.메소드명(); --> non-static메소드일 때 메소드 호출방법
	
	static 메소드의 경우 호출하기 위해서 new를 사용하지 않아도 된다.
	클래스명.메소드명(); --> static 메소드인 경우에 메소드 호출 방법
	클래스명.필드명; --> static 필드에 대한 접근
*/
	public static void testMath() {
		System.out.println("상수 PI : " + Math.PI);
		System.out.println("난수 : " + Math.random());
		System.out.println("-7의 절대값 : " + Math.abs(-3453.3));
	}
	public static void practiceRandom() {
		//사용자가 원하는 랜덤 범위의 값 추출
		//0 ~ 9까지의 랜덤수
		//1~10까지의 랜덤수
		//20~35까지의 랜덤수
		//0 또는 1
		
		//위의 4가지 범위의 난수를 출력하는 구문들 작성해보자(실습
		//단, Math.random()과 Random()클래스를 둘 다 사용할 거
		boolean bl = new Random().nextBoolean();
		System.out.println(bl);
		
		int num1 = (int)(Math.random()*10);
		System.out.println("Math.random() 0~9까지의 랜덤수 : " + num1);
		
		int num2 = new Random().nextInt(10);
		System.out.println("Random() 0~9까지의 랜덤수  : " + num2);
	
		int num3 = (int)(Math.random()*10)+1;
		System.out.println("Math.random() 1~10까지의 랜덤수 : " + num3);
		
		int num4 = new Random().nextInt(10)+1;
		System.out.println("Random() 1~10까지의 랜덤수  : " + num4);
		
		int num5 = (int)(Math.random()*16)+20;
		System.out.println("Math.random() 20~35까지의 랜덤수 : " + num5);
	
		int num6 = new Random().nextInt(16)+20;
		System.out.println("Random() 20~35까지의 랜덤수 : " + num6);
		
		int num7 = (int)(Math.random()*2);
		System.out.println("Math.random() 0또는1 : " + num7);
		
		int num8 = new Random().nextInt(2);
		System.out.println("Random() 0또는1 : " + num8);
	}
	
	public static void testRandom() {
		//1부터 100까지 난수 구하기
		// int num1 = (int)(Math.random()*100)+1;
		
		//0부터 괄호 안의 정수 전까지 난수를 발생시킴
		int random = new Random().nextInt(100) + 1;
		System.out.println(random);
	}
	
	public static void main(String[] args) {
		//testMath();
		//testRandom();
		practiceRandom();
	}

}
