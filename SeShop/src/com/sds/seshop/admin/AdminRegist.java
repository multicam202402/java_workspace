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
public class AdminRegist extends Page{
	JLabel la_id, la_pass, la_email, la_profile;
	JTextField t_id;
	JPasswordField t_pass;
	JTextField t_email;
	JButton bt_profile;//프로필 사진 선택 창 띄우기 버튼
	JPanel p_preview; //사진 미리보기 
	JButton bt_regist, bt_login;
	
	
	//1000 x 800 페이지 정의
	public AdminRegist() {
		super(Color.CYAN);
		
		container = new JPanel();
		
		la_id = new JLabel("ID");
		la_pass = new JLabel("Password");
		la_email = new JLabel("Email");
		la_profile = new JLabel("프로필사진");
		
		t_id  = new JTextField();
		t_pass  =new JPasswordField();
		t_email  = new JTextField();
		bt_profile = new JButton("파일 찾기");
		p_preview = new JPanel();
		bt_regist = new JButton("가입");
		bt_login = new JButton("Login");
		
		//스타일 
		container.setBackground(Color.LIGHT_GRAY);
		container.setPreferredSize(new Dimension(600, 700));
		
		Dimension d = new Dimension(280, 40);
		
		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		la_pass.setPreferredSize(d);
		t_pass.setPreferredSize(d);
		la_email.setPreferredSize(d);
		t_email.setPreferredSize(d);
		la_profile.setPreferredSize(d);
		bt_profile.setPreferredSize(d);
		
		p_preview.setPreferredSize(new Dimension(400, 400));
		
	}
}



