package com.sds.project0312.select;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/javase";
	String user="root";
	String pass;
	
//	String driver="oracle.jdbc.driver.OracleDriver";
//	String url="jdbc:oracle:thin:@localhost:1521:XE";
//	String user="batman";
//	String pass="1234";
	
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
		
		//접속버튼과 리스너 연결
		bt_connect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connect();
			}
		});
		
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
	
	public void connect() {
		
	}
	
	public static void main(String[] args) {
		new CarSelect();
	}

}
