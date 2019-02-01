package com.kh.collection.silsub1.model.dao;

import java.util.ArrayList;

import com.kh.collection.silsub1.model.vo.Board;

public class BoardDao {
	ArrayList<Board> list = new ArrayList<>();
	
	public BoardDao() {
		
	}
	public int getLastBoardNo() {
		System.out.println("사이즈 : " + list.size());
		return list.size();
	}
	public void writeBoard(Board board) {
		this.list.add(board);
	}
	public ArrayList<Board> displayAllList(){
		return list;
	}
	public Board displayBoard(int no) {
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				return list.get(i);
			}
		}
		
		return null;
	}
	public void upReadCount(int no) {
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.get(i).setReadCount(list.get(i).getReadCount()+1);
				break;
			}
		}
	}
	public void modifyTitle(int no,String title) {
		
	}
	public void modifyContent(String content,int no) {
		
	}
	public void deleteBoard(int no) {
		
	}
	public ArrayList<Board> searchBoard(String tile){
		return null;
	}
	public void saveListFile() {
		
	}
	
	
	














}
