package com.security.webc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.security.webc.entity.V_RoleRes;

/**
 * 
 *
 * @author yanghualin
 * @version
 * @since
 */
@Transactional
public interface V_RoleResDao extends CrudRepository<V_RoleRes, String> {
}