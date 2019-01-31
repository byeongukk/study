package com.kh.event.part01_mouseAndKeyEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_mouseEvent extends JFrame implements MouseListener, MouseMotionListener{

	public A_mouseEvent() {
		this.setTitle("Mouse Event");
		this.setSize(300, 200);

		JPanel panel = new JPanel();
		
		this.add(panel);
	
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	
	}
	
	
	public static void main(String[] args) {
		new A_mouseEvent();
	}
	
	public void display(String s, MouseEvent e) {
		System.out.println(s + " x = " + e.getX() + " Y = " + e.getY());
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		//마우스를 눌렀다 떼었을 때
		this.display("Mouse clicked (# of clicked : " + e.getClickCount() + ")", e);
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		this.display("Mouse entered", e);
	}


	@Override
	public void mouseExited(MouseEvent e) {
		this.display("Mouse exited", e);
	}


	@Override
	public void mousePressed(MouseEvent e) {
		//마우스가 눌렸을 때
		this.display("Mouse Pressed(# of clicks :" + e.getClickCount() + ")", e);
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		//마우스에서 손을 땠을때
		this.display("Mouse relesd (# of clicks : " + e.getClickCount() + ")", e);
		
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		this.display("Mouse Dragged", e);
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		this.display("Mouse Moved", e);
		
	}

}
