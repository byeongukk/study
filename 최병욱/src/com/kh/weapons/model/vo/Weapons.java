package com.kh.weapons.model.vo;

public abstract class Weapons {
	private String name;			//무기이름
	private String kinds;			//무기종류
	private int atk; 		  	//공격력
	private int atkIncrement;	//공격력 증가폭
	private int reinforcement;  // 강화등급
	private int rfmCost; 		   	//강화비용
	private int rfmProbability;		//강화확률 (%)

	
	public Weapons() {}
	//생성자로 무기이름,무기종류,공격력증가폭,기본강화비용,기본강화확률을 받는다
	public Weapons(String name,String kinds,int atkIncrement,int rfmCost,int rfmProbability) {
		this.name = name;
		this.kinds = kinds;
		this.atkIncrement = atkIncrement;
		this.rfmCost = rfmCost;
		this.rfmProbability = rfmProbability;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getReinforcement() {
		return reinforcement;
	}

	public void setReinforcement(int reinforcement) {
		this.reinforcement = reinforcement;
	}

	public int getRfmCost() {
		return rfmCost;
	}

	public void setRfmCost(int rfmCost) {
		this.rfmCost = rfmCost;
	}

	public int getRfmProbability() {
		return rfmProbability;
	}

	public void setRfmProbability(int rfmProbability) {
		this.rfmProbability = rfmProbability;
	}
	public int getAtkIncrement() {
		return atkIncrement;
	}
	public void setAtkIncrement(int atkIncrement) {
		this.atkIncrement = atkIncrement;
	}

	
}
