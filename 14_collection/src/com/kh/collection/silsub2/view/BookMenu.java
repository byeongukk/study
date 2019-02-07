package com.kh.collection.silsub2.view;

import java.util.Scanner;

import com.kh.collection.silsub2.controller.BookManager;
import com.kh.collection.silsub2.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm;
	
	public BookMenu() {
		while(true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기 ");
			System.out.print("메뉴 번호 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
			
			}
			
			
			
			
		}
		
	}
	public void mainMenu() {
		
	}
	public Book inputBook() {
		return null;
	}
	public int inputBookNo() {
		return 0;
	}
	public String inputBookTitle() {
		return null;
	}
	
	
	
}
