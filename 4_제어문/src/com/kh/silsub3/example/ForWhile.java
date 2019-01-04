package com.kh.silsub3.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ForWhile {
	ArrayList<Map> menuList = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);
	public void printStar1() {
		System.out.println("정수 하나 입력 : ");
		int num = scan.nextInt();
		if(num>0) {
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=i; j++) {
					if(i==j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아님");
		}
	
	}
	public void printStar2() {
		System.out.println("정수 하나 입력 : ");
		int num = scan.nextInt();
		if(num>0) {
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if(num<0) {
			num = -num;
			for(int i=1; i<=num; i++) {
				for(int j=num; j>=i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("출력 기능이 없습니다");
		}
	}
	public void selectMenu() {
		String str;
		int amount;
		int price;
		int total=0;
		int bul=0,chi=0,gam=0,che=0,sel=0,col=0,ade=0,co=0;
		int bulCh,chiCh,gamCh,cheCh,selCh,colCh,adeCh,coCh;
		System.out.println("*** 메뉴를 선택하세요 ***");
		System.out.println("햄버거 *************");
		System.out.println("1. 불고기버거 3500원");
		System.out.println("2. 치킨버거    3200원");
		System.out.println("추가 **************");
		System.out.println("3. 감자튀김    1000원");
		System.out.println("4. 치즈스틱      400원");
		System.out.println("5. 샐러드       2000원");
		System.out.println("음료수 *************");
		System.out.println("6. 콜라           700원");
		System.out.println("7. 에이드       1200원");
		System.out.println("8. 커피          1000원");
		System.out.println("********************");
		boolean run = true;
		while(run) {
			System.out.println("메뉴 선택 : ");
			int menuNum = scan.nextInt();
			if(menuNum>8) {
				System.out.println("잘못입력하셨습니다");
				continue;
			}
			if(menuNum==1) {
				price = 3500;
				System.out.println("불고기버거를 선택하셨습니다");
				System.out.println("수량은 ? ");
				amount = scan.nextInt();
				bul += amount;
				total += (price*amount);
			}
			if(menuNum==2) {
				price = 3200;
				System.out.println("치킨버거를 선택하셨습니다");
				System.out.println("수량은 ? ");
				amount = scan.nextInt();
				chi += amount;
				total += (price*amount);
			}
			System.out.println("추가 주문하시겠습니까 ? Y/N");
			str = scan.nextLine();
			switch(str) {
				case "Y" :  case "y" :
					continue;
				case "N" : case "n" :
					System.out.println("* 주문하신 정보는 다음과 같습니다 *");
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			}
		}
		
		
	}
	public void selectMenu2() {
		String yesOrNo;
		int menuNum;
		
		Map<String,Object> menu1 =  new HashMap<String,Object>();
		menu1.put("menuName", "불고기버거");
		menu1.put("price", 3500);

		System.out.println("*** 메뉴를 선택하세요 ***");
		for(int index = 0; index <= menuList.size(); index++ ) {
			System.out.println(menuList.get(index));
		}
		
		System.out.println("메뉴 선택 : ");
		menuNum = scan.nextInt();
		System.out.println();
		yesOrNo = scan.nextLine();
	}
	public void countInputCharacter() {
		System.out.println("문자열 입력 : ");
		String str1 = scan.nextLine();
		System.out.println("문자 입력 : ");
		char ch1 = scan.nextLine().charAt(0);
		int result = 0;
		
		for(int i=0; i<str1.length(); i++) {
			char ch2 = str1.charAt(i);
			int chRe = (int)ch2;
			if((chRe>=65 && chRe<=90) || (chRe>=97)&&(chRe<=122)) {
				if(ch1==ch2) {
					result++;
				}
			} else {
				System.out.println("영문이 아닙니다");
				break;
			}
		}
		System.out.println("포함된 갯수 : "+ result + " 개 ");
	}
}
