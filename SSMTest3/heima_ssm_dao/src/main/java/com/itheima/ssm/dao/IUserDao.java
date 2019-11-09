package com.itheima.ssm.dao;


import com.itheima.ssm.domain.User;

public interface IUserDao {
    public User findByUsernameAndPassword();
}
