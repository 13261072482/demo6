package com.qiang.dao.entity;
/**
 * Created by maxrocky on 2017/10/25.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author maxrocky
 * @data 2017  25 16:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsEntity {
    //商品ID

    private Integer gid;

    //商品名称

    private String gname;

    //价格

    private Integer gprice;

    //描述

    private String gdetail;

    //发货地

    private String gaddress;

    //评论

    private List<DiscussEntity> discuss;


    //轮播图列表

    private List<BannerEntity> banner;


}
