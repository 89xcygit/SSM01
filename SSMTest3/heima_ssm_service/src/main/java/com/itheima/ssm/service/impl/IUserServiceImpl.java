package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.IUserDao;
import com.itheima.ssm.domain.User;
import com.itheima.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public User findByUsernaameAndPassword() {
        User user = userDao.findByUsernameAndPassword();
        return user;
    }
}
