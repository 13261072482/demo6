package com.qiang.product.entity;
/**
 * Created by maxrocky on 2017/10/25.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author maxrocky
 * @data 2017 guoyingqiang 25 17:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscussEntity {
    //评论id
    private Integer did;

    //评论内容
    private String dcontent;

    //关联商品id
    private Integer gid;
}
