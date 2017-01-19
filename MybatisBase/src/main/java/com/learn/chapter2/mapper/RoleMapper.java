package com.learn.chapter2.mapper;

import com.learn.chapter2.po.Role;

import java.util.List;

/**
 * Created by bright on 17-1-16.
 */
public interface RoleMapper {
    public Role getRole(Long id);

    public List<Role> findRole(String roleName);

    public int deleteRole(Long id);

    public int insertRole(Role role);

    public int updateRole(Role role);
}
