package com.buff.shouyou.service.impl;

import com.alibaba.fastjson.JSON;
import com.buff.shouyou.common.BaseResp;
import com.buff.shouyou.common.constant.StatusCode;
import com.buff.shouyou.dao.UserDao;
import com.buff.shouyou.service.UserService;
import com.buff.shouyou.service.req.CheckUsernameReq;
import com.buff.shouyou.service.req.CreateUserReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hdx
 * @Date: 2021/12/5 18:50
 * @Description:
 **/
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserDao userDao;

    @Override
    public String selectNameByUsername(String username) {

        return userDao.selectNameByUsername(username);
    }


    @Override
    public BaseResp createUser(CreateUserReq req) {
        logger.info("==== 初始化 CreateUserReq req={}", JSON.toJSONString(req));
        BaseResp resp = new BaseResp();
        try {
            if (!req.isEmpty()) {
                //参数校验
                String userName = req.getUsername().trim();
                if (!userName.matches("^[0-9a-zA-Z]+$")) {
                    resp.setCode(StatusCode.FAIL);
                    resp.setMessage("账号名称只能由数字和字母组成");
                    return resp;
                }
                if (userName.length() < 6 || userName.length() > 20) {
                    resp.setCode(StatusCode.FAIL);
                    resp.setMessage("账号名称必须为6-20位");
                    return resp;
                }
                if (userDao.getUserByUserName(userName) != null) {
                    resp.setMessage("该账号名称已经存在,请重新换个账号名称进行注册");
                    resp.setCode(StatusCode.FAIL);
                    return resp;
                }
                String phone = req.getPhone().trim();
                if (!phone.matches("^[1-9][0-9]{10}$")) {
                    resp.setCode(StatusCode.FAIL);
                    resp.setMessage("手机号码格式不正确");
                    return resp;
                }
//                String existsCode = this.cacheGet(phone);
//                if (existsCode == null) {
//                    resp.setCode(StatusCode.FAIL);
//                    resp.setMessage("验证码已经过期,请重新获取验证码");
//                    return resp;
//                }
//                if (!existsCode.equals(req.getCode().trim())) {
//                    resp.setCode(StatusCode.FAIL);
//                    resp.setMessage("验证码不正确");
//                    return resp;
//                }







                resp.setMessage("注册成功");
            }else {
                resp.setCode(StatusCode.FAIL);
                resp.setMessage(req.get_errMsg());
            }
        }catch (Exception e) {
            resp.setCode(StatusCode.FAIL);
            resp.setMessage("注册用户异常");
            logger.error("==== 注册用户异常 CreateUserReq ={}", e);
        }
        return resp;
    }


    @Override
    public BaseResp checkUsername(CheckUsernameReq req) {
        logger.info("==== 初始化 checkUsername req={}", JSON.toJSONString(req));
        BaseResp resp = new BaseResp();
        try {
            if (!req.isEmpty()) {







                resp.setMessage("注册成功");
            }else {
                resp.setCode(StatusCode.FAIL);
                resp.setMessage(req.get_errMsg());
            }
        }catch (Exception e) {
            resp.setCode(StatusCode.FAIL);
            resp.setMessage("校验用户名是否已使用异常");
            logger.error("==== 校验用户名是否已使用异常 checkUsername ={}", e);
        }

        return resp;
    }
}
