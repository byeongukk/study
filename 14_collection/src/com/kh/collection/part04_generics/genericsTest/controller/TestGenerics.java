package com.kh.collection.part04_generics.genericsTest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestGenerics {
	public void testGenerics1() {
		//컬렉션에는 (List, Set, Map) 여러 종류 객체를 저장함
		List list = new ArrayList();
		
		list.add(new String("Object saved"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			
			//System.out.println(obj.toString());
			if(obj instanceof Book) {
				((Book) obj).printBook();
			}
			if(obj instanceof Student) {
				((Student) obj).score();
			}
			if(obj instanceof Car) {
				((Car) obj).printCar();
			}
		}
		
	}
	public void testGenerics2() {
		//제네릭스 기능 : 컬렉션에 저장되는 객체의 자료형에 제한을 거는 기능
		//컬렉션에 한 가지 종류의 객체만 저장할 때 사용함
		ArrayList<Book> list = new ArrayList<>();
		
		//list.add("test generics"); //에러남
		list.add(new Book());
		list.add(new Book());
		
		for(Book b : list ) {
			b.printBook();
		}
		
	}
	
	public void testGenerics3() {
		HashMap<String,Book> hmap = new HashMap<>();
		
		hmap.put("one", new Book("java"));
		hmap.put("two", new Book("oracle"));
		hmap.put("three", new Book("jdbc"));
		
	}
	
	
}

class Book{
	private String title;
	public Book() {
		
	}
	
	public Book(String title) {
		this.title = title;
		
	}
	
	public void printBook() {
		System.out.println("printBook() call..");
	}
	@Override
	public String toString() {
		return "Book";
	}
}

class Student{
	public Student() {
		
	}
	public void score() {
		System.out.println("score() call...");
	}
	@Override
	public String toString() {
		return "Student";
	}
}


class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call...");
	}
	@Override
	public String toString() {
		return "Car";
	}
}



















