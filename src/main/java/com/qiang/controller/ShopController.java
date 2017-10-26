package com.qiang.controller;/**
 * Created by maxrocky on 2017/10/25.
 */

import com.qiang.common.GoodsResult;
import com.qiang.product.GoodsMapper;
import com.qiang.product.entity.GoodsEntity;
import com.qiang.service.GoodService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;

/**
 * @author maxrocky
 * @data 2017 guoyingqiang 25 22:23
 */
@Controller
public class ShopController {
    @Resource
    GoodService goodService;

    /**
     * 添加商品
     *
     * @param goodsEntity
     * @return
     */
    @RequestMapping(value = "/addGoods", method = RequestMethod.POST)
    @ResponseBody
    public GoodsResult add( GoodsEntity goodsEntity) {
        goodService.add(goodsEntity);
        return new GoodsResult("ok");
    }

    /**
     * 查询商品
     *
     * @return
     */
    @RequestMapping(value = "/selectGoods", method = RequestMethod.GET)
    @ResponseBody
    public GoodsEntity select() {
        return goodService.select();
    }

    /**
     * 修改商品价格
     */
    @RequestMapping(value = "updatePrice", method = RequestMethod.POST)
    @ResponseBody
    public GoodsResult updatePrice(GoodsEntity goodsEntity) {
        goodService.updatePrice(goodsEntity);
        return new GoodsResult("ok");
    }

}
