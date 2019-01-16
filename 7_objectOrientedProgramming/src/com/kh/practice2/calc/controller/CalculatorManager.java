package com.kh.practice2.calc.controller;

public class CalculatorManager {
	
	public CalculatorManager() {}
	
	public void checkMethod() {
		System.out.println("함수 호출 확인 ");
	}
	public int sum1to10() {
		int sum = 0;
		for(int i=1; i <=10; i++) {
			sum ++;
		}
		return sum;
	}
	public void checkMaxNumber(int a, int b) {
		int max, min;
		if(a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		System.out.println("큰 값은 : " + max);
	}
	public int sumTwoNumber(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public int minusTwoNumber(int a, int b) {
		int sub = a - b;
		return Math.abs(sub);
	}
	
	
}
