package com.security.webc.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.security.webc.entity.GroupEntity;

@Transactional
public interface GroupRepositoryDao extends CrudRepository<GroupEntity, String>{
	public GroupEntity findByGroupid(String groupid);
	public List<GroupEntity> findAll();
}
