package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.dbflute.exentity.TUsers;

public class LoginUser implements UserDetails {

	private static final long serialVersionUID = 1L;

	private final TUsers loginUser;

	private Set<Authority> authorities = EnumSet.of(Authority.ROLE_USER);;

	public LoginUser(TUsers user) {
		this.loginUser = user;
	}

	public TUsers getUser() {
		return loginUser;
	}

	public enum Authority {
		ROLE_USER, ROLE_ADMIN
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (Authority authority : this.authorities) {
			authorities.add(new SimpleGrantedAuthority(authority.toString()));
		}
		return authorities;
	}

	@Override
	public String getPassword() {
		return this.loginUser.getPassword();
	}

	@Override
	public String getUsername() {
		return this.loginUser.getUserId();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.loginUser.getIsActive();
	}
}