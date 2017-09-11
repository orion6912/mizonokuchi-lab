package com.example.demo.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public String index(@ModelAttribute LoginForm form) {
		return "login/login";
	}
}
