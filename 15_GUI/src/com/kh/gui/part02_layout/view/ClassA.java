package com.kh.gui.part02_layout.view;

import javax.swing.JFrame;

public class ClassA extends JFrame{
	
	public ClassA() {
		super("JPanelLayoutTest");
		F_PanelLayout fp = new F_PanelLayout();
		
		this.setBounds(200, 200, 500, 500);
		
		this.setLayout(null);
		this.add(fp);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
