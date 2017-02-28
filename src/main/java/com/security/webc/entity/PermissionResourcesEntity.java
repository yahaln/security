package com.security.webc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * ClassName: PermissionResourcesEntity <br/>
 * date: 2017年2月17日 下午4:44:43 <br/>
 * 权限资源表实体类
 * @author yanghualin
 * @version 
 * @since
 */
@Entity
@Table(name="WEBC_PERMISSION_RESOURCES")
public class PermissionResourcesEntity implements Serializable{
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String prid;//主键
	@Column
	private String permissionid;//权限主键
	@Column
	private String rsid;//资源主键
	@Column
	private String editor;//用户id
	@Column
	private Date updatetime;//更新时间
	public String getPrid() {
		return prid;
	}
	public void setPrid(String prid) {
		this.prid = prid;
	}
	public String getPermissionid() {
		return permissionid;
	}
	public void setPermissionid(String permissionid) {
		this.permissionid = permissionid;
	}
	public String getRsid() {
		return rsid;
	}
	public void setRsid(String rsid) {
		this.rsid = rsid;
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
