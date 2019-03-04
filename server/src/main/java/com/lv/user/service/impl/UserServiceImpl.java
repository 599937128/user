package com.lv.user.service.impl;

import com.lv.user.dataobject.UserInfo;
import com.lv.user.repository.UserInfoRepository;
import com.lv.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: user
 * @Date: 2019/2/26 22:01
 * @Author: Mr.lv
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * 通过openid来查询用户信息
     *
     * @param openid
     * @return
     */
    @Autowired
    private UserInfoRepository repository;

    @Override
    public UserInfo findByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
