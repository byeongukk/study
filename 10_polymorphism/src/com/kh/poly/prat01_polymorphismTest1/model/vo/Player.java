package com.kh.poly.prat01_polymorphismTest1.model.vo;

public class Player {
	private String name;
	private int exp = 0;
	private int atk = 50;
	
	public Player() {}
	
	//경험치는 0으로 초기화 해 둔 상태이기 때문에 이름만 초기화 함
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;;
	}
	
	@Override
	public String toString() {
		return name + "님의 현재 경험치는 " + exp + "입니다";
	}
	
}
