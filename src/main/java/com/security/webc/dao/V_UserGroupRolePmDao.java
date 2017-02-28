package com.security.webc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.security.webc.entity.V_UserGroupRolePm;
import java.lang.String;
import java.util.List;
@Transactional
public interface V_UserGroupRolePmDao extends CrudRepository<V_UserGroupRolePm,String>{
	public List<V_UserGroupRolePm> findByAccount(String account);
	public List<V_UserGroupRolePm> findAll();
	
}
