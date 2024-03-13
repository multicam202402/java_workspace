package com.sds.seshop.admin;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.sds.seshop.main.Page;

//상품 등록 페이지 
public class Login extends Page{
	//1000 x 800 페이지 정의
	JPanel container;
	JLabel la_id, la_pass; 
	JTextField t_id;
	JPasswordField t_pass;
	JButton bt_login, bt_regist;
	
	
	public Login() {
		super(Color.MAGENTA);
		
		//생성
		container = new JPanel();
		la_id = new JLabel("ID");
		la_pass = new JLabel("Password");
		t_id = new JTextField();
		t_pass = new JPasswordField();
		bt_login = new JButton("Login");
		bt_regist = new JButton("관리자가입");
		
		//스타일
		container.setPreferredSize(new Dimension(600, 250));
		container.setBackground(Color.YELLOW);
		
		//조립 
		add(container);
	}
	
}






