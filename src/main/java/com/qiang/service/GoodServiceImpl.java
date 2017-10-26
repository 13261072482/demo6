package com.qiang.service;
/**
 * Created by maxrocky on 2017/10/25.
 */


import com.qiang.product.GoodsMapper;
import com.qiang.product.entity.GoodsEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author maxrocky
 * @data 2017 guoyingqiang 25 18:44
 */
@Service

public class GoodServiceImpl implements GoodService {

    @Resource
    GoodsMapper goodsMapper;

    @Override
    public void add(GoodsEntity goodsEntity) {
        goodsMapper.add(goodsEntity);
        System.out.println("已经进入添加商品serice");
    }

    @Override
    public GoodsEntity select() {
        System.out.println("查询商品中");
        return goodsMapper.select();
    }

    @Override
    public void updatePrice(GoodsEntity goodsEntity) {
        goodsMapper.updatePrice(goodsEntity);
    }
}
