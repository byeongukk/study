package com.kh.gui.part02_layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayOut extends JFrame{
	public A_BorderLayOut() {
		super("BorderLayout");
		
		//프레임 크기 설정
		this.setBounds(300,200,800,500);
		
		//레이아웃 설정
		//this.setLayout(new BorderLayout());
		
		//LayoutManager 인터페이스위 후손 클래스로 다양한 레이아웃을 제공한다.
		//layout은 기본형태가 BorderLayout 
	/*	JButton north = new JButton("북");
		JButton south = new JButton("남");
		JButton east = new JButton("동");
		JButton west = new JButton("서");
		JButton center = new JButton("중앙");
		
		this.add(north, "North");
		this.add(south, "South");
		this.add(east, "East");
		this.add(west, "West");
		this.add(center, "Center");*/
		
		this.add(new JButton("북"), "North");
		this.add(new JButton("남"), "South");
		this.add(new JButton("동"), "East");
		this.add(new JButton("서"), "West");
		this.add(new JButton("중앙"), "Center");
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


















