package com.controller.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;

@WebFilter("/SessionFilter")
public class SessionFilter implements Filter {

    public SessionFilter() {
        
    }
public void init(FilterConfig fConfig) throws ServletException {
	
	}


public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
	
	
	chain.doFilter(request, response);
}


	public void destroy() {
		
	}

	

	
}
