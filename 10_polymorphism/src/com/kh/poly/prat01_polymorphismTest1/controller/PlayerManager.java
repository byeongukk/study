package com.kh.poly.prat01_polymorphismTest1.controller;

import java.security.CryptoPrimitive;

import com.kh.poly.prat01_polymorphismTest1.model.vo.Animal;
import com.kh.poly.prat01_polymorphismTest1.model.vo.Chicken;
import com.kh.poly.prat01_polymorphismTest1.model.vo.Player;
import com.kh.poly.prat01_polymorphismTest1.model.vo.Tiger;

public class PlayerManager {
	
	public void startPlay(String name) {
		//플레이어 객체를 만들고 게임 시작
		Player p = new Player(name);
		
		System.out.println(p.getName() + "님께서 등장하셨습니다");
		
		//치킨 한마리 등장
		//닭은 동물이기 때문에 동물 타입으로 선언 가능함
		/*Chicken c1 = new Chicken(100, 100, "초보닭");*/
		Animal c1 = new Chicken(100,100,"초보닭");
	
		//Animal 클래스 타입이지만 Chicken객체가 들어있기때문에
		//Chicken 클래스 안에 cry메소드가 실행됨
		//동적바인딩 적용됨
		c1.cry();
		
		//닭 공격
		//부모 타입인 경우 여러 자식이 있을 수 있기때문에
		//어떤 자식 객체의 메소드인지 형변환을 통해 알려줘야함
		//해당 타입이 맞는지는 instanceof 연산자를 사용해서 알 수 있음
		if(c1 instanceof Chicken) {
			((Chicken)c1).hitChicken(); 
		}
		
		//남은 hp만큼 반복 공격
		for(int i = c1.getHp(); i > 0; i -= 10) {
			if(c1 instanceof Chicken) {
				((Chicken) c1).hitChicken();
			}
		}
		
		p.setExp(p.getExp() + c1.getExp());
		
		System.out.println(p/*.toString()*/);
		
		Animal t1 = new Tiger(1000,1000,"시베리안호랑이");
		t1.cry();
	
		for(int i = t1.getHp(); i > 0; i-=50) {
			if(t1 instanceof Tiger) {
				((Tiger)t1).hitTiger();
			}
		}
		
		p.setExp(p.getExp() + t1.getExp());

		System.out.println(p);
		
		
		
		
	}

}
