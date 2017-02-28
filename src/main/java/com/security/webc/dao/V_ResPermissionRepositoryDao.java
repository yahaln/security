package com.security.webc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.security.webc.entity.V_ResPermission;

/**
 * 
 * ClassName: UserRepository <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年2月21日 下午7:34:11 <br/>
 *
 * @author yanghualin
 * @version
 * @since
 */
@Transactional
public interface V_ResPermissionRepositoryDao extends CrudRepository<V_ResPermission,String> {
	 public V_ResPermission findByRsurl(String rsurl);
	 public List<V_ResPermission> findAll();
}