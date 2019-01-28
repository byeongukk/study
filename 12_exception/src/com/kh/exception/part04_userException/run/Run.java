package com.kh.exception.part04_userException.run;

import com.kh.exception.part04_userException.controller.MyExceptionTest;

public class Run {

	public static void main(String[] args) {
		MyExceptionTest met = new MyExceptionTest();
		
		met.inputAge();
	}

}
