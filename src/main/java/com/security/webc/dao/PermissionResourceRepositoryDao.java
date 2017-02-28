package com.security.webc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.security.webc.entity.PermissionResourcesEntity;

@Transactional
public interface PermissionResourceRepositoryDao extends CrudRepository<PermissionResourcesEntity, String>{
	public PermissionResourcesEntity findByPermissionid(String permissionid);
	public PermissionResourcesEntity findByRsid(String rsid);
	public List<PermissionResourcesEntity> findAll();
}
