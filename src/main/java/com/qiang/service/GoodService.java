package com.qiang.service;


import com.qiang.product.entity.GoodsEntity;

/**
 * Created by maxrocky on 2017/10/25.
 */

public interface GoodService {

    /**
     * 添加商品
     */
    void add(GoodsEntity goodsEntity);

    /**
     * 查询商品
     */
    GoodsEntity select();

    /**
     * 修改商品价格
     */
    void updatePrice(GoodsEntity goodsEntity);
}
