package com.kh.arrayPractice1.sample;

import java.util.Random;

public class ArraySample {
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
		System.out.println(Byte.MAX_VALUE);
		for(int i=0; i<barr.length; i++) {
			//barr = (byte)(ran.nextInt(255)-127);
		}
	}


}
