package com.security.webc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * 用户实体类
 * @author yanghualin
 * @version 
 * @since
 */
@Entity
@Table(name="WEBC_USER")
public class UserEntity   implements Serializable{
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String userid;//用户主键
	@Column
	private String username;//用户名
	@Column
	private String idno;//身份证号
	@Column
	private String mail;//邮件
	@Column
	private String account;//账号
	@Column
	private String password;//密码
	@Column
	private String nname;//昵称
	@Column
	private String image;//图片的base64字符串
	@Column
	private String phone;//手机号
	@Column
	private String address;//工作地址
	@Column
	private Date createtime;//注册时间
	@Column
	private int flag;//审核标记
	@Column
	private Date logintime;//登录时间
	@Column
	private Date LASTLOGINTIME;//上次登录时间
	@Column
	private int logincount;//登录次数
	
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
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public Date getLogintime() {
		return logintime;
	}
	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}
	public Date getLASTLOGINTIME() {
		return LASTLOGINTIME;
	}
	public void setLASTLOGINTIME(Date lASTLOGINTIME) {
		LASTLOGINTIME = lASTLOGINTIME;
	}
	public int getLogincount() {
		return logincount;
	}
	public void setLogincount(int logincount) {
		this.logincount = logincount;
	}
	public UserEntity(){
		
	}
	
	public UserEntity(UserEntity user){
		this.account=user.account;
		this.password=user.password;
		this.mail=user.mail;
		this.userid=user.userid;
	}
}
