package com.security.webc.core.security.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.security.webc.entity.UserEntity;

/**
 * @author
 * @version 1.0 2016/10/11
 * @description
 */
public interface UserService extends UserDetailsService {

    /**
     * 根据用户名获取用户
     * @param userName
     * @return
     */
    public List<UserEntity> getUserByName(String userName);
}
