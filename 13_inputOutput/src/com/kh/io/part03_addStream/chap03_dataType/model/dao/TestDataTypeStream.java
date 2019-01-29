package com.kh.io.part03_addStream.chap03_dataType.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataTypeStream {
	public void addDataTypeStream() {
		//데이터 자료형별로 처리하는 기능을 추가한 보조스트림
		
		try(DataInputStream din = new DataInputStream(new FileInputStream("score.dat"));
				DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.dat"));){
			
			//파일에 자료형별로 기록
			dout.writeUTF("홍길동");
			dout.writeInt(95);
			dout.writeChar('A');
			
			dout.writeUTF("이순신");
			dout.writeInt(85);
			dout.writeChar('B');
			
			dout.writeUTF("김유신");
			dout.writeInt(73);
			dout.writeChar('C');
			
			while(true) {
				System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
			}
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			/*e.printStackTrace();*/
			System.out.println("파일 읽기 완료!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}




















