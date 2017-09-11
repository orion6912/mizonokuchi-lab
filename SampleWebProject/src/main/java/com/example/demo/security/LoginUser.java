package com.example.demo.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.example.demo.dbflute.exentity.TUsers;

/**
 * 認証ユーザーの情報を格納するクラス
 */
public class LoginUser extends User {

	private static final long serialVersionUID = 1L;

	private final TUsers loginUser;

	public LoginUser(TUsers user) {
		super(user.getUserId(), user.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
		this.loginUser = user;
	}

	public TUsers getUser() {
		return loginUser;
	}
}