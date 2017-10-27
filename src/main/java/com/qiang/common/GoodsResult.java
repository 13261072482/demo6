package com.qiang.common;
/**
 * Created by maxrocky on 2017/10/25.
 */

import lombok.Data;

/**
 * @author maxrocky
 * @data 2017 guoyingqiang 25 19:05
 */
@Data
public class GoodsResult {
    /**
     * 状态值
     * state=1:成功
     */
    protected String state;
     /**
     * 成功的返回
     * @param data 数据
     * @return 正常返回体
     */
    public static GoodsResult success(Object data) {
        return new SuccessApiResult(data);
    }

    /**
     * 错误返回
     * @param errorCode 错误码
     * @param errorMessage 错误信息
     * @return 错误返回体
     */
    public static GoodsResult error(String errorCode, String errorMessage) {
        return new ErrorApiResult(errorCode, errorMessage);
    }
}
