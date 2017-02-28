package com.security.webc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * 角色实体类
 * @author yanghualin
 * @version 
 * @since
 */
@Entity
@Table(name="WEBC_ROLE")
public class RoleEntity implements Serializable{
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String roleid;//角色主键
	@Column
	private String rolename;//角色名
	@Column
	private Date createtime;//创建时间
	@Column
	private String editor;//编辑者
	@Column
	private Date updatetime;//更新时间
	@Column
	private int enabled;//是否可用
	@Column
	private String description;//描述
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
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
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
