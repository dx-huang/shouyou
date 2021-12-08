package com.buff.shouyou.service.req;

import com.buff.shouyou.common.BaseReq;
import com.buff.shouyou.common.annotation.ParamNotEmpty;
import lombok.Data;

/**
 * @Author:hdx
 * @Date:2021/12/8 10:33
 * @Description:
 */
@Data
public class CreateUserReq extends BaseReq {

    @ParamNotEmpty("账号不能为空")
    private String username; //账号

    @ParamNotEmpty("密码不能为空")
    private String password; //密码

    @ParamNotEmpty("手机号码不能为空")
    private String phone; //手机号码

    @ParamNotEmpty("验证码不能为空")
    private String code; //验证码

}
