package com.security.webc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * ClassName: UserRoleEntity <br/>
 * date: 2017年2月17日 下午5:03:42 <br/>
 * 用户角色表实体类
 * @author yanghualin
 * @version 
 * @since
 */
@Entity
@Table(name="WEBC_USER_ROLE")
public class UserRoleEntity implements Serializable{
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String urid;//主键
	@Column
	private String userid;//用户主键
	@Column
	private String roleid;//角色主键
	@Column
	private String region;//行政区划代码
	@Column
	private String enable;//是否可用
	@Column
	private String editor;//编辑者
	@Column
	private Date updatetime;//更新时间
	public String getUrid() {
		return urid;
	}
	public void setUrid(String urid) {
		this.urid = urid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
}
