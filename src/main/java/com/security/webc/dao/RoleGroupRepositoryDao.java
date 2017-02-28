package com.security.webc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.webc.entity.RoleGroupEntity;

@Repository
public interface RoleGroupRepositoryDao extends JpaRepository<RoleGroupEntity, String>{
	@Modifying
	@Query("from RoleGroupEntity where roleid= :roleid")
	public List<RoleGroupEntity> findRoleByRoleId(String roleid);
}
