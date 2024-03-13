package com.sds.seshop.admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.sds.seshop.main.Page;
import com.sds.seshop.main.ShopMain;

//상품 등록 페이지 
public class AdminRegist extends Page{
	JLabel la_id, la_pass, la_email, la_profile;
	JTextField t_id;
	JPasswordField t_pass;
	JTextField t_email;
	JButton bt_profile;//프로필 사진 선택 창 띄우기 버튼
	JLabel la_dummy;//프로필 사진의 공백을 메울 목적
	JPanel p_preview; //사진 미리보기 
	JButton bt_regist, bt_login;
	
	//1000 x 800 페이지 정의
	public AdminRegist(ShopMain shopMain) {
		super(Color.CYAN);
		this.shopMain =shopMain;
		
		container = new JPanel();
		
		la_id = new JLabel("ID");
		la_pass = new JLabel("Password");
		la_email = new JLabel("Email");
		la_profile = new JLabel("프로필사진");
		la_dummy=new JLabel("");
		
		t_id  = new JTextField();
		t_pass  =new JPasswordField();
		t_email  = new JTextField();
		bt_profile = new JButton("파일 찾기");
		p_preview = new JPanel();
		bt_regist = new JButton("가입");
		bt_login = new JButton("Login");
		
		//스타일 
		container.setBackground(Color.LIGHT_GRAY);
		container.setPreferredSize(new Dimension(600, 700));
		
		Dimension d = new Dimension(280, 40);
		
		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		la_pass.setPreferredSize(d);
		t_pass.setPreferredSize(d);
		la_email.setPreferredSize(d);
		t_email.setPreferredSize(d);
		la_profile.setPreferredSize(d);
		bt_profile.setPreferredSize(d);
		la_dummy.setPreferredSize(d);
		
		p_preview.setPreferredSize(new Dimension(280, 280));
		
		//조립 
		container.add(la_id);
		container.add(t_id);
		container.add(la_pass);
		container.add(t_pass);
		container.add(la_email);
		container.add(t_email);
		container.add(la_profile);
		container.add(bt_profile);
		container.add(la_dummy);
		container.add(p_preview);
		container.add(bt_regist);
		container.add(bt_login);	
		
		add(container);
		
		//가입 버튼에 리스너 연결 
		bt_regist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//관리자 오라클에 가입 시키기!!
				regist();
			}
		});
		
		//로그인 버튼에 리스너 연결
		bt_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shopMain.showHide(4);
			}
		});		
	}
	
	// 회원가입 메서드 정의 
	public void regist() {
		//쿼리문 수행
		PreparedStatement pstmt=null; //쿼리문 수행은 접속 이후에나 가능하므로, 접속객체로 부터 얻어야 함
		
		//shopMain의  con 나와 는 다른 패키지에 있는 멤버변수 이므로 즉 현재 default 접근제한자가 적용되
		//어 있으므로, 접근을 하려면, con의 접근제한을 느슨하게 하자 
		try {
			String id=t_id.getText(); //사용자가 입력한 id
			String pass= new String(t_pass.getPassword()); //사용자가 입력한 pass
			String email=t_email.getText();//사용자가 입력한 email
			String filename="123123.jpg";//사용자가 입력한 filename
			
			String sql="insert into admin(admin_idx, id, pass, email, filename)";
			sql +=" values(seq_admin.nextval, '"+id+"', '"+pass+"', '"+email+"' ,'"+filename+"')";
			
			//오라클에 실행전에 우리가 먼저 검증해본다 
			System.out.println(sql);
			
			pstmt = shopMain.con.prepareStatement(sql);//쿼리문 준비 
			
			//준비된 쿼리문 수행하자 (DML-(insert, update, delete), select )
			int result = pstmt.executeUpdate(); //쿼리 실행!!! DML인 경우는 0이 나오면 실패
			
			if(result==0) {
				JOptionPane.showMessageDialog(this, "가입 실패");
			}else {
				JOptionPane.showMessageDialog(this, "가입 성공\n이용하시려면 로그인 해주세요");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null){//존재한다면 닫자
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
}









