package com.sds.seshop.product;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import com.sds.seshop.main.Page;
import com.sds.seshop.main.ShopMain;

//상품 등록 페이지 
public class ProductRegist extends Page{
	JLabel la_top, la_sub, la_product_name, la_price, la_brand, la_image, la_download,la_preview;
	JComboBox b_top, b_sub; //상위, 하위 선택상자 
	JTextField t_product_name, t_price, t_brand, t_url;
	JProgressBar bar; //다운로드 현황 
	JPanel p_preview; //이미지 미리보기 패널	
	JButton bt_collect, bt_regist, bt_list; //수집, 상품 등록, 목록 버튼
	
	public ProductRegist(ShopMain shopMain) {
		super(Color.GREEN);
		this.shopMain =shopMain;
		
		//컨테이너 크기 조정 및 색상 부여 
		container = new JPanel();
		container.setPreferredSize(new Dimension(600, 700));
		container.setBackground(Color.YELLOW);
			
		//생성
		la_top = new JLabel("상위 카테고리");
		la_sub = new JLabel("하위 카테고리");
		la_product_name = new JLabel("제품명");
		la_price = new JLabel("가격");
		la_brand = new JLabel("브랜드");
		la_image = new JLabel("수집 URL");
		la_download = new JLabel("다운로드 현황");
		la_preview = new JLabel("미리보기");
		
		b_top = new JComboBox();
		b_sub = new JComboBox();
		t_product_name = new JTextField();
		t_price = new JTextField();
		t_brand = new JTextField();
		t_url = new JTextField();
		bt_collect = new JButton("수집");
		bar = new JProgressBar();
		p_preview  = new JPanel();
		bt_regist = new JButton("상품등록");
		bt_list = new JButton("상품목록");
		
		//스타일
		
		
		//조립 
		
		add(container);
	}
}



