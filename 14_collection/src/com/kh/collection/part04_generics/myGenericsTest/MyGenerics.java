package com.kh.collection.part04_generics.myGenericsTest;

//클래스 선언 시 제네릭스를 지정할 수 있다.
//알파벳 대문자로 제네릭스를 지정하면 객체 생성시 타입이 결정된다.

public class MyGenerics<T> {
	private T[] array;
	
	public MyGenerics(T[] array) {
		this.array = array;
	}
	
	public void output() {
		for(T obj : array) {
			System.out.println(obj);
		}
	}
}
