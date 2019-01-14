package com.kh.array;

public class D_dd {

	public void test() {
		int a = 20;
		int b = 20;
		int num1 = 0;
		int num2 = 0;
		num1 = a++;
		num2 = --b; 
		
		int sum = b;
		
		
		System.out.println(sum);
		System.out.println("a : " + a + " num 1 : " + num1);
		System.out.println("b : " + b + " num 2 : " + num2);
		char[] ch = new char[5];
		ch[0] = 'A';
		ch[1] = 'B';
		int[] in = new int[5];
		in[0] = 5; 
		char[][] ch2 = new char[5][3];
		System.out.println(ch.hashCode());
		System.out.println(in);
		System.out.println(ch2);
		
	}
	
}
