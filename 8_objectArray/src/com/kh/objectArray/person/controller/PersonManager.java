package com.kh.objectArray.person.controller;

import com.kh.objectArray.person.model.vo.Person;

public class PersonManager {
	public void testObjectArray() {
		//객체 배열은 레퍼런스 변수에 대한 배열이다.
		Person[] parr = new Person[5];
		
		//기본값은 null로 기록되어 있다.
		for(int i = 0; i < parr.length; i++) {
			System.out.println(parr[i]);
		}
		
		//각 인덱스 별로 객체를 생성해서 대입해야 한다.
		parr[0] = new Person("홍길동", 25, '남', 199.5 , 20.2);
		parr[1] = new Person("이순신", 44, '여', 350.5 , 99.2);
		parr[2] = new Person("유관순", 20, '여', 150.3 , 50.2);
		parr[3] = new Person("김유신", 38, '남', 120.2 , 30.5);
		parr[4] = new Person("황진이", 23, '여', 180.5 , 55.3);
		
		//각 인덱스별 객체의 정보 확인
		for(int i=0; i <parr.length; i++) {
			System.out.println(parr[i].showPersonInfo());
		}
		
		//각 배열 내의 객체들이 가진 hashCode값 확인
		System.out.println("주소확인");
		for(int i=0; i < parr.length; i++) {
			System.out.println(parr[i].hashCode());
		}
	}
	public void testObjectArrayInit() {
		//객체 배열도 할당과 동시에 초기화를 할 수 있다.
		Person[] parr = {
				new Person("홍길동", 25, '남', 199.5, 20.2),
				new Person("이순신", 44, '여', 350.5 , 99.2),
				new Person("유관순", 20, '여', 150.3 , 50.2),
				new Person("김유신", 38, '남', 120.2 , 30.5),
				new Person("황진이", 23, '여', 180.5 , 55.3)
		};
		System.out.println("배열 갯수 : " + parr.length);
		for(int i=0; i < parr.length; i++) {
			System.out.println(i + " : " + parr[i].showPersonInfo());
			System.out.println("hashcode : " + parr[i].hashCode());
		}
		
		
	}
}


















