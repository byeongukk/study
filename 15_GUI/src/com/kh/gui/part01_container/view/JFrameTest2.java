package com.kh.gui.part01_container.view;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class JFrameTest2 {
	//프레임 생성하는 방법2
	//javax.swing.JFream 클래스를 객체로 생성 후
	//해당 프레임 객체의 설정 값을 변경하는 방법
	public void showMainFrame() {
		/*JFrame mainFrame = new JFrame();
		mainFrame.setTitle("MyTitle");*/
		JFrame mainFrame = new JFrame("MyFrame2");
		
		//Rectangle 객체를 활용한 사이즈 설정
		Rectangle r = new Rectangle(300,200,800,500);
		mainFrame.setBounds(r);
		
		
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//가장 밑에적는게 권장되는 방식
		mainFrame.setVisible(true);
	}

	
}

















