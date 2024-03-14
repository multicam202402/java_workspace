package com.sds.seshop.product;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	JComboBox<String> b_top, b_sub; //상위, 하위 선택상자 
	JTextField t_product_name, t_price, t_brand, t_url;
	JProgressBar bar; //다운로드 현황 
	JPanel p_preview; //이미지 미리보기 패널	
	JButton bt_collect, bt_regist, bt_list; //수집, 상품 등록, 목록 버튼
	
	//콤보박스가 디자인에 초첨을 맞춰놓은 컴포넌트 이기 때문에, 실제 데이터를 담을 수 없다..
	//따라서 콤보박스의 각 아이템의 index와 위치가 일치하는 배열과 같은 존재를 두자..기왕이면 
	//ArrayList로 가자!!
	ArrayList<Integer> topIdxList = new ArrayList<Integer>();
	
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
		
		b_top = new JComboBox<String>();
		b_sub = new JComboBox<String>();
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
		Dimension d = new Dimension(280, 35);
		la_top.setPreferredSize(d);
		b_top.setPreferredSize(d);
		
		la_sub.setPreferredSize(d);
		b_sub.setPreferredSize(d);
		
		la_product_name.setPreferredSize(d);
		t_product_name.setPreferredSize(d);
		
		la_price.setPreferredSize(d);
		t_price.setPreferredSize(d);
		
		la_brand.setPreferredSize(d);
		t_brand.setPreferredSize(d);
		
		la_image.setPreferredSize(d);
		t_url.setPreferredSize(new Dimension(220, 35));
		
		la_download.setPreferredSize(d);
		bar.setPreferredSize(d);
		
		la_preview.setPreferredSize(d);
		p_preview.setPreferredSize(new Dimension(280, 280));
		
		//조립 
		container.add(la_top);
		container.add(b_top);
		container.add(la_sub);
		container.add(b_sub);
		container.add(la_product_name);
		container.add(t_product_name);
		container.add(la_price);
		container.add(t_price);
		container.add(la_brand);
		container.add(t_brand);
		container.add(la_image);
		container.add(t_url);
		container.add(bt_collect);
		container.add(la_download);
		container.add(bar);
		container.add(la_preview);
		container.add(p_preview);
		container.add(bt_regist);
		container.add(bt_list);
		
		add(container);
		
		getTopCategory();//최상위 카테고리 데이터 불러오기
		
		//상위 카테고리에 리스너 연결 
		b_top.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) { //html의 onChage 와 동일
				
				if(e.getStateChange() == ItemEvent.SELECTED) {
					int index=b_top.getSelectedIndex(); //현재 콤보박스의 아이템 중 몇번째 칸을 선택했는지 반환
					System.out.println(index+" 번째 칸 선택했어");
					
					//원칙은 get() 을 통해 얻어진 객체가 Integer 이지만, 개발자가 int 형으로 
					//대입이 가능한 현상을 unBoxing 이라 한다..이것 또한 편의성때문에 지원한다..
					int topcategory_idx = topIdxList.get(index);
					System.out.println("부모의 주민번호는 "+topcategory_idx);
					
					getSubCategory(topcategory_idx); //서브 카테고리 목록 가져오기
				}
			}
		});
	}
	
	public void getTopCategory() {
		//콤보박스에 최상위 카테고리를 넣어주기 
		PreparedStatement pstmt=null; //닫으려고..try문 밖에 선언
		ResultSet rs=null; //닫으려고..try문 밖에 선언 
	
		
		try {
			pstmt=shopMain.con.prepareStatement("select * from topcategory"); //쿼리 준비 객체 생성 
			
			//실행 : DmL-executeUpdate(), select-executeQuery() 실행 후 ResultSet 반환
			rs = pstmt.executeQuery(); //select 문 전송~~후 결과 표 받기
			
			while(rs.next()) { //next() 메서드가 참을 반환하는 동안, 커서  전진 
				b_top.addItem(rs.getString("topname"));
				
				//상위 카테고리의 idx도 담아두자				
				topIdxList.add(rs.getInt("topcategory_idx")); //원칙상 int 기본 자료형이므로, 즉 객체자료형이 아니므로 
											//ArrayList에 직접 담을 수 없어야 하지만, sun 편의상 
											//컬렉션 객체에 기본 자료형을 담을 자동으로 Wrapper형태로
										//변환해주는 현상을 지원.. 기본자료형을 boxing 처리라 한다
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	public void getSubCategory(int topcategory_idx) {
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		//String sql="select * subcategory where topcategory=내가선택한top의 idx값";
		String sql="select * from subcategory where topcategory_idx="+topcategory_idx;
		System.out.println(sql);//쿼리문 검증 
		
		//pstmt=shopMain.con.prepareStatement(sql);
	}
}









