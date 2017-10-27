package com.qiang.service;


import com.qiang.dao.entity.GoodsEntity;
import com.qiang.dao.entity.GoodsQueryParamEntity;
import com.qiang.service.dto.request.GoodsDto;
import com.qiang.service.dto.request.GoodsSearchDto;
import com.qiang.service.dto.request.PriceUpdateDto;

import java.util.List;

/**
 * Created by maxrocky on 2017/10/25.
 */

public interface GoodService {

    /**
     * 添加商品
     */
    void add(GoodsDto goodsEntity);

    /**
     * 查询商品
     */
    List<GoodsEntity> select();
    /**
     * 查询商品
     */
    List<GoodsEntity> selectOption(GoodsSearchDto goodsEntity);
    /**
     * 修改商品价格
     */
    void updatePrice(PriceUpdateDto goodsEntity);

    /**
     * 删除一个商品
     */
    void deleteGoods(Integer gid);

    GoodsEntity queryGoodsById(Integer gid);
}
