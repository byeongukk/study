package com.kh.silsub1.book.main;

import com.kh.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("개똥벌레","최준혁",300);
		Book b2 = new Book("어린왕자","남궁욱",3500);
		Book b3 = b1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
	}	

}
