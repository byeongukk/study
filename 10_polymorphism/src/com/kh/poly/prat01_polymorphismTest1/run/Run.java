package com.kh.poly.prat01_polymorphismTest1.run;

import java.util.Scanner;

import com.kh.poly.prat01_polymorphismTest1.controller.PlayerManager;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlayerManager pm = new PlayerManager();
		
		System.out.print("아이디를 입력해주세요 : ");
		String name = sc.nextLine();
		
		pm.startPlay(name);
		
	}
}
