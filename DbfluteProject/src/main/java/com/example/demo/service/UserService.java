package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dbflute.exbhv.TUsersBhv;
import com.example.demo.dbflute.exentity.TUsers;
import com.example.demo.entity.LoginUser;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	public TUsersBhv tUsersBhv;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (username == null || "".equals(username)) {
			throw new UsernameNotFoundException("Username is empty");
		}
		TUsers user = tUsersBhv.selectEntityWithDeletedCheck(cb -> {
			cb.query().setUserId_Equal(username);
			cb.query().setIsActive_Equal(true);
		});
		if (user == null) {
			throw new UsernameNotFoundException("User not found: " + username);
		}
		return new LoginUser(user);
	}

	@Transactional
	public void registerAdmin(String username, String password) {
		TUsers tUsers = new TUsers();
		tUsers.setUserId(username);
		tUsers.setPassword(passwordEncoder.encode(password));
		tUsersBhv.insertOrUpdate(tUsers);
	}

	@Transactional
	public void registerUser(String username, String password) {
		TUsers tUsers = new TUsers();
		tUsers.setUserId(username);
		tUsers.setPassword(passwordEncoder.encode(password));
		tUsersBhv.insertOrUpdate(tUsers);
	}

}