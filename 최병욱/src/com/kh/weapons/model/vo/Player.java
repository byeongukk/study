package com.kh.weapons.model.vo;

public class Player {
	private int gold; //기본소지금액
	public Player() {}
	public Player(int gold) {
		this.gold = gold;
	}
	
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getGold() {
		return gold;
	}
}
