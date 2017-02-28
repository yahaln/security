package com.security.webc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * 组实体类
 * @author yanghualin
 * @version 
 * @since
 */
@Entity
@Table(name="v_user_role_pm_res")
public class V_UserRolePm implements Serializable{
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String userid;//主键
	@Column
	private String account;//
	@Column
	private String username;//
	@Column
	private String roleid;
	@Column
	private String permissionid;
	@Column
	private String rsurl;
	@Column
	private String rolename;
	
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
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getPermissionid() {
		return permissionid;
	}
	public void setPermissionid(String permissionid) {
		this.permissionid = permissionid;
	}
	public String getRsurl() {
		return rsurl;
	}
	public void setRsurl(String rsurl) {
		this.rsurl = rsurl;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
}
