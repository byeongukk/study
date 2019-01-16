package com.kh.silsub5.student.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book(){}
	public Book(String title,String publicher, String author) {
		this.title = title;
		this.publisher = publicher;
		this.author = author;
	}
	public Book(String title,String publicher, String author, int price, double discountRate) {
		this(title,publicher,author);
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void information() {
		System.out.println(title);
		System.out.println(publisher);
		System.out.println(author);
		System.out.println(price);
		System.out.println(discountRate);
	}
	
	
	
}
