package com.dcits.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AccountInterceptor extends HandlerInterceptorAdapter {
	
	private static List<String> whiteList = Arrays.asList("/welcome", "/login", "/", "/addUser");
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		if(whiteList.contains(uri) || uri.startsWith("/css") || uri.startsWith("/fonts")
				|| uri.startsWith("/img") || uri.startsWith("/js")) {
			return true;
		}else if(request.getSession().getAttribute("user") == null){
			request.getRequestDispatcher("/welcome").forward(request, response);
			return false;
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}
}
