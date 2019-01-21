package com.kh.inherit.part02_overrideTest.book.model.vo;

public class Book {
	private String title;		//도서명
	private String author;		//작가명
	private int price;			//가격

	public Book() {}
	public Book(String title,String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//1. toString() 오버라이딩
	//클래스의 풀 패키지명과 객체의 해쉬코드를 16진수로 변환하여 리턴하는 메소드
	//오버라이딩 하기 위해서는 부모클래스에 선언된 메소드의 헤드와 동일하게 작성해야함
	//접근제한자는 더 넓거나 같은 범위로, 리턴타입과 매개변수도 동일하게 작성해야함
/*	@Override
	public String toString() {
		return title + ", " + author + ", " + price;
	}*/
	
	
	//2. equals() 오버라이딩
	//두 객체의 주소값을 비교하여 같으면 true, 다르면 false를 리턴하는 메소드
	//객체가 가진 값까지 같은지 비교하기 ㅟ한 목적으로 오버라이딩 해서 사용한다
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		//전달받은 객체가 null인 경우 무조건 다른 객체이다.
		if(obj == null) {
			return false;
		}
		
		Book other =  (Book)obj;  //클래스 형변환
		if(title == null) {
			if(other.title != null) {
				return false;
			}
		} else if(!title.equals(other.title)) {
			return false;
		}
		if(author == null) {
			if(other.author != null) {
				return false;
			}
		} else if (!author.equals(other.author)) {
			return false;
		}
		
		if(price != other.price) {
			return false;
		}
		//모든 조건들을 통과하면 두 객체는 같은 객체이다.
		return true;
	}
	
	//단축키로 만들수있다
	@Override
	public String toString() { 
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
	/*	final int PRIME = 31; //소수
		int result = 1;
		int result1 = prime * result +((author == null)?0:author.hashCode());
		int result2 = prime * result + price;
		int result3 = prime * result +((title == null)?0:title.hashCode());
	
		return result1 + result2 + result3;
		*/
		return (author + price + title).hashCode();
	}
	
}

















