package com.security.webc.core.security;

import org.springframework.security.core.GrantedAuthority;
/**
 * 
 * ClassName: CustomGrantedAuthority <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年2月21日 下午7:07:48 <br/>
 *
 * @author yanghualin
 * @version 
 * @since
 */
public class GrantedAuthorityImpl implements GrantedAuthority {
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	private String method;
	private String role;
	private String permissionid;
	private String url;
	
	
    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPermissionid() {
		return permissionid;
	}

	public void setPermissionid(String permissionid) {
		this.permissionid = permissionid;
	}

	public GrantedAuthorityImpl(String permissionid) {
        this.permissionid = permissionid;
    }

    @Override
    public String getAuthority() {
        return this.role;
    }

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}