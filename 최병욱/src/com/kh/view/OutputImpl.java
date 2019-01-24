package com.kh.view;

import com.kh.weapons.model.vo.Player;
import com.kh.weapons.model.vo.Weapons;

public class OutputImpl implements Output {
	public void printRfmEffect() {
		String ing = "강화중입니다";
		try {
			for(int i=0; i<7; i++) {
				printErase();
				if(i>=6) {
					ing += "!";
					System.out.println(ing);
					System.out.println();
					System.out.println();
				} else {
					ing += ".";
					System.out.println(ing);
					System.out.println();
					System.out.println();
				}
				Thread.sleep(500);
				printErase();
			}
		} catch (InterruptedException e) { }
	}

	@Override
	public void printWeaponsInfo(Weapons[] wpArr) {
		int totalAtk=0;
		for(int i=0; i<wpArr.length; i++) {
			System.out.println("∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥ " + (i+1) +"번 ∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥∥");
			System.out.println("\t\t\t무기이름:\t " + wpArr[i].getName());
			System.out.println("\t\t\t무기종류:\t " + wpArr[i].getKinds());
			System.out.println("\t\t\t공격력  :\t " + wpArr[i].getAtk());
			System.out.println("\t\t\t강화    :\t " + wpArr[i].getReinforcement());
			System.out.println();
			totalAtk += wpArr[i].getAtk();
		}
		System.out.println("총 공격력 : " + totalAtk);
		System.out.println();
		System.out.println();
		System.out.println();
	}
	@Override
	public void printWeaponsInfo(Weapons wp) {
		System.out.println(LINE);
		System.out.println("무기이름 : " + wp.getName());
		System.out.println("무기종류 : " + wp.getKinds());
		System.out.println("공 격 력 : " + wp.getAtk());
		System.out.println("강    화 : " + wp.getReinforcement());
		System.out.println(LINE);
	}

	@Override
	public void outMenu() {
		System.out.println(LINE);
		System.out.println("\t\t\t\t\t무기 강화 게임");
		System.out.println(LINE);
		System.out.println("\t1.무기 현황보기\t2.무기 강화하기\t3.게임 안내\t4.소지금액 확인\t5.게임종료\t");
		System.out.println(LINE);
		System.out.print("메뉴를 선택해주세요 > ");
	}

	@Override
	public void selectWeapon(Weapons[] wpArr) {
		System.out.println("\t\t\t     무기 강화하기");
		System.out.println("\t\t\t\t무기 현황               ");
		printWeaponsInfo(wpArr);
		System.out.print("무기를 선택해 주세요(번호) : ");
	}
	@Override
	public void printPlayerInfo(Player player) {
		System.out.println();
		System.out.println();
		System.out.println("현재 소지 골드 : " + player.getGold() +"gold");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	public void printErase() {
		for(int i=0; i<50; i++) {
			System.out.println();
		}
	}
	public void printGameInfo() {
		printErase();
		System.out.println("***************************게임설명***************************");
		System.out.println("플레이어에게 1,000,000 Gold가 주어집니다");
		System.out.println("무기 종류는 3가지입니다");
		System.out.println("검은 공격력 상승폭이 낮지만 높은 강화확률과 강화비용이 저렴합니다");
		System.out.println("총은 검에비해 공격력 상승폭,강화비용이 약간높고 강화확률은 약간 낮습니다");
		System.out.println("핵은 낮은 강화확률,비싼 강화비용이지만 공격력 상승폭이 높습니다 ");
		System.out.println("주어진 골드로 여러가지 무기를 강화해 총 공격력을 높여보세요");
		System.out.println("************************************************************");
		
	}





}
