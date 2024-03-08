package com.sds.project0308.bar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressTest extends JFrame{
	
	JButton bt;
	JProgressBar bar;
	
	public ProgressTest() {
		bt = new JButton("Download");
		bar = new JProgressBar();
		
		setLayout(new FlowLayout());
		
		//스타일 
		bar.setPreferredSize(new Dimension(760, 50));
		
		add(bt);
		add(bar);
		
		//버튼과 리스너 연결 
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나 눌럿어?");
			}
		});
		
		setSize(800,250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ProgressTest();
	}

}
