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
    private Integer state;
    /**
     * message:信息,
     */
    private String message;


    public GoodsResult(String data) {
        this.state = 1;

        this.message = "ok";
    }

    public GoodsResult(String errorCode, String errorMessage) {
        this.state = 0;
        this.message = "error";
    }
}
