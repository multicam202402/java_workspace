package com.sds.seshop.product;

import java.awt.Color;

import com.sds.seshop.main.Page;
import com.sds.seshop.main.ShopMain;

//상품 등록 페이지 
public class ProductRegist extends Page{
	//1000 x 800 페이지 정의
	public ProductRegist(ShopMain shopMain) {
		super(Color.GREEN);
		this.shopMain =shopMain;
	}
}
