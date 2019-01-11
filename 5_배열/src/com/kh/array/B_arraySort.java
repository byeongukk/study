package com.kh.array;

import java.util.Random;

public class B_arraySort {
	public void testArraySort() {
		//변수의 두 값 변경하기
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int temp;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		//배열도 동일한 방식으로 위치를 변경할 수 있다.
		int[] arr = {2,1,3};
		
		int temp2;
		
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println("arr["+i+"] =" + arr[i]);
		}
	}
	public void testArraySort2() {
		int[] iarr = {2,5,4,6,1,3};
		
		//순차정렬
		//순차정렬이란 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로
		//배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 알고리즘

		//오름차순 정렬
		//인덱스 한 개 씩 증가시키는 반복문
		for(int i=1; i < iarr.length; i++) {
			
			//인덱스가 증가할 때마다 처음부터 해당 인덱스 전까지 값을 비교하는 반복문
			for(int j = 0; j < i; j++) {
				//같을 비교하여 교환처리
				if(iarr[i] < iarr[j]) {  // > 로 바꿔주면 내림차순이 됨
					int temp;
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}
			}
		}
		for(int i = 0; i < iarr.length; i++) {
			if(i < iarr.length - 1) {
				System.out.print(iarr[i] + ", ");
			} else {
				System.out.print(iarr[i]);
			}
		}
	}
	public void testArraySort3() {
		int[] iarr = new int[5];
		Random ran = new Random();	
		
		for(int i=0; i < iarr.length; i++) {
			iarr[i] = ran.nextInt(10);
			System.out.println(i+"번째 인덱스의 값 : " + iarr[i]);
		}
		
		for(int i = 1; i <iarr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(iarr[j] > iarr[i]) {
					int temp;
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}
			}
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i=0; i <iarr.length; i++) {
			System.out.println(i+"번째 인덱스의 값 : " + iarr[i]);
		}
		
	}
}
