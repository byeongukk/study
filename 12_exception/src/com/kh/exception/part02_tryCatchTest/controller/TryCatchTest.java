package com.kh.exception.part02_tryCatchTest.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TryCatchTest {
	public void methodA() {
		System.out.println("메소드 A 호출됨...");
		
		//호출한 곳에서 예외를 처리하는게 원칙.
		try {
			methodB();
			
			System.out.println("예외 발생시에는 출력되지 않음");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			//예외에 상관없이 무조건 실행하는 구문
			System.out.println("예외여부 상관없이 무조건 수행됨");
		}
		
		System.out.println("메소드 A 종료됨...");
	}
	public void methodB() throws Exception {
		System.out.println("메소드 B 호출됨...");
		
		//예외 발생시 throws 한곳으로 돌아가 catch구문으로 간다.
		throw new Exception("강제로 예외를 발생시켰습니다.");
		
		/*System.out.println("메소드 B 종료됨...");*/
	}
	public void ioTest() {
		BufferedReader in = null;
		try {
			//FileReader라는 객체 생성시 예외 발생한다.
			//사용하는 쪽에서 반드시 예외처리를 해야하기 때문에
			//try-catch 블럭 안에서 작성해야한다.
			in = new BufferedReader(new FileReader("test.dat"));
			String s;
			
			//readLine 메소드도 IOException을 발생시켜 놓았기 때문에
			//catch블럭을 추가해서 예외처리 구문을 작성함.
			while((s = in.readLine()) != null) {
				
			}
		
		//FileNotFountdException과 EOFException을 동시에 처리할 수 있다.
		//동일레벨의 클래스(부모가같은클래스)는 같은 catch블록안에 사용이 가능하다 
		} catch(FileNotFoundException /*| EOFException*/ e) {
			System.out.println("FileNotFoundException : " + e.getMessage());
			
			//FileNotFoundException : 읽으려는 파일이 존재하지 않을 때 발생하는 예외
			//EOFException : 파일의 끝을 만나면 발생하는 예외(End Of FIle)
		} catch(IOException e) {
			//IOException : 입출력에 관한 예외
			//catch블럭을 여러개 작성시 반드시 후손타입이 먼저 작성되어야 한다.
			e.printStackTrace();
		} finally {
			//예외처리 구문과 상관 없이 반드시 수행해야 하는 내용을 작성하며
			//보통 사용한 자원을 반납할 목적으로 사용한다.
			
			//finally 블럭 안에서라도 또 예외처리를 필요로 하는 메소드 호출시에는
			//try-catch블럭을 사용해야 한다.
			try {
				//null을 체크하지 않으면  nullPointerException이 발생한다.
				//NullPointerException은 unchecked Exception으로
				//try-catch로 처리하기 보다는 if-else구문으로 처리한다.
				if(in != null) {
					in.close();
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	public void ioTest2() {
		//반납할 자원이 있는 경우 try-with-resource구문으로 처리할 수 있다.
		//java 1.7버전부터 추가된 기능이다.
		//꼭 반납해야 하는 객체의 경우try() 괄호 안에서 객체를 생성할 수 있으며,
		//여러개를 생성할 수도 있다.
		//괄호 안에서 생성한 객체는 finally 블럭에서 close() 하지 않아도 된다.
		//하지만 선언한 레퍼런스는 try 블럭 안에서만 사용 가능하다.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			System.out.println("숫자 한 개 입력 : ");
			
			String str = br.readLine();
			int num = Integer.parseInt(str);
			
			bw.write("입력한 숫자의 2배는 : " + (num * 2)); 
					
		//가장 상위인 Exception만 catch블럭으로 처리하면
		//하위 Exception클래스의 처리를 한거번에 할 수 있지만,
		//예외별로 처리 구문을 따로 작성할 수 없기 떄문에 권장사항은 아니다.
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}























