package com.example.demo.service;

import org.dbflute.exception.EntityAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.demo.dbflute.exbhv.TUsersBhv;
import com.example.demo.dbflute.exentity.TUsers;

@Component
public class AccountService {
	@Autowired
	public TUsersBhv tUsersBhv;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public Integer insertAccount(String userId, String password) {
		try {
			TUsers tUsers = new TUsers();
			tUsers.setUserId(userId);
			String encodePassword = passwordEncoder.encode(password);
			tUsers.setPassword(encodePassword);
			tUsersBhv.insert(tUsers);
			return tUsers.getId();
		} catch (EntityAlreadyExistsException e) {
			// TODO 重複エラー
			return null;
		} catch (Exception e) {
			// TODO その他エラー
			return null;
		}
	}
}
