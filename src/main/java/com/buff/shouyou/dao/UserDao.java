package com.buff.shouyou.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author: hdx
 * @Date: 2021/12/5 18:56
 * @Description:
 **/
@Repository
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    public String selectNameByUsername(String username) {
        return userMapper.selectNameByUsername(username);
    }
}
