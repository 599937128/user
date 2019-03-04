package com.lv.user.enums;

import lombok.Getter;

/**
 * @program: user
 * @Date: 2019/2/26 22:24
 * @Author: Mr.Deng
 * @Description:
 */
@Getter
public enum RoleEnum {
    BUYER(1,"买家"),
    SELLER(2,"卖家"),
    ;
    private Integer code;

    private String message;

    RoleEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
