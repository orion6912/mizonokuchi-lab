package com.example.demo.controller.login;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm {
	@NotEmpty
	private String userId;
	@NotEmpty
	private String password;
}
