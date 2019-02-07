package com.kh.collection.part04_generics.myGenericsTest;

public class TestMyGenerics {

	public static void main(String[] args) {
		String[] sarr = {"apple", "melon", "banana"};
 		MyGenerics<String> my = new MyGenerics<>(sarr);
 		my.output();
 		
 		Integer[] iarr = {11,22,33,44,55};
 		MyGenerics<Integer> my1 = new MyGenerics<>(iarr);
 		my1.output();
	
	}

}
