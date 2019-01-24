package com.kh.controller;

import java.util.Scanner;

import com.kh.view.OutputImpl;
import com.kh.weapons.model.vo.Player;
import com.kh.weapons.model.vo.Weapons;

public class PlayManager {
	public void menu(Weapons[] wpArr,Player player) {
		Scanner sc = new Scanner(System.in);
		OutputImpl oi = new OutputImpl();
		ReinforcementManager rmm = new ReinforcementManager();
		boolean run = true;
		do{
			
			oi.outMenu();   //메뉴현황 출력
			String menuNum = sc.nextLine(); 
			
			switch(menuNum) {
			//1 => 무기 현황 출력
			case "1" : oi.printWeaponsInfo(wpArr); break;
			//2 => 무기 선택 출력
			case "2" : oi.selectWeapon(wpArr);
					//무기선택
				int subMenuNum = sc.nextInt()-1; //-1하여 인덱스 값 맞춤
					//인덱스가 0보다 크거나 같고 , 길이보단 작을때 
					//ReinforcementManager 객체의 reinfoce(선택무기) 메소드호출 
				if(subMenuNum>=0 && subMenuNum<wpArr.length) {
					rmm.reinforce(wpArr[subMenuNum],player);	// 무기 강화하기 메소드 호출
				} else {
					System.out.println("메뉴를 잘못 선택하셨습니다. 다시골라주세요");
					sc.nextLine();
					continue;
				}
			
			
			break;
			case "3" : oi.printGameInfo(); break;
			case "4" : oi.printPlayerInfo(player); break;
			case "5" : run = false; break;
			default : System.out.println("메뉴를 잘못 선택하셨습니다. 다시골라주세요"); continue;
			
			}
			
			
			
			
			
		}while(run);
	}
}
