package com.buff.shouyou.controller;

import com.buff.shouyou.common.BaseResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

/**
 * @Author: hdx
 * @Date: 2021/12/5 12:05
 * @Description:
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/login")
    @ResponseBody
    public BaseResp userLogin(String username,String password) {
        logger.info("登录消息:" + username + "--" + password);
        BaseResp resp = new BaseResp();
        if (Objects.equals(username,"xiaoming")) {
           if (Objects.equals(password,"123456")) {
                resp.setCode(0);
                resp.setMessage("登录成功");
                return resp;
            }
        }
        resp.setCode(1);
        resp.setMessage("登录失败");
        return resp;
    }

}
