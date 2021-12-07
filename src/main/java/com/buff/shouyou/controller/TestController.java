package com.buff.shouyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: hdx
 * @Date: 2021/12/5 15:10
 * @Description:
 **/
@Controller
public class TestController {

    @GetMapping("/")
    @ResponseBody
    public String test(){
        return "success！！！";
    }

}
