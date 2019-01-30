package com.kh.gui.part02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JPanel{
	public F_PanelLayout() {
		
		
		JLabel lb = new JLabel("이름 : ");
		lb.setLocation(50,100);
		lb.setSize(150,50);
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110,100);
		tf.setSize(200,50);
		
		JButton btn = new JButton("추 가");
		btn.setLocation(350,100);
		btn.setSize(100,50);
		
		JPanel panel = new JPanel();
		panel.setSize(500,500);
		
		//패널에 레이아웃을 설정하지 않으면 기본 flowlayout의
		//alignment center의 값을 가지게 된다
		//패널 위에 마음대로 배치하기 위해서는 패널에도
		//레이아웃을 지정해야 한다.
		panel.setLayout(null);
		
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		
		this.add(panel);
		
		this.setVisible(true);
		
		
	}
	
	
	
}
