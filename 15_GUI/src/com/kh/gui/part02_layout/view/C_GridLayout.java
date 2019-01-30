package com.kh.gui.part02_layout.view;

import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame {
	public C_GridLayout() {
		super("GridLayout");
		
		this.setBounds(300,200,800,500);
		
		//GridLayout
		//컴포넌트를 가로, 세로 일정 수만큼 배치하고자 할 떄 사용한다.
		this.setLayout(new GridLayout(5,5));
		
/*		for(int i= 1; i <26; i++) {
			String str = new Integer(i).toString();
			this.add(new JButton(str));
		}*/
		//중복 제거해서 랜덤으로 빙고판 만들기
		Set set = new LinkedHashSet();
		
		while(set.size() < 25) {
			set.add(new Random().nextInt(25)+1);
		}
		
		Object[] obj = set.toArray();
		
		for(int i=0; i <obj.length; i++) {
			String str = new Integer((int)obj[i]).toString();
			this.add(new JButton(str));
		}
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
