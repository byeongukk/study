package com.kh.chap04_constructor.user.controller;

import java.util.Date;

import com.kh.chap04_constructor.user.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User user1 = new User();
		user1.information();
		
		User user2 = new User("user01","pass01","최병욱");
		user2.information();
		
		User user3 = new User("user02","user02","홍길동", new Date());
		user3.information();
	}

}
