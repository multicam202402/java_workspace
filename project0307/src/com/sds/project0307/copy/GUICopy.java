package com.sds.project0307.copy;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUICopy extends JFrame{
	JLabel la_ori, la_dest;
	JTextField t_ori, t_dest;
	JButton bt;
	
	public GUICopy() {
		la_ori = new JLabel("원본 위치");
		la_dest = new JLabel("복사 위치");
		
		t_ori  = new JTextField();
		t_dest  = new JTextField();
		
		bt = new JButton("복사 실행");
		
		//스타일 
		Dimension d1 = new Dimension(180, 35);
		Dimension d2 = new Dimension(480, 35);
		
		la_ori.setPreferredSize(d1);
		la_dest.setPreferredSize(d1);
		
		t_ori.setPreferredSize(d2);
		t_dest.setPreferredSize(d2);
		
		//조립
		this.setLayout(new FlowLayout());
		add(la_ori);
		add(t_ori);
		add(la_dest);
		add(t_dest);
		add(bt);
		
		//윈도우 설정 
		setSize(700, 200);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//x자 누르면 프로세스 종료
	}
	
	public static void main(String[] args) {
		new GUICopy();
	}

}
