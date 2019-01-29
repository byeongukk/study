package com.kh.io.part02_charStream.run;

import com.kh.io.part02_charStream.model.dao.TestCharStream;

public class Run {

	public static void main(String[] args) {
		TestCharStream tcs = new TestCharStream();
		tcs.fileSave();
		tcs.fileOpen();
	}

}
