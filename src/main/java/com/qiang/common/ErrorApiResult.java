package com.qiang.common;

import lombok.Data;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/7/23 下午7:59
 * @desc  错误返回.
 */
@Data
public class ErrorApiResult extends GoodsResult {

    private String msg;

    ErrorApiResult(String state, String msg) {
        this.state = state;
        this.msg = msg;
    }
}
