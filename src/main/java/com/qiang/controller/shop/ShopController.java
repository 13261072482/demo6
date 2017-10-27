package com.qiang.controller.shop;
/**
 * Created by maxrocky on 2017/10/25.
 */

import com.qiang.common.GoodsResult;
import com.qiang.service.GoodService;
import com.qiang.service.dto.request.GoodsDto;
import com.qiang.service.dto.request.GoodsSearchDto;
import com.qiang.service.dto.request.PriceUpdateDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;


/**
 * @author maxrocky
 * @data 2017 guoyingqiang 25 22:23
 */

@RestController
@Api(value = "商品模块")
public class ShopController {
    @Resource
    GoodService goodService;

    /**
     * 添加商品
     *
     * @param goodsEntity
     * @return
     */
    @ApiOperation(value = "添加一个商品", notes = "Json", httpMethod = "POST")
    @RequestMapping(value = "/addGoods", method = RequestMethod.POST)
    public GoodsResult add(GoodsDto goodsEntity) {
        goodService.add(goodsEntity);
        return GoodsResult.success("ok");
    }

    /**
     * 商品单个查询
     */
    @ApiOperation(value = "查询单个商品", httpMethod = "GET")
    @RequestMapping(value = "/queryGoodById", method = RequestMethod.GET)
    public GoodsResult queryGoods(Integer gid) {
        return GoodsResult.success(goodService.queryGoodsById(gid));
    }

    /**
     * 查询商品
     *
     * @return
     */
    @ApiOperation(value = "查询所有商品", httpMethod = "GET")
    @RequestMapping(value = "/selectGoods", method = RequestMethod.GET)
    public GoodsResult select() {

        return GoodsResult.success(goodService.select());
    }

    /**
     * 查询商品
     *
     * @return
     */
    @ApiOperation(value = "模糊查询商品,按照商品名称,详情,地址,价格区间", httpMethod = "POST")
    @RequestMapping(value = "/selectGoodsOption", method = RequestMethod.POST)
    public GoodsResult selectOption(@RequestBody @Valid GoodsSearchDto goodsEntity) {
        return GoodsResult.success(goodService.selectOption(goodsEntity));
    }

    /**
     * 修改商品价格
     */
    @ApiOperation(value = "修改商品价格", httpMethod = "POST")
    @RequestMapping(value = "updatePrice", method = RequestMethod.POST)
    public GoodsResult updatePrice(PriceUpdateDto priceUpdateDto) {
        goodService.updatePrice(priceUpdateDto);
        return GoodsResult.success("ok");
    }

    /**
     * 删除商品
     */
    @ApiOperation(value = "删除商品", httpMethod = "POST")
    @RequestMapping(value = "deleteGoods", method = RequestMethod.POST)
    public GoodsResult deleteGoods(Integer gid) {
        goodService.deleteGoods(gid);
        return GoodsResult.success("删除成功");
    }

}
