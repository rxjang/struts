package com.bit.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(value="/ex01")
public class Ex04 implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("ex04 doFilter...");
		System.out.println("before filter ex04...");
		chain.doFilter(request, response);
		System.out.println("after filter ex04...");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
