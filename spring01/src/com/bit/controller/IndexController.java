package com.bit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.DeptDao;
import com.bit.model.entity.DeptVo;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("IndexController run...");
		ModelAndView mav=new ModelAndView();
		
		List<DeptVo> list = new DeptDao().selectAll();
		mav.addObject("alist", list);
		
		mav.setViewName("index");
		return mav;
	}

}
