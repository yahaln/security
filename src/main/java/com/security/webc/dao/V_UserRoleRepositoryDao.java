package com.security.webc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.security.webc.entity.V_UserRole;

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
public interface V_UserRoleRepositoryDao extends JpaRepository<V_UserRole,String> {
//	@Query(value="select u from UserRole u where u.userid =:userid")
//	public List<UserRole> findByUserid(@Param("userid") String userid);
	
	@Query(value="select u.role from V_UserRole u where u.userid =:userid")
	public List<String> findRoleByUserid(@Param("userid") String userid);
}