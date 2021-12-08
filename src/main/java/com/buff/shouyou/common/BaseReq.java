package com.buff.shouyou.common;

import com.buff.shouyou.common.annotation.ParamNotEmpty;
import com.buff.shouyou.utils.StringUtil;
import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * @Author:hdx
 * @Date:2021/12/8 10:34
 * @Description:
 */
@Data
public class BaseReq implements Serializable {
    private Integer userId ; //用户id
    private String token; //token
    private String _errMsg ; //参数异常信息


    private boolean checkField(Field[] fields){
        for (Field f:fields){
            f.setAccessible(true);
            ParamNotEmpty ParamNotEmpty = f.getAnnotation(ParamNotEmpty.class);
            try {
                if (ParamNotEmpty!=null) {
                    if (f.getType() == String.class){
                        String value = (String) f.get(this);
                        if (StringUtil.isEmpty(value)){
                            this._errMsg=ParamNotEmpty.value();
                            return true;
                        }
                    }
                    if (f.getType() == Integer.class){
                        Integer value = (Integer)f.get(this);
                        if (value==null){
                            this._errMsg=ParamNotEmpty.value();
                            return true;
                        }
                    }
                    if (f.getType() == Long.class){
                        Long value = (Long) f.get(this);
                        if (value==null){
                            this._errMsg=ParamNotEmpty.value();
                            return true;
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


    public boolean isEmpty(){

        Field[] fields = this.getClass().getDeclaredFields();
        Field[] parentFields = this.getClass().getSuperclass().getDeclaredFields();
        return this.checkField(parentFields)||this.checkField(fields);
    }

}
