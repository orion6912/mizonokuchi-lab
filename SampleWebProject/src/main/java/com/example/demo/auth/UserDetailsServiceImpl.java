package com.example.demo.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.dbflute.exbhv.TUsersBhv;
import com.example.demo.dbflute.exentity.TUsers;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	public TUsersBhv tUsersBhv;

	/*
	 * (非 Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

		// 認証を行うユーザー情報を格納する
		TUsers user = null;
		try {
			// 入力したユーザーIDから認証を行うユーザー情報を取得する
			user = tUsersBhv.selectEntityWithDeletedCheck(cb -> {
				cb.query().setUserId_Equal(userId);
			});

		} catch (Exception e) {
			// 取得時にExceptionが発生した場合
			throw new UsernameNotFoundException("It can not be acquired User");
		}

		// ユーザー情報を取得できなかった場合
		if (user == null) {
			throw new UsernameNotFoundException("User not found for login id: " + userId);
		}

		// ユーザー情報が取得できたらSpring Securityで認証できる形で戻す
		return new LoginUser(user);
	}

}