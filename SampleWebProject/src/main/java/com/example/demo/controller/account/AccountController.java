package com.example.demo.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;

	@GetMapping(value = "/account/registForm")
	public String registForm() {
		return "account/registForm";
	}

	@GetMapping(value = "/account/regist")
	public String regist(@ModelAttribute AccountForm form) {
		accountService.insertAccount(form.getUserId(), form.getPassword());
		return "redirect:hello";
	}
}
