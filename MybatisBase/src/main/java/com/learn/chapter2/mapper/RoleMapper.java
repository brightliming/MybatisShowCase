package com.learn.chapter2.mapper;

import com.learn.chapter2.po.Role;

/**
 * Created by bright on 17-1-16.
 */
public interface RoleMapper {
    public Role getRole(Long id);

    public int deleteRole(Long id);

    public int insertRole(Role role);
}
