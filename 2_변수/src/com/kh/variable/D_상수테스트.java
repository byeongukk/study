package com.kh.variable;

public class D_상수테스트 {

	public static void main(String[] args) {
		new D_상수테스트().testFinal();
		new D_상수테스트().testF();
	}
	public void testFinal() {
		//상수 테스트
		int age;
		final int AGE; // 상수도 steak영역에 추가됨
		age = 20;
		AGE = 20;
		
		age = 30;
		// AGE = 30; 상수는 초기화 하면 변경 불가
		System.out.println(AGE + 20);
	}
	public void testF() {
		int i = 300;
		System.out.println(i);
	}
}


