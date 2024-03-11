package com.sds.project0311.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 오라클이 내 PC에 설치되어 잇던, 외부에 있던 네트워크로 접속을 시도해야 한다 
 * SQLplus 대신에 자바 프로그램을 접속을 시도하는 것이므로, 접속 과정이 크게 달라지진 않는다
 * 
 * 1) 오라클의 원격지 URL( ip , 도메인 등)
 * 2) 계정 아이디 , 계정 비번  
*/
public class OracleTest {
	public static void main(String[] args) {
		
		//자바에서 오라클을 제어하기 위해서는 오라클용 클래스 집합인 드라이버 jar가 필요하다 
		//jar 란?  Java Archive의 약자로써, .class 파일을 두개이상 모아놓은 압축파일을 말한다.. 
		//오라클 드라이버를 현재 클래스에 환경변수에 등록해야 하지만, 이클립스를 사용할 경우, 
		//이 이클립스내에 등록하면 된다..
		
		//드라이버 로드 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 클래스명 명시
			System.out.println("드라이버 로드 성공");
			
			//오라클에 접속해 보기 
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user="batman";
			String pass="1234";
			
			Connection con=null; //접속이 성공한 이후에 생성되는 객체이므로, 만일 이 객체가  null이라면
			//접속은 실패한 것임
			
			con = DriverManager.getConnection(url, user, pass);
			if(con==null) {
				System.out.println("접속 실패");
			}else {
				System.out.println("접속 성공");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}



