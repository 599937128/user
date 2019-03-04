package com.lv.user.VO;

import lombok.Data;

/**
 * @program: product
 * @Date: 2019/1/24 14:34
 * @Author: Mr.lv
 * @Description: http请求返回的最外层的对象
 */
@Data
public class ResultVO<T>  {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体的内容
     */
    private T data;
}
