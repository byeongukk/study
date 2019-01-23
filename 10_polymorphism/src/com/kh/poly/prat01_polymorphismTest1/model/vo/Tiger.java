package com.kh.poly.prat01_polymorphismTest1.model.vo;

public class Tiger extends Animal {

	public Tiger(int hp,int exp,String kinds) {
		super(hp,exp,kinds);
	}
	
	@Override
	public void cry() {
		System.out.println("호랑이가 으르렁 하고 울음소리를 냅니다");
	}
	
	public void punch() {
		System.out.println("호랑이가 주먹을 날립니다");
	}
	
	public void hitTiger() {
		System.out.println("호랑이가 비명을 지르며 hp가 50 감소하였습니다");
		super.setExp(super.getExp() - 50);
		
		if(super.getHp() <= 0) {
			System.out.println("호랑이가 쓰러집니다. 경험치가" + getExp() + "만큼 증가합니다");
		}
		
	}
	
}
