package com.kh.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.collection.silsub1.model.dao.BoardDao;
import com.kh.collection.silsub1.model.vo.Board;

public class BoardManager {
	private BoardDao bd = new BoardDao();
	private Scanner sc = new Scanner(System.in);
	
	public BoardManager() {}
	
	public void writeBoard() {
		
		System.out.println("새 게시글 쓰기입니다");
		System.out.print("글 제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String user = sc.next();
		Date date = new Date();
		System.out.print("글 내용 : ");
		//글 내용
		ArrayList<String> conList = new ArrayList<>();
		int i=0;
		String contents = "";
		while(true) {
			conList.add(sc.next());
			if(conList.get(i).equals("exit")) {
				break;
			} else {
				contents += conList.get(i)+"\n";
				i++;
			}
		}
		int bnum = bd.getLastBoardNo();
		
		Board board = new Board(bnum,title,user,date,contents,0);
		bd.writeBoard(board);
		System.out.println("글 번호 : " + bnum);
		System.out.println("사이즈 : ");
		
	}
	public void displayAllList() {
	}
	public void displayBoard() {
		System.out.print("조회할 글 번호 : ");
		int num = sc.nextInt();
		if(bd.displayBoard(num)==null) {
			System.out.println("조회된 글이 없습니다");
		} else {
			System.out.println(bd.displayBoard(num));
		}
		
		bd.upReadCount(num);
	}
	public void modifyTitle() {
		
	}
	public void modifyContent() {
		
	}
	public void deleteBoard() {
		
	}
	public void searchBoard() {
		
	}
	public void saveListFile() {
		
	}
	public void sortList(int item,Boolean isDesc) {
		
	}
	
	
	
	
	
	
}
