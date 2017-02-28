package com.security.webc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * ClassName: OperateLogEntity <br/>
 * date: 2017年2月17日 下午4:40:48 <br/>
 * 操作日志表实体类
 * @author yanghualin
 * @version 
 * @since
 */
@Entity
@Table(name="WEBC_OPERATE_LOG")
public class OperateLogEntity implements Serializable{
	/**
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String log_id;//日志主键
	@Column
	private String op_type;//操作类型
	@Column
	private String content;//操作内容
	@Column
	private String tu_id;//操作用户
	@Column
	private Date op_time;//操作时间
	public String getLog_id() {
		return log_id;
	}
	public void setLog_id(String log_id) {
		this.log_id = log_id;
	}
	public String getOp_type() {
		return op_type;
	}
	public void setOp_type(String op_type) {
		this.op_type = op_type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTu_id() {
		return tu_id;
	}
	public void setTu_id(String tu_id) {
		this.tu_id = tu_id;
	}
	public Date getOp_time() {
		return op_time;
	}
	public void setOp_time(Date op_time) {
		this.op_time = op_time;
	}
	
}
