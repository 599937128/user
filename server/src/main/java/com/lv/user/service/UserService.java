package com.lv.user.service;

import com.lv.user.dataobject.UserInfo;

/**
 * @program: user
 * @Date: 2019/2/26 21:58
 * @Author: Mr.lv
 * @Description:
 */
public interface UserService {

    /**
     *  通过openid来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
