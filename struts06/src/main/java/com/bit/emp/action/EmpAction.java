package com.bit.emp.action;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.ModelDriven;

public class EmpAction implements ModelDriven<EmpVo>{
	EmpVo bean=new EmpVo();;
	static List<EmpVo> list;
	
	public void setBean(EmpVo bean) {
		this.bean = bean;
	}
	public void setList(List<EmpVo> list) {
		this.list = list;
	}
	public EmpVo getBean() {
		return bean;
	}
	
	public List<EmpVo> getList() {
		return list;
	}
	
	public String addList() throws SQLException {
		new EmpDao().insertOne(bean);
		return "success";
	}
	
	public String empList() throws SQLException {
		list=new EmpDao().selectAll();
		return "success";
	}
	
	@Override
	public EmpVo getModel() {
		return bean;
	}
	
	public String empOne() throws SQLException {
		bean=new EmpDao().selectOne(bean.getEmpno());
		return "success";
	}
	
	public String editOne() throws SQLException{
		int result=new EmpDao().updateOne(bean);
		return "success";
	}
	
	public String delete() throws SQLException{
		new EmpDao().deleteOne(bean.getEmpno());
		return "success";
	}
}
