package com.sds.seshop.product;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.sds.seshop.main.Page;
import com.sds.seshop.main.ShopMain;

//상품 목록 페이지 
public class ProductList extends Page{
	JTable table;
	JScrollPane scroll;
	JPanel p_south;
	ProductTableModel model;
	
	public ProductList(ShopMain shopMain) {
		super(Color.RED);
		this.shopMain =shopMain;
		
		//컨테이너 올리기 
		container = new JPanel();
		container.setPreferredSize(new Dimension(800, 700));
		container.setBackground(Color.YELLOW);
		container.setLayout(new BorderLayout()); //원래 FlowLayout던 것을 BorderLayout 교체
		
		
		//생성 
		table = new JTable(model = new ProductTableModel());
		scroll =new JScrollPane(table);
		p_south = new JPanel();
		
		//스타일 
		p_south.setPreferredSize(new Dimension(800, 250));
		p_south.setBackground(Color.CYAN);
		
		//조립 
		container.add(scroll); //센터에 부착됨 
		container.add(p_south, BorderLayout.SOUTH); //south 에 부착
		
		
		add(container);
	}
}




