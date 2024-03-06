package com.sds.project0306.gallery;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GalleryMain extends JFrame{
	MyCanvas can;
	JPanel p_south;
	JButton bt_prev, bt_next;
	
	public GalleryMain() {
		can = new MyCanvas();
		p_south = new JPanel();
		bt_prev = new JButton("◀");
		bt_next = new JButton("▶");
		
		//style 
		can.setPreferredSize(new Dimension(600, 550));
		
		//부착 
		add(can);
		p_south.add(bt_prev); //패널에 버튼 부착
		p_south.add(bt_next); //패널에 버튼 부착
		add(p_south, BorderLayout.SOUTH);//남쪽에 패널 부착 
			
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GalleryMain();		
	}

}
