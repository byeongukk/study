package com.kh.silsub1.model;

import java.util.Random;
import java.util.Scanner;

public class Sample {
	Scanner scan = new Scanner(System.in);
	public void munjae1(){
		Random ran = new Random();
		do {
			int cul,row;
			System.out.println("행을 입력하세요 : ");
			cul = scan.nextInt();
			System.out.println("열을 입력하세요");
			row = scan.nextInt();
			int[][] iarr = new int[cul][row];
			if(cul == row && (cul!=0&&row!=0)) {
				
				for(int i=0; i < iarr.length; i++) {
					for(int j=0; j < iarr[i].length; j++) {
						if(i < iarr.length-1 && j < iarr[i].length-1) {
							iarr[i][j] = ran.nextInt(100)+1;
						}
						if(j != iarr.length-1){ // 마지막 열에 자기자신을 더하지 않게함
							iarr[i][iarr[i].length-1] += iarr[i][j];
						}
					}
				}
				for(int i=0; i < iarr.length; i++) {
					for(int j=0; j < iarr[i].length; j++) {
						if(j != iarr.length-1) { // 마지막 행에 자기자신을 더하지 않게함
							iarr[iarr.length-1][i] += iarr[j][i];
						}
					}
					if(i != iarr.length-1) { // 마지막 행에 자기자신을 더하지 않게함
						iarr[cul-1][row-1] += iarr[iarr.length-1][i];
					}
				}
			} else {
				System.out.println("행과 열이 같아야하며 0을 입력 할 수 없습니다");
			}
			printArray(iarr);
		
		} while (true);
	}
	public void printArray(int[][] iarr) {
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j]);
				
				if(j != iarr[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}