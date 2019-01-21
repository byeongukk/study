package com.kh.inherit.prat01_inheritTest.afterProduct.model.vo;

import java.util.Date;

public class Television extends Product {
	//Product 클래스를 상속받아 구현
	//Product의 필드를 자신의 것 처럼 사용할 수 있기 때문에
	//Television 클래스는 공통적으로 Product클래스에 작성되지 않은 필드만 작성
	private int inchType;
	
	public Television() {
		//모든 생성자에는 super()가 생략되어있다
		//생성자를 호출할 때에는 부모 생성자의 호출부터 일어난다
		/*super();*/  //자동으로 jvm이 추가해줌
		//부모가 가진 기본생성자
		System.out.println("Television 클래스 생성자 호출...");
	}
	//모든 필드를 매개변수로 선언하는 생성자의 경우,
	//부모 필드 초기화 되는 값까지 전달받는다.
	public Television(String brand, String productNumber,
			String productCode, String productName, int price
			,Date manufacturingDate, int inchType) {
		super(brand,productNumber,productCode,productName,price,manufacturingDate);
		this.inchType = inchType;
		
		System.out.println("Television클래스 매개변수 있는 생성자 호출..");
	}
	
	//setter/getter도 부모의 것을 자신의 것처럼 사용하기 때문에
	//작성하지 않아도 된다.
	//다만, 자식클래스에서 새로 작성한 필드에 대해서는 setter/getter를 작성한다
	public int getInchType() {
		return inchType;
	}
	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	
	//부모의 메소드를 오버라이딩함
	public String printInformation() {
		// super.brand; 부모의 필드가 private 이여서 직접접근 불가능
		// protected일때는 가능
		return super.printInformation() + this.inchType + "";
	}
	
}












