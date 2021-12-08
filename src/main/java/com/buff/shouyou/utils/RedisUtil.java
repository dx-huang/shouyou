package com.buff.shouyou.utils;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

/**
 * @Author:hdx
 * @Date:2021/12/8 11:49
 * @Description:
 */
public abstract class RedisUtil {
//    @Autowired
//    private RedisTemplate<String, String> redisTemplate;
//
//
//
//    /**
//     * Modle加Key 值 Object 自定义过期时间
//     * @param key
//     * @param value
//     * @param expire
//     */
//    protected void cacheSet(String key, Object value, int expire){
//        redisTemplate.opsForValue().set(key, JSON.toJSONString(value));
//        redisTemplate.expire(key,expire, TimeUnit.SECONDS);
//    }
//
//    /**
//     * Get Key值String
//     */
//    protected String cacheGet(String key){
//        return redisTemplate.opsForValue().get(key);
//    }


}
