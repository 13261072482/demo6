package com.qiang.service;


import com.qiang.dao.entity.GoodsEntity;
import com.qiang.dao.entity.GoodsQueryParamEntity;

import java.util.List;

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
    List<GoodsEntity> select();
    /**
     * 查询商品
     */
    List<GoodsEntity> selectOption(GoodsQueryParamEntity goodsEntity);
    /**
     * 修改商品价格
     */
    void updatePrice(GoodsEntity goodsEntity);

    /**
     * 删除一个商品
     */
    void deleteGoods(Integer gid);
}
