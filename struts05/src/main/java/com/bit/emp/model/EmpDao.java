package com.bit.emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.emp.model.entity.EmpVo;

public class EmpDao {
	public EmpDao() {
	}
	
	public Connection getConnection() throws Exception {
		String url="jdbc:mysql://localhost:3306/xe?&useSSL=false";
		String user="scott";
		String password="tiger";
		Connection conn=null;
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public List<EmpVo> selectAll() throws SQLException, Exception{
		String sql="select * from emp order by empno";
		List<EmpVo> list=new ArrayList<>();
		
		try(Connection conn=getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				){
			while(rs.next())
				list.add(new EmpVo(rs.getInt("empno"),rs.getString("name"),rs.getString("sub"),rs.getDate("nalja"),rs.getInt("pay")
						));
		}
		
		return list;
	}
	
	public EmpVo selectOne(int empno) throws Exception {
		String sql="select * from emp where empno=?";
		try(
			Connection conn=getConnection();
			PreparedStatement pstmt=conn.prepareStatement(sql);
		){
			pstmt.setInt(1, empno);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())return new EmpVo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getInt(5));
		}
		
		return null;
	}
	
}
