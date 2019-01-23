package com.kh.poly.part02_abstractClassAndInterface.model.vo;

public class Galaxy extends SmartPhone{
	public Galaxy() {}
	
	//SmartPhone 클래스에서 Product의 추상 메소드를 재정의 해 놓았기 떄문에
	//SmartPhone 클래스를 사용하는 경우에는
	//반드시 오버라이딩을 해야 하는 부담이 없어진다.
	//하지만 SmartPhone 클래스에서는 아무런 기능 없이 메소드 바디만 작성한 상태이기 때문에
	//기능이 필요한 경우 선택적으로 오버라이딩하여 메소드를 재작성 할 수 있다.
	
	public void printGalaxy() {
		System.out.println("갤럭시 클래스의 printGalaxy 메소드 호출...");
	}
	@Override
	public String toString() {
		return "Galaxy 클래스의 toString 메소드 호출..";
	}
	
}













