package com.bit.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex02 implements Filter{
	String encoding;

	   @Override
	   public void destroy() {
	      System.out.println("Filter destroy…");
	   }

	   @Override
	   public void doFilter(ServletRequest request, ServletResponse response,
	         FilterChain chain) throws IOException, ServletException {
	      System.out.println("Filter doFilter…");
	      HttpServletResponse resp = (HttpServletResponse)response;
	      HttpServletRequest req = (HttpServletRequest)request;
//	      ServletRequest resp = (HttpServletResponse)response;
	      req.getParameter("encoding");
//	      PrintWriter out = response.getWriter();
//	      out.print("abcdefg… id=  "+req.getParameter("id")+" : "+req.getMethod());
//	      out.print("encoding : "+encoding);
//	      out.flush();
	      System.out.println("before filter ex02...");
	      chain.doFilter(request, response);	//매 필터마다 dofilter해야함
	      System.out.println("after filter ex02...");
	      
	   }

	   @Override
	   public void init(FilterConfig Config) throws ServletException {
	      System.out.println("Filter init…" + Config.toString());
	      encoding = Config.getInitParameter("encoding"); 
	      
	   }

	}
