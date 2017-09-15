package com.example.demo.controller;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupForm {

	@Pattern(regexp = "^\\w{3,32}$", message = "size must be between 3 and 32, each character must be alphanumeric or underscore (A-Za-z0-9_)")
	private String username;

	@Size(min = 8, max = 255)
	private String password;
}