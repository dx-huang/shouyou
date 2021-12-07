package com.buff.shouyou.common;

import lombok.Data;

/**
 * @Author: hdx
 * @Date: 2021/12/5 12:07
 * @Description:
 **/
@Data
public class BaseResp {
    private Integer code; //状态码  0:成功 1:失败
    private String message; //状态消息
}
