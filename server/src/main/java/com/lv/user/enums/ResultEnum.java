package com.lv.user.enums;

import lombok.Getter;

/**
 * @program: product
 * @Date: 2019/1/25 14:49
 * @Author: Mr.lv
 * @Description:
 */
@Getter
public enum  ResultEnum {
    LOGIN_FAIL(1, "登录失败"),
    ROLE_ERROR(2, "角色权限错误")
    ;

    private Integer code;

    private String massage;

    ResultEnum(Integer code, String massage) {
        this.code = code;
        this.massage = massage;
    }
}
