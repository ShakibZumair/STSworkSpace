package com.example.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyLoginInterceptor implements HandlerInterceptor {
private static final Logger logger=Logger.getLogger(MyLoginInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
String queryString =request.getQueryString()==null?"":"?"+request.getQueryString();
String requestUrl=request.getRequestURL()+queryString;
long endTime=System.currentTimeMillis();
long startTime=(long) request.getAttribute("startTime");
String s=String.format("the request %s took mills to process %s", requestUrl,(endTime-startTime));
//System.out.println(s);
logger.info(s);
	}

}
