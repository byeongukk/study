package com.kh.operator;

public class G_복합대입연산자 {
	public void opTest() {
		int result, num = 12;
		
		System.out.println("num : " + num);
		
		num = num + 3;
		System.out.println("num : " + num);
		
		num += 3; // 위와 결과값은 같지만 직접적으로 메모리에 값을 추가하기 때문에 더 빠르다
		System.out.println("num : " + num);
		
		num -= 5; // num 에 5를 뺀값을 num에 넣음
		System.out.println("num : " + num);
		
		num *= 2;
		System.out.println("num : " + num);
		
		num /= 2;
		System.out.println("num : " + num);
		
	}
	public static void main(String[] args) {
		G_복합대입연산자 test = new G_복합대입연산자();
		test.opTest();
	}
}
