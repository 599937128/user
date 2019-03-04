package com.lv.user.repository;

import com.lv.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: user
 * @Date: 2019/2/26 21:56
 * @Author: Mr.lv
 * @Description:
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    UserInfo findByOpenid(String openid);
}
