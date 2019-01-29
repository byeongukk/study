package com.kh.io.part03_addStream.chap02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedStream {
	
	public void inputBufferedStream() {
		//성능 향상을 위한 보조스트림이다.
		
		try(BufferedWriter bw 
				= new BufferedWriter(
				new FileWriter("sample2.txt"))){
			bw.write("안녕하세여\n");
			bw.write("반갑습니다\n");
			bw.write("안녕하세요\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void outputBufferedStream() {
		try(BufferedReader br = new BufferedReader(new FileReader("sample2.txt"))){
			
			String temp;
			while((temp = br.readLine())!= null) {
				System.out.println(temp);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
			
		
	}
}




















