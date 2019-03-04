package com.lv.user.utils;

import com.lv.user.VO.ResultVO;
import com.lv.user.enums.ResultEnum;

/**
 * @program: product
 * @Date: 2019/1/24 15:22
 * @Author: Mr.lv
 * @Description:
 */
public class ResultVOUtil {

    /**
     * 返回成功
     * @param object
     * @return
     */
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    /**
     *
     * @return
     */
    public static ResultVO success() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    /**
     * 返回错误
     * @param resultEnum
     * @return
     */
    public static ResultVO error(ResultEnum resultEnum) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(resultEnum.getMassage());
        return resultVO;
    }


}
