package com.kh.poly.part02_abstractClassAndInterface.controller;

import com.kh.poly.part02_abstractClassAndInterface.model.vo.Book;
import com.kh.poly.part02_abstractClassAndInterface.model.vo.Galaxy;
import com.kh.poly.part02_abstractClassAndInterface.model.vo.Product;
import com.kh.poly.part02_abstractClassAndInterface.model.vo.SmartPhone;

public class ProductManager {
	public void testPolymorphysm() {
		//추상클래스는 객체를 생성하지못하고
		//상속받은 클래스로 구현해야한다.
		/*Product p = new Product();*/
		Product p1 = new SmartPhone();
		Product p2 = new Galaxy();
		Product p3 = new Book();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	
		//Object 클래스는 모든 클래스의 조상이다.
		//부모 클래스 타입으로 자식 객채의 주소를 받을 수 있다.
		Object obj1 = /*(Object)*/p1; //upcasting -> Jvm이 자동으로 추가
		Object obj2 = p2;
		Object obj3 = p3;
	
		//후손 클래스 타입으로는 부모 객체의 주소를 받을 수 없다.
		/*Galaxy g = new SmartPhone();*/
		//강제로 casting 하게 되면 에러 발생함
		/*Galaxy g = (Galaxy)new SmartPhone();*/
		
		SmartPhone s1 = new Galaxy();
		s1.printProduct();
		s1.printSmartPhone();
		//자식 클래스가 가진 메소드를 호출하기 위해서는 부모 레퍼런스를
		//자식 레퍼런스로 형변환을 해야 한다.
		((Galaxy)s1).printGalaxy();
		
		print(new Book());
	}
	
	public void print(Object obj) {
		System.out.println(obj);
		System.out.println("========================");
		if(obj instanceof Galaxy) {
			((Galaxy) obj).printGalaxy();
		}
		if(obj instanceof SmartPhone) {
			((SmartPhone) obj).printSmartPhone();
		}
		if(obj instanceof Product) {
			((Product) obj).printProduct();
		}
		if(obj instanceof Book) {
			((Book) obj).printBook();
		}
	}
	
	public void objectArrayTest() {
		//객체 배열에도 다형성 적용이 가능하다
		Object[] arr = new Object[10];
		
		arr[0] = new String("문자열 객체");
		arr[1] = new java.util.Date();
		/*arr[2] = new Product();*/ //추상클래스는 객체생성이 불가능
		arr[3] = new Book();
		arr[4] = new Galaxy();
		arr[5] = new SmartPhone();
		
		for(int i=0; i <arr.length; i++) {
			/*System.out.println(arr[i]);*/
			if(arr[i] instanceof Galaxy) {
				((Galaxy)arr[i]).printGalaxy();
			}else if(arr[i] instanceof SmartPhone) {
				((SmartPhone)arr[i]).printSmartPhone();
			}else if(arr[i] instanceof Book) {
				((Book)arr[i]).printBook();
			} else if(arr[i] instanceof Product) {
				((Product)arr[i]).printProduct();
			}
		}
	}
	
}






























