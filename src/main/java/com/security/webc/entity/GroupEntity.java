package com.security.webc.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="WEBC_GROUP")
public class GroupEntity implements Serializable{
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String groupid;//主键
	@Column
	private String groupname;//组名
	@Column
	private String parentgroupid;//父组id
	@Column
	private String description;//描述
	@Column
	private String editor;//编辑者
	@Column
	private Date updatetime;//更新时间
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public String getParentgroupid() {
		return parentgroupid;
	}
	public void setParentgroupid(String parentgroupid) {
		this.parentgroupid = parentgroupid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
