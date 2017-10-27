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
public class GoodsQueryParamEntity {
    //商品名称
    private String gname;

    //最大价格
    private Integer maxprice;

    //最小价格
    private Integer minPrice;

    //描述
    private String gdetail;

    //发货地
    private String gaddress;

}
