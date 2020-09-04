package com.bit.dept.model;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.dept.model.entity.DeptVo;
import com.mysql.jdbc.PreparedStatement;

public class DaoTest {
	
	public static void main(String[] args) {
		DeptDao dao=null;
			try {
				dao=new DeptDao();
				System.out.println("coneection:"+dao.conn);
				System.out.println("정상처리");
				for(DeptVo bean:dao.selectAll()) {
					System.out.println(bean);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("exception 발생");
			}
		
	}
	

}
