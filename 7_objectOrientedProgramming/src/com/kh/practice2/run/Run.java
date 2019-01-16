package com.kh.practice2.run;

import com.kh.practice2.calc.controller.CalculatorManager;

public class Run {

	public static void main(String[] args) {
		int num1, num2;
		//기본 생성자를 통한 객체 생성
		CalculatorManager cm = new CalculatorManager();
		
		//메소드 호출 확인용 메스도 호출
		cm.checkMethod();
		
		//함수를 호출하여 1~10까지의 합을 리턴 받아 출력
		System.out.println("1부터 10까지의 합 : " + cm.sum1to10());
		
		//10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출 
		num1 = 10;
		num2 = 20;
		cm.checkMaxNumber(num1, num2);
		
		//10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
		System.out.println(num1 +"과" + num2 +" 합은" + cm.sumTwoNumber(num1, num2));
		
		//10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
		num1 = 5;
		num2 = 10;
		System.out.println(num1 + "과" + num2 +"의 차는 " + cm.minusTwoNumber(num1, num2));
		
	}

}
