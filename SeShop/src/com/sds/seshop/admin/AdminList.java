package com.sds.seshop.admin;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

//상품 목록 페이지 
public class AdminList extends JPanel{
	//1000 x 800 페이지 정의
	public AdminList() {
		this.setBackground(Color.ORANGE);
		this.setPreferredSize(new Dimension(1000, 800));
	}
}
