package com.kh.gui.part03_component.view;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class K_DialogTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		JPanel panel = new JPanel();
		
		JButton button1 = new JButton("Simple Dialog");
		
		Dialog sd = new Dialog(mf, "Simple Dialog");
		sd.setBounds(150,250,150,150);
		sd.add(new JLabel("Simple dialog test"));
		
		JButton button2 = new JButton("close");
		sd.add(button2);
		JButton button3 = new JButton("Input Dialog");
		panel.add(button3);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sd.setVisible(true);
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sd.dispose();
			}
		});
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//한줄을 입력받기위한 창을 띄움
				String result = JOptionPane.showInputDialog("내용을 입력하세요");
				System.out.println(result);
			}
		});
		
		panel.add(button1);
		mf.add(panel);
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}













