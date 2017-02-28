package com.security.webc.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.security.webc.entity.PermissionEntity;

@Transactional
public interface PermissionRepositoryDao extends CrudRepository<PermissionEntity, String>{
	public PermissionEntity findByPermissionid(String permissionid);
	public List<PermissionEntity> findAll();
}
