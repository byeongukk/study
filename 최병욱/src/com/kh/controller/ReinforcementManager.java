package com.kh.controller;

import java.util.Random;
import java.util.Scanner;

import com.kh.view.Output;
import com.kh.view.OutputImpl;
import com.kh.weapons.model.vo.Player;
import com.kh.weapons.model.vo.Weapons;

public class ReinforcementManager {
	final static private double DEC = 0.9; //강화성공시 확률 감소폭
	final static private double COST_INCREMENT = 1.4; //강화성공시 비용증가폭
	
	public ReinforcementManager(){}
	
	public void reinforce(Weapons wp,Player player) {
		Scanner sc = new Scanner(System.in);
		OutputImpl oi = new OutputImpl();
		while(true) {
			//oi.printErase();
			System.out.println("강화하기 입니다");
			oi.printWeaponsInfo(wp);
			System.out.println("강화 확률 " + wp.getRfmProbability() + "%");
			System.out.println("강화 비용 " + wp.getRfmCost() + "gold");
			System.out.println("현재 소지 골드 " + player.getGold()+ "gold");
			System.out.print("강화 하시겠습니까(y/n) ? > ");
			String check = sc.nextLine();
			
			
			//강화
			if(check.equals("y")||check.equals("Y")) {
				//플레이어의 골드가 남아있을때 
				if(player.getGold()>=wp.getRfmCost()) {
					player.setGold(player.getGold()-wp.getRfmCost()); //강화비용 빼기
					oi.printRfmEffect();
					//확률계산
					//randomProbaility
					
					if(checkProbaility(randomProbaility(wp))) {
						//강화 성공
						wp.setAtk(wp.getAtk()+wp.getAtkIncrement());					 //공격력 증가
						wp.setReinforcement(wp.getReinforcement()+1); 					//1강 증가
						wp.setRfmCost((int)(wp.getRfmCost()*COST_INCREMENT)); 					//강화 비용 증가
						wp.setRfmProbability((int)(wp.getRfmProbability()*DEC)); // 강화확률 감소
						System.out.println("강화 성공!!!");
						System.out.println(wp.getName()+"이(가) " + wp.getReinforcement() +"강이 되었습니다.");
						System.out.println("공격력이 "+ wp.getAtkIncrement()+" 만큼 증가합니다");
						System.out.println();
						continue;
					} else {
						System.out.println("강화에 실패 하셨습니다.. 안타까워라");
						continue;
					}
				} else {
					System.out.println("플레이어의 골드가 부족합니다");
					break;
				}
			} else if(check.equals("n")||check.equals("N")) {
				System.out.println("이전 메뉴로 돌아갑니다");
				break;
			} else {
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시골라주세요");
				continue;
			}
		}
	}
	
	//확률만큼 true를 넣는다
	public boolean[] randomProbaility(Weapons wp) {
		boolean[] bool = new boolean[100];
		for(int i=0; i < wp.getRfmProbability(); i++) {
			bool[i] = true;
		}
		return bool;
	}
	public boolean checkProbaility(boolean[] bool) {
		int ran = new Random().nextInt(100);
		return bool[ran]; //bool인덱스에 랜덤값으로 뽑은 값을 넣어 리턴
	}
	
	
}
