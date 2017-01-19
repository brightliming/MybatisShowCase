package com.learn.chapter3.mapper;

import com.learn.chapter3.po.User;

/**
 * Created by bright on 17-1-19.
 */
public interface UserMapper {
    public User getUser(Long id);
    public int insertUser(User user);
}
