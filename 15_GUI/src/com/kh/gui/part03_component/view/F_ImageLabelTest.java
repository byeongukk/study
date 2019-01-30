package com.kh.gui.part03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class F_ImageLabelTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("이미지라벨 테스트");
		mf.setSize(250, 300);
		
		JPanel panel = new JPanel();
		
		Image icon = new ImageIcon("images/user.PNG").getImage().getScaledInstance(500, 500, 0);

		JLabel label = new JLabel(new ImageIcon(icon));
		
		JButton button = new JButton("이미지 보기");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Image icon = new ImageIcon("images/dog.PNG")
						.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
				label.setIcon(new ImageIcon(icon));
			}
		});
		
		
		panel.add(label, "Center");
		panel.add(button, "South");
		
		mf.add(panel);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}














