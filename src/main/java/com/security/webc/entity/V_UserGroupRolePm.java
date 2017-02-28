package com.security.webc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="V_USER_GROUP_ROLE_PM")
public class V_UserGroupRolePm implements Serializable{
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String userid;
	@Column
	private String username;
	@Column
	private String account;
	@Column
	private String groupid;
	@Column
	private String permissionid;
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
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getPermissionid() {
		return permissionid;
	}
	public void setPermissionid(String permissionid) {
		this.permissionid = permissionid;
	}
	
}
