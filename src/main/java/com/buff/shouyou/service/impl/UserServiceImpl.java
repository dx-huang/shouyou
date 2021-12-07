package com.buff.shouyou.service.impl;

import com.buff.shouyou.dao.UserDao;
import com.buff.shouyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hdx
 * @Date: 2021/12/5 18:50
 * @Description:
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String selectNameByUsername(String username) {

        return userDao.selectNameByUsername(username);
    }
}
