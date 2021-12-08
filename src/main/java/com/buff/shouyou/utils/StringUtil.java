package com.buff.shouyou.utils;

/**
 * @Author:hdx
 * @Date:2021/12/8 10:48
 * @Description: 提供对字符串的常规处理逻辑
 */
public abstract class StringUtil {


    /**
     * 字符串判空
     */
    public static boolean isEmpty(String str) {
        return (str == null || str.trim().length() == 0);
    }


}
