package com.bit.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex03 implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Ex03 doFilter...");
		System.out.println("before filter ex03...");
		chain.doFilter(request, response);	//항상 마지막에 들어가야함
		System.out.println("after filter ex03...");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Ex03 init...");
	}

}
