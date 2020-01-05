package io.weeks.webapp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class LoginInterceptor extends HandlerInterceptorAdapter {

	static final Logger logger = LoggerFactory.getLogger(LoggerFactory.class);
    

    //로그인 인터셉터
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    	String url = request.getRequestURL().toString();

        if(url.startsWith("http://2weeks.io")) {
        	url = url.replaceAll("http://", "https://");
        	response.sendRedirect(url);
        }
        
        return true;
    }
}
