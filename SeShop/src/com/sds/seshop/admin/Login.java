package com.sds.seshop.admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.sds.seshop.main.Page;
import com.sds.seshop.main.ShopMain;

//상품 등록 페이지 
public class Login extends Page{
	//1000 x 800 페이지 정의
	JLabel la_id, la_pass; 
	JTextField t_id;
	JPasswordField t_pass;
	JButton bt_login, bt_regist;
	
	
	
	public Login(ShopMain shopMain) {
		super(Color.MAGENTA);
		this.shopMain=shopMain;
		
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
		
		Dimension d = new Dimension(280, 40);
		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		la_pass.setPreferredSize(d);
		t_pass.setPreferredSize(d);
		
		
		//조립 
		container.add(la_id);
		container.add(t_id);
		container.add(la_pass);
		container.add(t_pass);
		container.add(bt_login);
		container.add(bt_regist);
		
		add(container);
		
		//관리자 가입 버튼과 리스너 연결 
		bt_regist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입 페이지로 전환, 이미 ShopMain에 정의해놓았다..
				shopMain.showHide(3);
			}
		});
	}
	
}






