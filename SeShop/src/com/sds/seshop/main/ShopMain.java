package com.sds.seshop.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//쇼핑몰 관리자 페이지의 메인 
public class ShopMain extends JFrame{
	JPanel p_north;
	JButton bt_regist, bt_list, bt_admin, bt_join, bt_login;
	JPanel p_center; //페이지들이 교체될 컨테이너(상품등록페이지, 상품목록, 관리자명단, 로그인폼)
	
	public ShopMain() {
		p_north = new JPanel();
		bt_regist = new JButton("상품등록");
		bt_list = new JButton("상품등록");
		bt_admin = new JButton("관리자 목록");
		bt_join = new JButton("관리자 등록");
		bt_login = new JButton("상품등록");
		
		//스타일
		
		//북쪽 패널에 버튼 부착 
		p_north.add(bt_regist);
		p_north.add(bt_list);
		p_north.add(bt_admin);
		p_north.add(bt_join);
		p_north.add(bt_login);
		
		
	}
	
	public static void main(String[] args) {
		new ShopMain();
	}

}
