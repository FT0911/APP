package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Dev_user;
import service.dev_user.Dev_userService;

@Controller
@RequestMapping("dev")
public class DevController {
	@Resource
	private Dev_userService dev_userService;

	@RequestMapping("login")
	public String isExist() {
		return "devlogin";
	}

	@RequestMapping("dologin")
	public String doLogin(String devCode, String devPassword,
			HttpSession session, HttpServletRequest request) {
		Dev_user user = dev_userService.getLoginUser(devCode, devPassword);
		if (null != user) {
			session.setAttribute("user", user);
			return "developer/main";
		} else {
			request.setAttribute("error", "用户名或密码不正确");
			return "devlogin";
		}
	}

	@RequestMapping("turn")
	public String list(String currentPageNo) {
		return "developer/appinfolist";
	}
	
	

}
