package com.kh.event.part03_changePanel;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class SubPage extends JPanel{
	private MainFrame mf;
	private JPanel subpage;
	public SubPage() {
		this.setSize(1024,768);
		this.setBackground(Color.YELLOW);
		this.addMouseListener(new MyMouseAdapter());
		
		
	}
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			ChangePanel.changePanel(mf, subpage, new ThPage());
		}
	}
}
