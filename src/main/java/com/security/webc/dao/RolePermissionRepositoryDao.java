package com.security.webc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.webc.entity.RolePermissionEntity;

@Repository
public interface RolePermissionRepositoryDao extends JpaRepository<RolePermissionEntity, String>{
	@Modifying
	@Query("from RolePermissionEntity where roleid= :roleid")
	public List<RolePermissionEntity> findPermissionByRoleId(String roleid);
}
