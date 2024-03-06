package com.sds.project0306.gallery;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GalleryMain extends JFrame implements ActionListener{
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
		
		//버튼과 리스너 연결 
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
		
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		new GalleryMain();		
	}

}
