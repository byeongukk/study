package com.kh.exception.silsub1.controller;

import com.kh.exception.silsub1.exception.CharCheckException;
import com.kh.exception.silsub1.view.ConsoleIO;

public class CharacterProcess {
	public CharacterProcess(){}
	ConsoleIO cs = new ConsoleIO();
	public void countAlpha(String s) throws CharCheckException{
		int ctn = 0;
		char[] ch = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			ch[i] = s.charAt(i);
			if(ch[i]==' ') {
				throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다");
			}
			if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')) {
				ctn++;
			}
		}
		cs.charOutput(s, ctn);
	}
	
}
