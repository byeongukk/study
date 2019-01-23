package com.kh.poly.prat01_polymorphismTest1.model.vo;

public class Animal {
	private int hp;
	private int exp;
	private String kinds;

	public Animal() {}
	public Animal(int hp,int exp,String kinds) {
		this.hp = hp;
		this.exp = exp;
		this.kinds = kinds;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public int getHp() {
		return hp;
	}
	public int getExp() {
		return exp;
	}
	public String getKinds() {
		return kinds;
	}
	
	public void cry() {}
	
	
}











