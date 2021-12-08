package com.buff.shouyou.service.req;

import com.buff.shouyou.common.BaseReq;
import com.buff.shouyou.common.annotation.ParamNotEmpty;
import lombok.Data;

/**
 * @Author:hdx
 * @Date:2021/12/8 11:19
 * @Description:
 */
@Data
public class CheckUsernameReq extends BaseReq {

    @ParamNotEmpty("用户名不能为空")
    private String username;

}
