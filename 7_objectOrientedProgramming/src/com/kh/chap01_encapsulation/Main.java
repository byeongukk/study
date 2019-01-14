package com.kh.chap01_encapsulation;

public class Main {
	
	public static void main(String[] args) {
		Account a = new Account(); //Account 자료형의 객체 만듬
					  //Account(); 생성자
		
		a.displayBalance();
		
		//100만원 입금
		a.deposit(1000000);
		a.deposit(1500000);
		a.withdraw(500000);
		
			//private이 아닌경우 ,메소드를 통하지 않고 바로 접근
		//a.balance -= 2000000;
			//private 인 필드에 접근이 불가능
			 
		
		//갑작스런 경조사비로 50만원 인출
		a.withdraw(500000);
		
	}

}
