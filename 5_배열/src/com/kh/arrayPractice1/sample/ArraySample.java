package com.kh.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	Scanner scan = new Scanner(System.in);	
	
public void test1() {
		int sum=0;
		int[] arr = new int[10];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(100)+1;
			arr[i] = random;
			System.out.println(i+1 + "번 : " + arr[i]);
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
	}
	public void test2() {
		int min=0,max=0;
		int[] arr = new int[10];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(100)+1;
			arr[i] = random;
			System.out.println(i+1 + "번 : " + arr[i]);
			if(i==0) {
				min = arr[i];
				max = arr[i];
			} else {
				if(max<=arr[i]) {
					max = arr[i];
				} else if(min>=arr[i]) {
					min = arr[i];
				}
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	
	}
	public void test3() {
		byte barr[] = new byte[10];
		Random ran = new Random();
		int sum = 0;
		for(int i=0; i<barr.length; i++) {
			barr[i] = (byte)(ran.nextInt(255)-Byte.MAX_VALUE);
			System.out.println(i+1+"번째 : "+barr[i]);
			if(barr[i]%2==0) {
				System.out.println(i+1+"번째는 짝수");
				sum += barr[i];
			}
		}
		System.out.println(sum);
	}
	public void test4() {
		String strNum = null;
		System.out.print("숫자를 입력하세요");
		strNum = scan.nextLine();
		int sum = 0;
		int[] arr = new int[strNum.length()];
		for(int i=0; i<strNum.length(); i++) {
			arr[i] = Integer.parseInt(strNum.substring(i, i+1)); 
			sum += arr[i];
		}
		System.out.println("각자리를 더한 값은" + sum);
	}
	public void test5() {
		String strNum = null;
		System.out.print("숫자를 입력하세요");
		strNum = scan.nextLine();
		int sum = 0;
		int[] arr = new int[strNum.length()];
		for(int i=0; i<strNum.length(); i++) {
			arr[i] = (int)(strNum.charAt(i)-48);
			sum += arr[i];
		}
		System.out.println("각자리를 더한 값은" + sum);
	}
}
