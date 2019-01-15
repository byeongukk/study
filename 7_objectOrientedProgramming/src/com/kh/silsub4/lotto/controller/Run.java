package com.kh.silsub4.lotto.controller;

import com.kh.silsub4.lotto.model.vo.Lotto;

public class Run {

	public static void main(String[] args) {
		System.out.println("===이번주 예상번호===");
		for(int i=0; i < 5; i++) {
			Lotto user1 = new Lotto();
			user1.information();
		}
	}

}
