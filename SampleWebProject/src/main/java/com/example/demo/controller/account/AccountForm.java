package com.example.demo.controller.account;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountForm {
	@NotEmpty
	private String userId;
	@NotEmpty
	private String password;
}