package com.kh.event.part01_mouseAndKeyEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class B_keyEvent extends JFrame implements KeyListener{
	
	public B_keyEvent() {
		this.setTitle("키보드 이벤트");
		this.setSize(300, 200);
	
		JTextField tf = new JTextField(20);
		
		tf.addKeyListener(this);
		this.add(tf);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
	public static void main(String[] args) {
		new B_keyEvent();
	}
	public void disPlay(String s,KeyEvent e) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		
		String modifiers = e.isAltDown() + " " 
		+e.isControlDown() + " " 
		+e.isShiftDown();
		System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키가 눌렸을때
		//this.disPlay("KeyPressed", e);
	}


	@Override
	public void keyReleased(KeyEvent e) {
		//키가 때어졌을때
		//this.disPlay("KeyReleased", e);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		//pressed와 released를 합친것
		//한글 사용 가능
		this.disPlay("KeyTyped", e);
	}


	
}
