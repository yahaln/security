package com.security.webc.common;
/**
 * 
 * date: 2017年2月21日 下午1:48:24
 * 
 * @author yanghualin
 * @version 
 * @since
 */
public class ResultConstans {
	
	public final static String ACCESS_TOCKEN="accesstocken";
	
	public final static int CODE_SUCCESS = 0;
	public final static int CODE_FAILUER = -1;
	public final static int CODE_NOT_LOGIN = -2;
	public final static int CODE_EXCEPTION = -3;
	public final static int CODE_ACCESS_DENY = -4;
	public final static int CODE_ACCESS_PERMISSION_DENIED = -5;
	
	public final static String MSG_SUCCESS = "操作成功啦！";
	public final static String MSG_FAILURE = "操作失败，请重试！";
	public final static String MSG_NO_LOGIN = "您还没有登录哦！";
	public final static String MSG_PERMISSION_DENIED = "您没有权限哦！";
	public final static String MSG_SYSERROR = "系统的内心是错误的！";
	public final static String MSG_NETWORK_ERROR = "网络开小差啦！";
	public final static String MSG_DATABASE_ERROR = "读取数据库错误啦！";
}
