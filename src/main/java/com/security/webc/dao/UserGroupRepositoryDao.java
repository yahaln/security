package com.security.webc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.webc.entity.UserGroupEntity;

@Repository
public interface UserGroupRepositoryDao extends JpaRepository<UserGroupEntity, String>{
	@Modifying
	@Query("from UserGroupEntity where userid= :userid")
	public List<UserGroupEntity> findByUserId(String userid);
}
