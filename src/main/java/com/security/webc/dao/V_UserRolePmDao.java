package com.security.webc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.security.webc.entity.V_UserRolePm;

import java.lang.String;
import java.util.List;
@Transactional
public interface V_UserRolePmDao extends CrudRepository<V_UserRolePm,String>{
	public List<V_UserRolePm> findByAccount(String account);
	public List<V_UserRolePm> findAll();
}
