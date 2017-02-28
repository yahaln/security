package com.security.webc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="V_USER_RESOURCE")
public class V_UserResource implements Serializable{
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String account;
	@Id
	@Column
	private String userid;
	@Column
	private String username;
	@Column
	private String rsurl;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRsurl() {
		return rsurl;
	}
	public void setRsurl(String rsurl) {
		this.rsurl = rsurl;
	}
	
}
