package com.bit.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Ex05 implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("listener init..."+sce.getServletContext().getInitParameter("cmsg"));
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("listener destroy...");
	}

}
