package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.opensymphony.xwork2.Action;

public class DeptDeleteAction implements Action{
	private int deptno;
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	@Override
	public String execute() throws Exception {
		DeptDao dao=new DeptDao();
		dao.deleteOne(deptno);
		return Action.SUCCESS;
	}

}
