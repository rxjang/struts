package com.bit.emp.action;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class OneAction implements Action,ModelDriven<EmpVo>{
	String title="detail";
	
	EmpVo bean=new EmpVo();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public EmpVo getBean() {
		return bean;
	}
	public void setBean(EmpVo bean) {
		this.bean = bean;
	}
	
	@Override
	public String execute() throws Exception {
		bean=new EmpDao().selectOne(bean.getEmpno());
		return Action.SUCCESS;
	}
	@Override
	public EmpVo getModel() {
		// TODO Auto-generated method stub
		return bean;
	}

}
