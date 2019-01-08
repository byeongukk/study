package com.kh.silsub4.example;

import java.util.Random;
import java.util.Scanner;

public class ForWhile2 {
	Scanner scan = new Scanner(System.in);
	public void pdfExample() {
		int num;
		int sum=0;
		System.out.println("정수 한 개 입력 : ");
		num = scan.nextInt();
		for(int i = 0; i<=num; i+=2) {
			sum += i;
		}
		System.out.println("1부터 "+ num + "까지 짝수를 더한 값 : "+ sum);
	}
	
	
	public void pdfExample2() {
		int num ;
		int i=0;
		int sum = 0;
		System.out.println("정수 한개 입력 :");
		num = scan.nextInt();
		while(i<=num) {
			sum += i ;
			i+=2;
		}
		System.out.println("1부터" +num+ " 까지의 짝수의 합은 " + sum + "입니다");
	}
	public void pdfExample3() {
		//정수를 입력받아 홀수면 "수", 짝수이면 "박" 이 정수만큼 누적되어
		//출력되게 작성하시오.
		//예) 4입력 "수박수박"출력, 5입력 "수박수박수" 출력
		String str1 = "수";
		String str2 = "박";
		String result = "";
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		for(int i = 1; i<=num; i++) {
			if(i % 2 != 0) {
				result += str1;
			} else {
				result +=str2;
			}
		}
		System.out.println(result);
	}
	public void pdfExample4() {
		//맥도날드 주문받기
		String product = "";
		int price = 0;
		
		String order = "";
		int total = 0; //총 주문금액
		
		do {
			System.out.println("============ Menu ============");
			System.out.println("------------- 버거류 -----------");
			System.out.println("1. 상하이 스파이스 치킨버거 --- 5,500원");
			System.out.println("2. 빅맥 -----------------  5,000원");
			System.out.println("3. 베이컨 토마토 디럭스 ------- 6,000원");
			System.out.println("-------------- 음료 --------------");
			System.out.println("4. 콜라 ------------------- 1,500원");
			System.out.println("5. 사이다 ------------------ 1,500원");
			System.out.println("6. 오렌지쥬스 --------------- 2,000원");
			System.out.println("7. 커피 ------------------- 1,000원");
			System.out.println("------------- 사이드 ---------------");
			System.out.println("8. 감자튀김 ----------------- 700원");
			System.out.println("9. 아이스크림 ---------------- 1,000원");
			System.out.println("==================================");
			System.out.print("주문하실 메뉴를 번호로 입력하세요 : ");
			int menuNum = scan.nextInt();
			System.out.print("주문하실 수량을 입력하세요 :");
			int ctn = scan.nextInt();
			System.out.print("추가 주문하시겠습니까 ? (y/n)");
			String con = scan.nextLine().toUpperCase();
			switch(menuNum) {
			case 1 : product = "상하이 스파이스 치킨버거"; price = 5500; break;
			case 2 : product = "빅맥"; price = 5000; break;
			case 3 : product = "베이컨 토마토 디럭스"; price = 6000; break;
			case 4 : product = "콜라"; price = 1500; break;
			case 5 : product = "사이다";  price = 1500; break;
			case 6 : product = "오렌지쥬스"; price = 2000; break;
			case 7 : product = "커피"; price = 1000; break;
			case 8 : product = "감자튀김"; price = 700; break;
			case 9 : product = "아이스크림"; price = 1000; break;
			}
			order += product + " - " + ctn + "개 : " + (price*ctn) + "원";
			total += (price * ctn);
			switch(con) {
			case "Y" : order += "\n"; break;
			case "N" : System.out.println("====================");
					   System.out.println(order);
					   System.out.println("====================");
					   System.out.println("total price : " + total + "원");
					   return;
			}
			
		} while(true);
		
	}
	public void pdfExample5() {
		int random = new Random().nextInt(100) + 1;
		int ctn = 1;
		do {
			System.out.print("정수 한개를 입력하세요 :");
			int input = scan.nextInt();
			
			if(input > random) {
				System.out.println("입력하신 정수보다 작습니다");
				ctn++;
			}else if(input < random) {
				System.out.println("입력하신 정수보다 큽니다");
				ctn++;
			} else {
				System.out.println("정답입니다 " + ctn + "회 만에 정답을 맞추셨습니다");
				break;
			}
		}while(true);
	}
	public void pdfExample6() {
		//소수 판별
		do {
			System.out.println("2보다 큰 정수를 하나 입력하세요 : ");
			int num = scan.nextInt();
			boolean check = true;
			if(num <= 1) {
				System.out.println("잘못 입력하셨습니다 . 다시입력해주세요");
			} else {
				for(int i=2; i<num; i++) {
					if(num%i==0) {
						check = false;
						break;
					}
				}
				System.out.println(check? "소수다":"소수가 아니다");
				break;
			}
		} while(true);
	}
	public void pdfExample7() {
		System.out.print("문자를 입력하세요 : ");
		String str = scan.nextLine();
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		String result = "";
		int mod = num % 26;
		//26 의 배수를 구함
		
		for(int i=0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if(temp != ' ') {
				if(temp <= 'z' && temp >= 'a') { //소문자인 경우
					if(temp + mod > 'z') {
						result += (char)(temp + mod - 26);
					} else {
						result += (char)(temp + mod);
					}
				} else {
					if(temp + mod > 'Z') {
						result += (char)(temp + mod -26);
					} else {
						result += (char)(temp + mod);
					}
				}
			} else {
				result += temp;
			}
		}
		
		System.out.println(result);
	}
	public void pdfExample8() {
		System.out.println("받으신 금액을 입력하세요 : ");
		int money = scan.nextInt();
		
		System.out.println("상품 가격을 입력하세요 : ");
		int price = scan.nextInt();
		
		int change = money - price;
		int currency = 50000; // 가장 큰 화폐단위부터
		int mok = 0;
		int nmg = 0;
		int sw = 0;
		int temp = change;
		
		System.out.println("=================");
		while(true) {
			mok = temp / currency; //화폐단위 갯수
			nmg = temp % currency; //화폐를 나눈 나머지값

			if(mok == 0 && nmg == 0) {
				break;
			}
			
			if(mok != 0) {
				if(currency > 500) {
					System.out.println(currency + "원권 지폐" + mok + "장");
				} else {
					System.out.println(currency + "원권 동전" + mok + "개");
				}
			}
			if(sw == 0) {
				currency /= 5;
				sw = 1;
			} else {
				currency /= 2;
				sw = 0;
			}
			temp = nmg;
		}
		System.out.println("========================");
		System.out.println("거스름돈 : " + change + "원");
	}
}
