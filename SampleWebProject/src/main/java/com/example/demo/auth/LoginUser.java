package com.example.demo.auth;

import org.springframework.security.core.authority.AuthorityUtils;

import com.example.demo.dbflute.exentity.TUsers;

/**
 * 認証ユーザーの情報を格納するクラス
 */
public class LoginUser extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = 1L;
	/**
	 * ログインユーザー
	 */
	private final TUsers loginUser;

	/**
	 * コンストラクタ
	 * 
	 * @param user
	 */
	public LoginUser(TUsers user) {
		// スーパークラスのユーザーID、パスワードに値をセットする
		// 実際の認証はスーパークラスのユーザーID、パスワードで行われる
		super(user.getUserId(), user.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
		this.loginUser = user;
	}

	/**
	 *
	 * @return
	 */
	public TUsers getUser() {
		return loginUser;
	}
}