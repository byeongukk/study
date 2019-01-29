package com.kh.io.part04_objectStream.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.io.part04_objectStream.model.vo.Member;

public class TestObjectIO {
	public void fileSave() {
		Member[] mar = {
				new Member("user01","pass01","홍길동","hong777@kh.or.kr",25,'남',1250.7),
				new Member("user02","pass02","유관순","u2002.kh.co.kr",20,'여',1500.5),
				new Member("user03","pass03","이순신","lee500.kh.or.kr",30,'남',2000.5)
		};
		
		try(ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("member.dat"))){
		
			for(int i = 0; i < mar.length; i++) {
				objOut.writeObject(mar[i]);
			}
			
			objOut.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void fileOpen() {
		Member[] mar = new Member[3];
		
		try(ObjectInputStream objIn = new ObjectInputStream(
				new FileInputStream("member.dat"))) {
			for(int i = 0; i < mar.length; i++) {
				mar[i] =(Member) objIn.readObject();
			}
			for(Member m : mar) {
				System.out.println(m);
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
