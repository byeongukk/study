package com.kh.collection.silsub2.model.dao;

import java.util.ArrayList;

import com.kh.collection.silsub2.model.vo.Book;

public class BookDao {
	private ArrayList<Book> bookList;
	public BookDao() {
		
	}
	public BookDao(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	public int getLastBookNo() {
		return 0;
	}
	public void addBook(int no) {
		
	}
	public int deleteBook(int no) {
		return 0;
	}
	public int searchBook(String title) {
		return 0;
	}
	public Book selectBook(int index) {
		return null;
	}
	public ArrayList<Book> selectAll(){
		return null;
	}
	public ArrayList<Book> sortedBookList(){
		return null;
	}
	
	
}
