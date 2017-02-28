package com.security.webc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="v_res_pm")
public class V_ResPermission implements Serializable{
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String permissionid;
	@Column
	private String rsurl;
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

	
}
