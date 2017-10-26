package com.qiang.service;
/**
 * Created by maxrocky on 2017/10/25.
 */


import com.qiang.dao.DiscussMapper;
import com.qiang.dao.GoodsMapper;
import com.qiang.dao.entity.GoodsEntity;
import com.qiang.dao.entity.GoodsQueryParamEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author maxrocky
 * @data 2017 guoyingqiang 25 18:44
 */
@Service

public class GoodServiceImpl implements GoodService {

    @Resource
    GoodsMapper goodsMapper;

    @Resource
    DiscussMapper discussMapper;

    @Override
    public void add(GoodsEntity goodsEntity) {
        goodsMapper.add(goodsEntity);
    }

    @Override
    public List<GoodsEntity> select() {
        return goodsMapper.select();
    }

    @Override
    public List<GoodsEntity> selectOption(GoodsQueryParamEntity goodsEntity) {
//        goodsEntity.setGname("%" + goodsEntity.getGname() + "%");

        return goodsMapper.selectOption(goodsEntity);
    }

    @Override
    public void updatePrice(GoodsEntity goodsEntity) {
        goodsMapper.updatePrice(goodsEntity);
    }

    @Override
    public void deleteGoods(Integer gid) {
        goodsMapper.deleteGoods(gid);
    }
}
