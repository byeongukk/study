package com.kh.exception.silsub1.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import com.kh.exception.silsub1.controller.CharacterProcess;
import com.kh.exception.silsub1.exception.CharCheckException;

public class ConsoleIO {
	public void charInput() {
		CharacterProcess cp = new CharacterProcess();
		try{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
			System.out.println("문자열입력 :");	
			String str = br.readLine();
			cp.countAlpha(str);
		} catch(CharCheckException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void charOutput(String s,int count) {
		System.out.println("문자열     : " + s);
		System.out.println("영문자 수 : " + count);
	}
	public void numberInput() {
		
	}
}
