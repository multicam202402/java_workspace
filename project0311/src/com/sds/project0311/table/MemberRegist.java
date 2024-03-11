package com.sds.project0311.table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MemberRegist extends JFrame{
	//서쪽 영역 필요 컴포넌트들 
	JPanel p_west;
	JTextField t_id; //아이디
	JTextField t_phone; //연락처 
	JTextField t_gender; //성별 
	JButton bt;//등록 버튼 
	
	//데이터가 되는 이차원 배열 
	String[][] data={
		{"SCOTT","010","남"}
	};
	String[] column= {"아이디","연락처","성별"};
	
	JTable table;
	JScrollPane scroll;
	
	public MemberRegist() {
		p_west = new JPanel();
		t_id = new JTextField();
		t_phone = new JTextField();
		t_gender = new JTextField();
		
		table = new JTable(data, column);
		scroll = new JScrollPane(table);
		bt = new JButton("등록");
		
		//스타일 
		p_west.setPreferredSize(new Dimension(150,400));
		p_west.setBackground(Color.YELLOW);
		
		Dimension d = new Dimension(135, 45);
		t_id.setPreferredSize(d);
		t_phone.setPreferredSize(d);
		t_gender.setPreferredSize(d);
		
		
		//조립 
		p_west.add(t_id);
		p_west.add(t_phone);
		p_west.add(t_gender);
		p_west.add(bt);
		
		add(p_west, BorderLayout.WEST);//패널을 서쪽에 부착 
		add(scroll); //센터에 스크롤 부착(테이블 포함된)
		
		//버튼과 리스너 연결 
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나 눌렀어?");
			}
		});
		
		
		//윈도우 설정 
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MemberRegist();
	}
}





