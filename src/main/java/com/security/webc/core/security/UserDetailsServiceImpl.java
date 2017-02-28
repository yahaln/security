package com.security.webc.core.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.webc.dao.UserRepositoryDao;
import com.security.webc.dao.V_UserGroupRolePmDao;
import com.security.webc.dao.V_UserRolePmDao;
import com.security.webc.entity.UserEntity;
import com.security.webc.entity.V_UserGroupRolePm;
import com.security.webc.entity.V_UserRolePm;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ClassName: CustomUserDetailsService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年2月21日 下午7:08:15 <br/>
 *
 * @author yanghualin
 * @version
 * @since
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService { // 自定义UserDetailsService
	@Autowired
	private UserRepositoryDao userRepositoryDao;
	@Autowired
	private V_UserRolePmDao v_UserRolePmDao;
	@Autowired
	private V_UserGroupRolePmDao v_UserGroupRolePmDao;

	@Override
	public UserDetails loadUserByUsername(String username) {
		UserEntity user = getUserByAccount(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		List<String> pms = getPmsByAccount(user.getAccount());
		// 根据账号获取用户角色
		// List<UserRole> Roles =
		// userRoleRepositoryDao.findByUserid(user.getUserid());
		// 定义权限集合
		List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<SimpleGrantedAuthority>();
		for (String pm : pms) {
			grantedAuthorities.add(new SimpleGrantedAuthority(pm));
		}
		// 加密密码
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(16);
		User userdetail = new User(user.getUsername(), bCryptPasswordEncoder.encode(user.getPassword()), true, true,
				true, true, grantedAuthorities);
		return userdetail;
	}

	public List<String> getPmsByAccount(String account) {
		List<String> all = new ArrayList<String>();
		// 此處應該改為服務器獲取用戶然後去匹配用戶的權限id
		// 暫時先用數據庫中獲取的方式
		List<V_UserGroupRolePm> list1 = v_UserGroupRolePmDao.findByAccount(account);
		List<V_UserRolePm> list2 = v_UserRolePmDao.findByAccount(account);
		for (V_UserGroupRolePm e : list1) {
			all.add(e.getPermissionid());
		}
		for (V_UserRolePm e : list2) {
			if (!all.contains(e.getPermissionid())) {
				all.add(e.getPermissionid());
			}
		}
		return all;
	}

	public UserEntity getUserByAccount(String account) {
		return userRepositoryDao.findByAccount(account);
	}
}
