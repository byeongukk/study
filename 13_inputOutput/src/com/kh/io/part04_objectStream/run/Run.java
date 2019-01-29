package com.kh.io.part04_objectStream.run;

import com.kh.io.part04_objectStream.model.dao.TestObjectIO;

public class Run {

	public static void main(String[] args) {
		TestObjectIO to = new TestObjectIO();
		to.fileSave();
		to.fileOpen();
	
	}

}
