package com.security.webc.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.webc.entity.UserRoleEntity;

@Repository
public interface UserRoleRepositoryDao extends JpaRepository<UserRoleEntity, String>{
	@Modifying
	@Query("from UserRoleEntity where userid= :userid")
	public List<UserRoleEntity> findRoleByUserId(String userid);
}
