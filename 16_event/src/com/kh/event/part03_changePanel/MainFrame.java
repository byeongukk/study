package com.kh.event.part03_changePanel;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame() {
		this.setSize(1024,768);
		
		new MainPage(this);
		this.setResizable(false);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
