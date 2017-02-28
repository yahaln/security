package com.security.webc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * ClassName: Resources <br/>
 * date: 2017年2月17日 下午4:10:50 <br/>
 * 资源实体类
 * @author yanghualin
 * @version 
 * @since
 */
@Entity
@Table(name="WEBC_RESOURCES")
public class ResourcesEntity implements Serializable{
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String rsid;//资源主键
	@Column
	private String rsname;//资源名称
	@Column
	private String rsurl;//资源路径
	@Column
	private String description;//描述
	@Column
	private String editor;//编辑者
	@Column
	private Date updatetime;//更新时间
	public String getRsid() {
		return rsid;
	}
	public void setRsid(String rsid) {
		this.rsid = rsid;
	}
	public String getRsname() {
		return rsname;
	}
	public void setRsname(String rsname) {
		this.rsname = rsname;
	}
	public String getRsurl() {
		return rsurl;
	}
	public void setRsurl(String rsurl) {
		this.rsurl = rsurl;
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
