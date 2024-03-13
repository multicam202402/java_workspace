package com.sds.seshop.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sds.seshop.admin.AdminList;
import com.sds.seshop.admin.AdminRegist;
import com.sds.seshop.admin.Login;
import com.sds.seshop.product.ProductList;
import com.sds.seshop.product.ProductRegist;

//쇼핑몰 관리자 페이지의 메인 
public class ShopMain extends JFrame{
	JPanel p_north;
	JButton bt_regist, bt_list, bt_admin, bt_join, bt_login;
	String[] iconArray= {"product.png","list.png","admin.png","join.png","login.png"};
	JButton[] btn=new JButton[iconArray.length]; //5개짜리 빈 공간(버튼만 담을 수 있는...)
	
	JPanel p_center; //페이지들이 교체될 컨테이너(상품등록페이지, 상품목록, 관리자명단, 로그인폼)
	
	//상품등록 페이지 
	ProductRegist productRegist;
	ProductList productList;
	AdminList adminList;
	AdminRegist adminRegist;
	Login login;
	
	public ShopMain() {
		p_north = new JPanel();
		//패키지를 기준으로 자원의 경로를 얻기 
		
		Dimension d = new Dimension(75, 60);
		
		for(int i=0;i<btn.length;i++) {
			btn[i] = new JButton(getIcon(iconArray[i]));
			btn[i].setPreferredSize(d);
			
			//북쪽 패널에 버튼 부착 
			p_north.add(btn[i]);
		}
		
		//센터 프레임 생성 
		p_center = new JPanel();
		p_center.setBackground(Color.YELLOW);
		
		//5페이지 생성 
		productRegist = new ProductRegist();
		productList = new ProductList();
		adminList = new AdminList();
		adminRegist = new AdminRegist();
		login = new Login();
		
		//5페이지를 센터에 부착
		p_center.add(productRegist);
		p_center.add(productList);
		p_center.add(adminList);
		p_center.add(adminRegist);
		p_center.add(login);
		
		
		//프레임에 부착 
		add(p_north, BorderLayout.NORTH);
		add(p_center); //BorderLayout의 CENTER에 부착 
		
		//윈도우 어댑터를 익명으로 연결 (어댑터란 우리 대신 리스너를 구현한 객체 즉 어댑터가 바로 리스너임) 
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//db커넥션을 닫을 예정 
				System.exit(0);//실행중인 프로그램을 프로세스..프로세스 종료
			}
		});
		
		//상품 등록 버튼에 리스너 연결 
		btn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		setSize(1000,850);
		setVisible(true);
	}
	
	//지정한 경로의 아이콘을 반환해주는 메서드 
	//filename에 원하는 이미지 명을 넣으면, 아이콘으로 변환하여 줌
	public ImageIcon getIcon(String filename) {
		URL url = this.getClass().getClassLoader().getResource(filename);
		ImageIcon icon = new ImageIcon(url);
		//ImageIcon 클래스 자체에는 크기 조정하는 메서드가 지원되지 않으므로, Image로 변환한 후 
		//Image가 보유한 getScaledInstance() 메서드로 크기를 조정해서 와보자 
		Image image = icon.getImage(); //이미지로 변환 (이미지가 이미지 아이콘보다 더 넓은 개념)
		image = image.getScaledInstance(75, 60, Image.SCALE_SMOOTH);
		
		return new ImageIcon(image);
	}
	
	public static void main(String[] args) {
		new ShopMain();
	}

}
