package com.security.webc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * ClassName: RoleGroupEntity <br/>
 * date: 2017年2月17日 下午4:51:18 <br/>
 * 角色组表实体类
 * @author yanghualin
 * @version 
 * @since
 */
@Entity
@Table(name="WEBC_ROLE_GROUP")
public class RoleGroupEntity implements Serializable{
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String gpid;//主键
	@Column
	private String groupid;//组主键
	@Column
	private String roleid;//角色主键
	@Column
	private String editor;//编辑者
	@Column
	private Date updatetime;//更新时间
	public String getGpid() {
		return gpid;
	}
	public void setGpid(String gpid) {
		this.gpid = gpid;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
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
