package com.bit.dept.action;

import java.util.ArrayList;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;

public class DeptListAction implements Action{
	ArrayList<DeptVo> alist;
	
	public ArrayList<DeptVo> getAlist(){
		return alist;
	}
	
	@Override
	public String execute() throws Exception {
		DeptDao dao=null;
		dao=new DeptDao();
		alist=dao.selectAll();
		
		return Action.SUCCESS;
	}

}
