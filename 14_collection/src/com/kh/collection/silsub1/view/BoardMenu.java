package com.kh.collection.silsub1.view;

import java.util.Scanner;

import com.kh.collection.silsub1.controller.BoardManager;

public class BoardMenu {
	private Scanner sc = new Scanner(System.in);
	private BoardManager bm;
	
	public BoardMenu() {
		while(true) {
			System.out.println("*****게시 글 서비스 프로그램*****");
			System.out.println("1. 게시글 쓰기");
			System.out.println("2. 게시글 전체보기");
			System.out.println("3. 게시글 한 개 보기");
			System.out.println("4. 게시글 제목 수정");
			System.out.println("5. 게시글 내용 수정");
			System.out.println("6. 게시글 삭제");
			System.out.println("7. 게시글 검색");
			System.out.println("8. 파일에 저장하기");
			System.out.println("9. 정렬하기");
			System.out.println("10. 끝내기");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			BoardManager bm = new BoardManager();
			switch(menuNum) {
			case 1 : bm.writeBoard(); break;
			case 2 : bm.displayAllList(); break;
			case 3 : bm.displayBoard(); break;
			case 4 : bm.modifyTitle(); break;
			case 5 : bm.modifyContent(); break;
			case 6 : bm.deleteBoard(); break;
			case 7 : bm.searchBoard(); break;
			case 8 : bm.saveListFile(); break;
			case 9 : sortSubMenu(); break;
			case 10 : return;
			}
			
			
			
		}
	}
	public void mainMenu() {
		
	}
	public void sortSubMenu() {
		
	}
	
}
