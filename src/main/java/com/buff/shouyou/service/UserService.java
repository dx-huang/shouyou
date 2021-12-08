package com.buff.shouyou.service;

import com.buff.shouyou.common.BaseResp;
import com.buff.shouyou.service.req.CheckUsernameReq;
import com.buff.shouyou.service.req.CreateUserReq;

/**
 * @Author: hdx
 * @Date: 2021/12/5 18:50
 * @Description:
 **/
public interface UserService {

    String selectNameByUsername(String username);

    /**
     * 注册用户
     */
    BaseResp createUser(CreateUserReq req);

    /**
     * 校验用户名是否已使用
     */
    BaseResp checkUsername(CheckUsernameReq req);


}
