package com.qiang.common;

import lombok.Data;

/**
 * @author    kingboy--KingBoyWorld@163.com
 * @date    2017/7/21 上午11:28
 * @desc    正确返回体
 */
@Data
public class SuccessApiResult extends ApiResult {

    private Object data;

    SuccessApiResult(Object data) {
        this.state = "1";
        this.data = data;
    }

}
