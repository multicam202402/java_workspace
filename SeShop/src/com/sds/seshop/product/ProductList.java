package com.sds.seshop.product;

import java.awt.Color;

import com.sds.seshop.main.Page;
import com.sds.seshop.main.ShopMain;

//상품 목록 페이지 
public class ProductList extends Page{
	//1000 x 800 페이지 정의
	public ProductList(ShopMain shopMain) {
		super(Color.RED);
		this.shopMain =shopMain;
	}
}
