package com.kh.chap03_field.part02_initBlock.model.vo;

public class Product {
	
	//명시적 초기값
	private String pName = "갤럭시";
	private int price = 1251252;
	private static String brand = "샘숭";

	//인스턴스 초기화 블록
	//객체가 생성되면서 초기화됨
	{
		pName = "아이퐁";
		price = 525200;
		//인스턴스 초기화 블럭에서는 static필드를 초기화 할 수 있다.
		//하지만 static 초기화 블럭은 프로그램 시작시에 초기화를 하기때문에
		//객체 생성 이후에 값을 초기화하는 인스턴스 초기화 블럭의 값으로
		//덮어쓰게된다 
		brand = "사과";
	}
	
	
	static {
		//static 초기화블럭에서는 non-static 필드를 초기화하지 못한다
		//객체가 생성이 되지않았기 때문에 덮어쓰기 불가능
		/*pName = "아이뽕";
		price = 151525;*/
		brand = "헬지";
	}
	
	
	//기본생성자
	public Product() {}
	//매개변수 있는 생성자
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		Product.brand = brand;
	}
	
	//setter
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static void setBrand(String brand) {
		Product.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public static String getBrand() {
		return brand;
	}

	public void information() {
		System.out.println(pName + ", " + price + ", " + brand);
	}

}
