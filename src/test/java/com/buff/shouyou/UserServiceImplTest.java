package com.buff.shouyou;

import com.buff.shouyou.service.impl.UserServiceImpl;
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
}
