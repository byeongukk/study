package com.kh.variable;

public class E_오버플로우테스트 {

	public static void main(String[] args) {
		//printValueSize();
		//testOverFlow();
		calc();
	}
	public static void printValueSize() {
		//변수의 사이즈
		System.out.println("byte의 크기 : " + Byte.BYTES + "byte");
		System.out.println("short의 크기 : " + Short.BYTES + "byte");
		System.out.println("int의 크기 : " + Integer.BYTES + "byte");
		System.out.println("long의 크기 : " + Long.BYTES + "byte");
		
		System.out.println("float의 크기 : " + Float.BYTES + "byte");
		System.out.println("double의 크기 : " + Double.BYTES + "byte");
		
		System.out.println("char의 크기 : " + Character.BYTES + "byte");
	}
	public static void testOverFlow() {
		//byte bnum = 128; //에러, 최댓값인 127의 범위를 벗어난 값이기 때문
		
		//계산 과정에서 범위를 벗어나면 오버플로우 처리된다.
		//값이 순환됨 최대값 127 --> 최소값 -128
		
		byte bnum = 127;
		bnum = (byte)(bnum); //byte + int --> int(형변환이 필요)
		System.out.println("bnum : " + bnum);

	}
	public static void calc() {
		//에러가 발생하지는 않지만 예상되는 결과값이 나오지 않기 때문에 주의해야함.
		int num1 = 100000000;
		int num2 = 70000000;
		
		//int multi = num1 * num2;
		long multi = num1 * (long)num2;
		
		
		System.out.println(multi);
	}

}