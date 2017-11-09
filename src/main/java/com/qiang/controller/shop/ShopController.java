package com.qiang.controller.shop;
/**
 * Created by maxrocky on 2017/10/25.
 */

import com.qiang.common.ApiResult;
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
@RequestMapping(value = "/shop")
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
    public ApiResult add(GoodsDto goodsEntity) {
        goodService.add(goodsEntity);
        return ApiResult.success("ok");
    }

    /**
     * 商品单个查询
     */
    @ApiOperation(value = "查询单个商品", httpMethod = "GET")
    @RequestMapping(value = "/queryGoodById", method = RequestMethod.GET)
    public ApiResult queryGoods(Integer gid) {
        return ApiResult.success(goodService.queryGoodsById(gid));
    }

    /**
     * 查询商品
     *
     * @return
     */
    @ApiOperation(value = "查询所有商品", httpMethod = "GET")
    @RequestMapping(value = "/selectGoods", method = RequestMethod.GET)
    public ApiResult select() {

        return ApiResult.success(goodService.select());
    }

    /**
     * 查询商品
     *
     * @return
     */
    @ApiOperation(value = "模糊查询商品,按照商品名称,详情,地址,价格区间", httpMethod = "POST")
    @RequestMapping(value = "/selectGoodsOption", method = RequestMethod.POST)
    public ApiResult selectOption(@RequestBody @Valid GoodsSearchDto goodsEntity) {
        return ApiResult.success(goodService.selectOption(goodsEntity));
    }

    /**
     * 修改商品价格
     */
    @ApiOperation(value = "修改商品价格", httpMethod = "POST")
    @RequestMapping(value = "/updatePrice", method = RequestMethod.POST)
    public ApiResult updatePrice(PriceUpdateDto priceUpdateDto) {
        goodService.updatePrice(priceUpdateDto);
        return ApiResult.success("ok");
    }

    /**
     * 删除商品
     */
    @ApiOperation(value = "删除商品", httpMethod = "POST")
    @RequestMapping(value = "/deleteGoods", method = RequestMethod.POST)
    public ApiResult deleteGoods(Integer gid) {
        goodService.deleteGoods(gid);
        return ApiResult.success("删除成功");
    }

    /**
     * 添加图片
     */
    @ApiOperation(value = "商品添加图片", httpMethod = "POST")
    @RequestMapping(value = "/addPics", method = RequestMethod.POST)
    public ApiResult addPics() {

        return ApiResult.success("添加成功");

    }

}
