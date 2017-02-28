package com.security.webc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.security.webc.entity.ResourcesEntity;

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
public interface ResourceRepositoryDao extends CrudRepository<ResourcesEntity, String> {
	 public ResourcesEntity findByRsid(String rsid);
	 public ResourcesEntity findByRsurl(String rsurl);
	 public List<ResourcesEntity> findAll();
}