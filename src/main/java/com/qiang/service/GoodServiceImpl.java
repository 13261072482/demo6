package com.qiang.service;
/**
 * Created by maxrocky on 2017/10/25.
 */


import com.qiang.dao.DiscussMapper;
import com.qiang.dao.GoodsMapper;
import com.qiang.dao.entity.GoodsEntity;
import com.qiang.dao.entity.GoodsQueryParamEntity;
import com.qiang.service.dto.request.GoodsDto;
import com.qiang.service.dto.request.GoodsSearchDto;
import com.qiang.service.dto.request.PriceUpdateDto;
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
    public void add(GoodsDto goodsEntity) {
        goodsMapper.add(goodsEntity);
    }

    @Override
    public List<GoodsEntity> select() {
        return goodsMapper.select();
    }

    @Override
    public List<GoodsEntity> selectOption(GoodsSearchDto goodsEntity) {
//        goodsEntity.setGname("%" + goodsEntity.getGname() + "%");

        return goodsMapper.selectOption(goodsEntity);
    }

    @Override
    public void updatePrice(PriceUpdateDto goodsEntity) {
        goodsMapper.updatePrice(goodsEntity);
    }

    @Override
    public void deleteGoods(Integer gid) {
        goodsMapper.deleteGoods(gid);
    }

    @Override
    public GoodsEntity queryGoodsById(Integer gid) {
        return goodsMapper.queryGoodById(gid);
    }
}
