package com.qiang.product.entity;
/**
 * Created by maxrocky on 2017/10/25.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author maxrocky
 * @data 2017 guoyingqiang 25 17:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BannerEntity {
    //图片id
    private Integer bid;

    //图片地址
    private String bpic;

    //关联商品id
    private Integer gid;
}
