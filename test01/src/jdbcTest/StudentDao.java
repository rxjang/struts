package jdbcTest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public StudentDao() throws SQLException {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/xe?&useSSL=false";
		String user="scott";
		String password="tiger";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn=DriverManager.getConnection(url, user, password);
	}

	
	public StudentDto stuSelectOne() throws SQLException {
		StudentDto bean = new StudentDto();
	
		String sql2 = "select start_day, end_day from lectures where num=2223";//강사 강의실
		pstmt = conn.prepareStatement(sql2);
		System.out.println(sql2);
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			bean.setStart_day(rs.getDate("start_day"));//개강일
			bean.setEnd_day(rs.getDate("end_day"));//종강일
		}
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		
		String sql3 = "select * from attendance where num = 6666"; //출석과 날짜받기
		pstmt = conn.prepareStatement(sql3);
		System.out.println(sql3);
		rs = pstmt.executeQuery();
		//날짜 + 출석상태를 저장해야함. 
		ArrayList<String> attList = new ArrayList<String>();
		while(rs.next()) {
			attList.add(rs.getString("state"));
		}
		bean.setAttList(attList);//컨트롤러에서 bean.attRate()메서드로 출석률 얻을 수 있다. 
		
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		
		return bean;
	}//stuselectONE
	
	
}