package com.security.webc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.webc.entity.GroupPermissionEntity;

@Repository
public interface GroupPermissionRepositoryDao extends JpaRepository<GroupPermissionEntity, String>{
	@Modifying
	@Query("from GroupPermissionEntity where groupid= :groupid")
	public List<GroupPermissionEntity> findPermissionByGroupId(String groupid);
}
