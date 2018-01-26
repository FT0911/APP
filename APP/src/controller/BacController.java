package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("bac")
public class BacController {
	@RequestMapping("login")
	public String doLogin() {
		return "backendlogin";
	}
}
