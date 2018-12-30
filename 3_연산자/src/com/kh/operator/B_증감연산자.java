package com.kh.operator;

public class B_증감연산자 {

	public void test1(){
		//++ : 1증가의 의미, ++값 , 값++ 로 사용
		//-- : 1감소의 의미, --값 , 값-- 로 사용
		int age = 20;
		
		System.out.println("현재나이는 : " + age + "세");
		
		++age;
		System.out.println("++age의 결과는 ? : " + age + "세");
		
		age++;
		System.out.println("age++의 결과는 ? : " + age + "세");
		
		--age;
		System.out.println("--age의 결과는 ? : " + age);
		
		age--;
		System.out.println("age--의 결과는  ? : " + age);
		
	}
	public void test2() {
		int num1 = 20;
		//계산을 먼저 처리하고 난 뒤 증가 처리가 됨
		int result = num1++ * 3;
		System.out.println(num1);
		System.out.println(result);
		
		int num2 = 20;
		
		int result2 = ++num2 *3;
		System.out.println(result2);
	}
	
	public static void main(String[] args) {
		B_증감연산자 test = new B_증감연산자();
		//test.test1();
		test.test2();
	}
	
	
}
