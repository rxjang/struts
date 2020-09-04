package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EditAction extends ActionSupport implements Preparable, ModelDriven<DeptVo> {
	DeptVo bean;
	
	public void setBean(DeptVo bean) {
		this.bean = bean;
	}
	
	public DeptVo getBean() {
		return bean;
	}
	
	@Override
	public void prepare() throws Exception {
		bean=new DeptVo();
	}

	@Override
	public DeptVo getModel() {
		return bean;
	}
	
	@Override
	public void validate() {
		if(bean.getDname().isEmpty()) {
			addFieldError("dname", "이름을 반드시 입력해주세요");
		}
		if(bean.getLoc().isEmpty()) {
			addFieldError("loc", "지역명을 반드시 입력해 주세요");
		}
	}
	
	@Override
	public String execute() throws Exception {
		new DeptDao().updateOne(bean);
		return Action.SUCCESS;
	}
}
