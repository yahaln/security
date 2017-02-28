package com.security.webc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * ClassName: RolePermissionEntity <br/>
 * date: 2017年2月17日 下午4:52:39 <br/>
 * 角色权限表实体类
 * @author yanghualin
 * @version 
 * @since
 */
@Entity
@Table(name="WEBC_ROLE_PERMISSION")
public class RolePermissionEntity implements Serializable{
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String rprid;//主键
	@Column
	private String roleid;//角色主键
	@Column
	private String permissionid;//权限主键
	@Column
	private String editor;//用户id
	@Column
	private String type;//类型
	@Column
	private Date updatetime;//更新时间
	public String getRprid() {
		return rprid;
	}
	public void setRprid(String rprid) {
		this.rprid = rprid;
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
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
}
