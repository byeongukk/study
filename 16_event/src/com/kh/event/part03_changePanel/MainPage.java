package com.kh.event.part03_changePanel;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.JPanel;

public class MainPage  extends JPanel {
	private MainFrame mf;
	private JPanel mainPage;
	
	public MainPage(MainFrame mf) {
		this.mf = mf;
		this.mainPage = this;
		
		this.addMouseListener(new MyMouseAdapter());
		
		this.setSize(300,200);
		this.setBackground(Color.BLUE);
		
		mf.add(this);
	}
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			ChangePanel.changePanel(mf, mainPage, new SubPage());
		}
	}
}



























