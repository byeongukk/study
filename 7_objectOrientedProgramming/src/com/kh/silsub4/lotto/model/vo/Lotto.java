package com.kh.silsub4.lotto.model.vo;

import java.util.Random;

public class Lotto {
	private int[] lotto = new int[6];
	Random ran = new Random();
	
	{
		for(int i=0; i <lotto.length; i++) {
			lotto[i] = ran.nextInt(45)+1; // 로또 랜덤값 삽입
		}
		// 순차정렬
		for(int i=1; i <lotto.length; i++) {
			for(int j=0; j < i; j++) {
				//i와 j의 값이 같다면
				//새로 값을 뽑고 i-1를 해서 돌아감
				if(lotto[i]==lotto[j]) {
					lotto[i] = ran.nextInt(45)+1;
					i--;
				}
				//오름차순 정렬
				if(lotto[i] < lotto[j]) {
					int temp;
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	}

	public Lotto() {}
	
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	public int[] getLotto() {
		return lotto;
	}
	public void information() {
		for(int i=0; i < lotto.length; i++) {
			if((lotto[i]<10)) {
			System.out.print("0"+lotto[i] + " ");
			} else {
				System.out.print(lotto[i]+" ");
			}
		}
		System.out.println();
	}
}
