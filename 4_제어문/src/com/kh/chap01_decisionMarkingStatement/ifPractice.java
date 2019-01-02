package com.kh.chap01_decisionMarkingStatement;

import java.util.Random;
import java.util.Scanner;

public class ifPractice {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		jungyeon1();
	}
	public static void ifElseTest() {
		int random1 = (int)(Math.random()*10)+1;
		int random2 = (int)(Math.random()*10)+1;
		int random3 = (int)(Math.random()*10)+1;

		System.out.println("철수 의 값 : " + random1);
		System.out.println("영희 의 값 : " + random2);
		System.out.println("민수 의 값 : " + random3);

		if((random1==random2)&&(random2==random3)&&(random1==random3)) {
			System.out.println("셋이 비겼습니다");
		} else {
			if((random1>random2)&&(random1>random3)) {
				System.out.println("철수가 이겼습니다");
			}
			if((random2>random1)&&(random2>random3)) {
				System.out.println("영희가 이겼습니다");
			}
			if((random3>random1)&&(random3>random2)) {
				System.out.println("민수가 이겼습니다");
			}
			else {
				if((random1==random2)&&(random1>random3)) {
					System.out.println("철수와 영희가 비겼습니다");
				}
				if((random1==random3)&&(random1>random2)) {
					System.out.println("철수와 민수가 비겼습니다");
				}
				if((random2==random3)&&(random3>random1)) {
					System.out.println("영희와 민수가 비겼습니다");
				}
			}
		}
	}
	public void ifElseIfTest() { ///이기는 가위바위보
		//1.가위 2.바위 3.보
		int me,em;
		System.out.println("나의 패를 입력하세요 (0.무조건 이김 1.가위,2.바위,3.보) : ");
		me = scan.nextInt();
		em = (int)(Math.random()*3)+1;

		switch(me) {
		case 1 : System.out.println("내 패 : 가위"); break;
		case 2 : System.out.println("내 패 : 바위"); break;
		case 3 : System.out.println("내 패 : 보"); break;
		case 0 : System.out.println("무적임 "); break;
		default : System.out.println("잘못입력");
		}	
		switch(em) {
		case 1 : System.out.println("상대 패 : 가위"); break;
		case 2 : System.out.println("상대 패 : 바위"); break;
		case 3 : System.out.println("상대 패 : 보"); break;
		}

		if(me!=0) {
			if(me==em) {
				System.out.println("비겼습니다");
			} else if((me==1&&em==2) || (me==2&&em==3) || (me==3&&em==1)) {
				System.out.println("상대에게 졌습니다");
			} else {
				System.out.println("상대에게 이겼습니다");
			}
		} else if(me==0) {
			if(em==1) {
				System.out.println("상대의 가위를 바위로 이겼습니다");
			} else if(em==2) {
				System.out.println("상대의 바위를 보로 이겼습니다");
			} else if(em==3) {
				System.out.println("상대의 보를 가위로 이겼습니다");
			}
		}
	}
	public void junhuck1() {
		int money = 10000,btMoney,chance;

		System.out.println("배팅할 금액을 입력하세요");
		btMoney = scan.nextInt();
		if(btMoney>money) {
			System.out.println("소지금액이 부족합니다");
		} else if(btMoney<=money && btMoney>0){
			money -=btMoney;
			chance = (int)(Math.random()*11);
			System.out.println(chance);
			switch(chance) {
			case 0 : 
				money += (btMoney * 200); 
				System.out.println("대박! 잭팟이 터져 배팅금액의 200배를 드립니다 현재금액 : "+money+"원");
				break;
			case 1 : case 2 : case 3: 
				money += (btMoney*2);
				System.out.println("당첨 되었습니다 배팅금액의 2배를 드립니다 현재금액 : "+money+"원");
				break;
			case 4 : case 5 : case 6 : case 7 : case 8: case 9 :
				System.out.println("꽝입니다..ㅂㅇㅂㅇ");
			}
		} else if (money==0) {
			System.out.println("돈이 없습니다");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
	public static void jungyeon1() {
		char ch;
		int chance;
		
		System.out.println("Luck Draw에 참여하시겠습니까? y/n");
		ch = scan.nextLine().charAt(0);
		String pr = null ;
		switch(ch) {
			case 'y' : case 'Y' :
				chance = new Random().nextInt(4)+1;
					switch(chance) {
						case 1:
							System.out.println("뽑기성공!");
							chance = new Random().nextInt(41)+60;
							if(chance>=60 && chance<=70) {
								pr = "텀블러";
							}
							if(chance>70 && chance<=80) {
								pr = "키보드";
							}
							if(chance>80 && chance<=90) {
								pr = "외장하드";
							}
							if(chance>90 && chance<100) {
								pr = "아이팟";
							}
							if(chance == 100) {
								pr = "노트북";
							}
							System.out.printf("축하합니다 당신은 <%s>에 당첨되셨습니다!",pr);
							break;
						default :
							System.out.println("뽑기에 실패하셨습니다..");
					}
				break;
			case 'n' : case 'N' :
				System.out.println("경품을 포기합니다");
				break;
		}
		
	}
	

}
