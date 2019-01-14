package com.kh.chap01_encapsulation;

public class Account {
	/*String name = "최병욱";
	String accNo = "1234-5678-9011";
	String pwd = "1234";
	int bankCode = 20;
	int balance = 0;*/
	
	//같은 클레스에서만 사용할 수 있도록 private 를 선언
	private String name = "최병욱";
	private String accNo = "1234-5678-9011";
	private String pwd = "1234";
	private int bankCode = 20;
	private int balance = 0;
	
	
	//생성자(객체를 생성하기 위한 메소드)
	public Account() {} 
	
	//입금을 위한 메소드
	public void deposit(int money) {
		if(money > 0 ) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money +"원이 입금이되었습니다");
			System.out.println("현재 금액 : " + balance);
		} else {
			System.out.println("잘못된 금액입니다");
		}
	}
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다");
			System.out.println("현재 금액 : " + balance);
		} else {
			System.out.println("잔액이 부족합니다");
		}
	}
	
	//잔액 조회를 위한 메소드
	public void displayBalance() {
		System.out.println(name + "님의 계좌 잔액 : " + balance);
	}
	
}
