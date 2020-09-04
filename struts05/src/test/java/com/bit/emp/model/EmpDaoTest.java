package com.bit.emp.model;

import java.sql.SQLException;

import org.junit.Test;

import com.bit.emp.model.entity.EmpVo;

import junit.framework.Assert;

public class EmpDaoTest {

	/*
	assertArrayEquals(a,b) : 배열 a와b가 일치함을 확인 
	assertEquals(a,b) : 객체 a와b의 값이 같은지 확인 
	assertSame(a,b) : 객체 a와b가 같은 객체임을 확인 
	assertTrue(a) : a가 참인지 확인 
	assertNotNull(a) : a객체가 null이 아님을 확인 
	 */
	
	@Test
	public void testGetConnection() throws Exception {
		EmpDao dao=new EmpDao();
		Assert.assertNotNull(dao.getConnection());
	}
	
	@Test
	public void testSelectAll() throws SQLException, Exception {
		EmpDao dao=new EmpDao();
//		Assert.assertNotNull(dao.selectAll());
		Assert.assertSame(5, dao.selectAll().size());
//		if(dao.selectAll().size()!=6)Assert.fail();
		
	}

	@Test
	public void testSelectOne() throws Exception {
		EmpDao dao=new EmpDao();
		EmpVo target=new EmpVo(1,"tester1","test1",null,1000);
		Assert.assertEquals(target, dao.selectOne(target.getEmpno()));
	}
}
