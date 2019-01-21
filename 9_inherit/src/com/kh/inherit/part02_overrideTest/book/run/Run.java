package com.kh.inherit.part02_overrideTest.book.run;

import com.kh.inherit.part02_overrideTest.book.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book("수학의 정석","나수학",10000);
		Book b2 = new Book("칭찬은 고래도 춤추게 한다","고래킹",5000);

		/*System.out.println(b1.toString());
		System.out.println(b2.toString());*/
		
		//.toString() 메소드는 객체 호출시 자동으로 뒤에 JVM에 의해 생성된다.
		//따라서 객체의 필드값을 확인하기 위해 오버라이딩 해서 쓴다
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1.equals(b2));
		
		Book b3 = b1;
		System.out.println(b1.equals(b3));
		
		Book b4 = new Book("수학의 정석","나수학",10000);
		System.out.println(b1.equals(b4));
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
		
		//해쉬코드는 서로 다르지만 b1과 b4는 값이 같이 때문에 같은 객체로 취급한다.
		//이렇게 주소는 다르지만 값이 같은 객체를 동등객체라고 한다.
		//주소값까지 같은 객체를 동일객체라고 한다.
		
		
	}
}
