package com.sds.seshop.product;

import java.awt.Color;

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
	JButton bt_regist, bt_list; //상품 등록, 목록 버튼
	
	
	public ProductRegist(ShopMain shopMain) {
		super(Color.GREEN);
		this.shopMain =shopMain;
	}
}
