package org.normal.framework.common.security;

import java.util.Collection;
import java.util.List;

import org.normal.framework.etm.member.user.domain.MemberUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SpringSecurityUserDetails extends MemberUser implements UserDetails{

	private static final long serialVersionUID = 2545548904581565888L;

    private List<CustomGrantedAuthority> customGrantedAuthorityList;
	private String token;//用户会话token
	private Long loginTime;//登陆时间戳
	private Long expireTime;//过期时间戳
	/**
	 * 获取用户权限
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return customGrantedAuthorityList;
	}

	@Override
	public String getPassword() {
		return this.getMemberUserLoginPassword();
	}

	@Override
	public String getUsername() {
		return this.getMemberUserLoginAccount();
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
		return true;
	}



	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Long loginTime) {
		this.loginTime = loginTime;
	}

	public Long getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

    public List<CustomGrantedAuthority> getCustomGrantedAuthorityList() {
        return customGrantedAuthorityList;
    }

    public void setCustomGrantedAuthorityList(List<CustomGrantedAuthority> customGrantedAuthorityList) {
        this.customGrantedAuthorityList = customGrantedAuthorityList;
    }
}