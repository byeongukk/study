package com.kh.silsub1.student.run;

import com.kh.silsub1.student.controller.StudentManager;

public class Run {

	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		sm.insertStudentData();
		sm.printStudentData();
	}

}
