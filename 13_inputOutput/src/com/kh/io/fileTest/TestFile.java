package com.kh.io.fileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		//File클래스 테스트
		//파일이 없어도 파일 객체를 생성할 수 있다.
		File file = new File("person.txt");
		
		System.out.println("파일명 : " + file.getName());
		//절대경로
		System.out.println("절대저장경로 : " + file.getAbsolutePath());
		//파일에대한 상대경로
		System.out.println("상대저장경로 : " + file.getPath());
		System.out.println("파일 용량 : " + file.length());
		//실제 존재하지 않는 파일이기 때문에 null
		System.out.println("상위폴더 : " + file.getParent());
		
		try {
			//파일이 없는 경우 파일을 생성하고, 생성하면 true를 리턴
			//기존에 파일이 있는 경우 false를 리턴한다.
			boolean b = file.createNewFile();

			System.out.println("b : " + b);
			
			boolean b2 = file.delete();
			
			System.out.println("b2 : " + b2);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}





















