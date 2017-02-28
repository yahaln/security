package com.security.webc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.webc.entity.PermissionEntity;
import com.security.webc.entity.UserPermissionEntity;

@Repository
public interface UserPermissionRepositoryDao extends JpaRepository<UserPermissionEntity, String>{
	@Modifying
	@Query("from UserPermissionEntity where userid= :userid")
	public List<PermissionEntity> findPermissionById(String userid);
}
