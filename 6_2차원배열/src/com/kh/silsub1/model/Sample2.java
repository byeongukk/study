package com.kh.silsub1.model;

import java.util.Random;
import java.util.Scanner;

public class Sample2 {
	Scanner scan = new Scanner(System.in);
public void munjae1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("행을 입력하세요 : ");
		int row = scan.nextInt();
		System.out.println("열을 입력하세요 : ");
		int col = scan.nextInt(); 
		Random ran = new Random();
		int[][] arr = new int[row][col];
		
		
		if(row==col && (row>0 && col>0)) { // 행과 열이 같으면서 양수여야함
			//랜덤값 넣기
			for(int i=0; i < arr.length; i++) {
				for(int j=0; j < arr[i].length; j++) {
					
					// 각 행과 열 마지막이 아니라면 값을 넣는다
					if(!(arr[i].length-1 == j || arr.length-1 == i)) {
						arr[i][j] = ran.nextInt(5)+1;
						arr[i][arr[i].length-1] += arr[i][j]; // arr[i]번째 마지막 인덱스에 값을 더해 넣는다
						arr[arr.length-1][j] += arr[i][j]; //arr마지막 행에 j번째 값을 넣는다 
						arr[row-1][col-1] += arr[i][j]*2;  //마지막행 마지막열에 값들을 2배씩 넣는다
					}
					
					/*
					// 마지막행 마지막 열이 아니면서 , arr[i] 마지막 행일때 그 값을 더한다
					if(!(arr[i][j] == arr[row-1][col-1]) && (arr[i].length-1 == j)) {
						arr[row-1][col-1] += arr[i][j];
					}
					// 마지막행 마지막 열이 아니며 ,arr 마지막 열일때 그 값들을 더한다
					if(!(arr[i][j] == arr[row-1][col-1]) && arr.length-1==i) {
						arr[row-1][col-1] += arr[i][j];
					}
					*/
				}
			}
			Sample.printArray(arr);
		} else {
			System.out.println("행과 열이 같아야합니다");
		}
	}
	public void munjae2() {
		int arr[][] = new int[3][];
		for(int i=0; i <arr.length; i++) {
			System.out.println(i + "번째 인덱스 열 입력 :");
			arr[i] = new int[scan.nextInt()];
		}
		int sum[] = new int[arr.length];
		Random ran = new Random();
		for(int i=0; i <arr.length; i++) {
			for(int j=0; j <arr[i].length; j++) {
				arr[i][j] = ran.nextInt(50)+1;
				sum[i] += arr[i][j];
			}
			System.out.println(sum[i]);
		}

		
		for(int i=0; i <arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				if(sum[i]%5 ==0) {
					if(j!=arr[i].length-1) {
						System.out.print(arr[i][j]);
						System.out.print(", ");
					} else {
						System.out.println();
					}
				}
			}
		}
	}
}
