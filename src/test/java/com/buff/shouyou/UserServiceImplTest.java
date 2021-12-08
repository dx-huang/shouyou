package com.buff.shouyou;

import com.alibaba.fastjson.JSON;
import com.buff.shouyou.common.BaseResp;
import com.buff.shouyou.service.impl.UserServiceImpl;
import com.buff.shouyou.service.req.CreateUserReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: hdx
 * @Date: 2021/12/5 19:02
 * @Description:
 **/
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Test
    public void selectNameByUsername(){
        String name = userServiceImpl.selectNameByUsername("hdx");
        System.out.println("执行结果: " + name);
    }

    @Test
    public void createUser() {
        CreateUserReq req = new CreateUserReq();
        req.setUsername("huangduxuan");
        req.setPassword("123546");
        req.setPhone("13751945684");
        req.setCode("4568");
        BaseResp resp = userServiceImpl.createUser(req);
        System.out.println("执行结果：" + JSON.toJSON(resp));
    }
}
