package com.kh.poly.part02_abstractClassAndInterface.model.vo;

import java.io.Serializable;
import java.util.Comparator;

//추상메소드만 멤버로 가질 수 있는 추상클래스의 변형체를 인터페이스라고 한다.
//상수 필드만 멤버로 추가할 수 있다.

//인터페이스간 상속은 extends를 사용하며 다중 상속을 지원한다.
//클래스에서 인터페이스를 상속할 시 implements 키워드를 사용해야 하지만
//인터페이스에서 인터페이스를 상속할 시 implements 키워드를 사용 못한다.
public interface IProduct extends Serializable/*, Comparator*/{
	//상수필드만 멤버로 가질 수 있기 때문에
	//public static final을 생략해도 묵시적으로 상수 필드의 의미를 갖는다.
	/*public static final */String PRODUCT_NAME = "상품명";
	
	//완성된 메소드를 멤버로 가질 수 없다
	/*public void method() {}*/
	
	//추상 메소드만 멤버로 가질 수 있다.
	/*public abstract void abstImethod();*/
	void abstImethod();
	
	
}
