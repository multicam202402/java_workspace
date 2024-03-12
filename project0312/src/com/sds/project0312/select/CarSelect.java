package com.sds.project0312.select;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CarSelect extends JFrame{
	JButton bt_connect;
	JButton bt_select;
	JPanel p_north; //버튼 2개를 올려놓을 북쪽 패널
	JTable table;
	JScrollPane scroll;
	
	public CarSelect() {
		bt_connect = new JButton("접속");
		bt_select = new JButton("가져오기");
		p_north = new JPanel();
		table = new JTable(); //컨트롤러를 넣을 예정 
		scroll  = new JScrollPane(table);
		
		//북쪽 조립 
		p_north.add(bt_connect);
		p_north.add(bt_select);
		add(p_north, BorderLayout.NORTH);//프레임의 북쪽에 패널부착
		
		//센터부착 
		add(scroll);
		
		//현재 프레임에 윈도우 리스너 연결
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//데이터베이스 해제할 예정...
				
				System.exit(0);
			}
		});
		
		setSize(600,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CarSelect();
	}

}
