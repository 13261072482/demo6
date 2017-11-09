package com.qiang.service;


import com.qiang.dao.entity.GoodsEntity;
import com.qiang.dao.entity.GoodsQueryParamEntity;
import com.qiang.service.dto.request.DiscussDto;
import com.qiang.service.dto.request.GoodsDto;
import com.qiang.service.dto.request.GoodsSearchDto;
import com.qiang.service.dto.request.PriceUpdateDto;

import java.util.List;

/**
 * Created by maxrocky on 2017/10/25.
 * @author guingqaing
 */

public interface GoodService {

    /**
     * 添加商品
     * @param goodsEntity
     */
    void add(GoodsDto goodsEntity);

    /**
     * 查询商品
     * @return
     */
    List<GoodsEntity> select();

    /**
     * 查询商品
     * @param goodsEntity
     * @return
     */
    List<GoodsEntity> selectOption(GoodsSearchDto goodsEntity);

    /**
     * 修改商品价格
     * @param goodsEntity
     */
    void updatePrice(PriceUpdateDto goodsEntity);

    /**
     * 删除商品
     * @param gid
     */
    void deleteGoods(Integer gid);

    /**
     * 通过商品id查询商品
     * @param gid
     * @return
     */
    GoodsEntity queryGoodsById(Integer gid);

    /**
     * 添加评论
     * @param discussDto
     */
    void addDiscuss(DiscussDto discussDto);
}
