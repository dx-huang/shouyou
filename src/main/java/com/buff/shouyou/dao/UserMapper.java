package com.buff.shouyou.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: hdx
 * @Date: 2021/12/5 18:57
 * @Description:
 **/
@Mapper
public interface UserMapper {

    String selectNameByUsername(@Param("username") String username);
}
