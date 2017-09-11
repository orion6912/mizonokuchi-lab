package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.dbflute.exbhv.TUsersBhv;
import com.example.demo.dbflute.exentity.TUsers;
import com.example.demo.security.LoginUser;

@Component
public class LoginUserService implements UserDetailsService {
	@Autowired
	public TUsersBhv tUsersBhv;

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		// sqlを外読み用
		// UserDataPmb pmb = new UserDataPmb();
		// List<UserData> memberList
		// = tUsersBhv.outsideSql().selectList(pmb);
		try {
			TUsers user = tUsersBhv.selectEntityWithDeletedCheck(cb -> {
				cb.query().setUserId_Equal(userId);
				cb.query().setIsActive_Equal(true);
			});
			if (user == null) {
				throw new UsernameNotFoundException("User not found for login id: " + userId);
			}
			return new LoginUser(user);
		} catch (Exception e) {
			throw new UsernameNotFoundException("It can not be acquired User");
		}
	}
}