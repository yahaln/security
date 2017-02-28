package com.security.webc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.security.webc.entity.UserEntity;

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
public interface UserRepositoryDao extends CrudRepository<UserEntity, String> {
	 public UserEntity findByAccount(String account);
	 public List<UserEntity> findAll();
}