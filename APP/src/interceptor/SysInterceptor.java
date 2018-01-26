package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import pojo.Dev_user;

public class SysInterceptor extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler){
		HttpSession session=request.getSession();
		Dev_user user=(Dev_user)session.getAttribute("user");
		if (null==user) {
			return false;
		}
		return true;
	}
}
