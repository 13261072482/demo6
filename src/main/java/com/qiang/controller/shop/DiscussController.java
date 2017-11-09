package com.qiang.controller.shop;
/**
 * Created by maxrocky on 2017/10/27.
 */


import com.qiang.common.ApiResult;
import com.qiang.service.GoodService;
import com.qiang.service.dto.request.DiscussDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author maxrocky
 * @data 2017 guoyingqiang 27 10:52
 */
@RestController
@Api(value = "评论操作")
@RequestMapping(value = "/discuss")
public class DiscussController {

    @Resource
    GoodService goodService;
    @RequestMapping(value = "/addDisscuss", method = RequestMethod.POST)
    @ApiOperation(value = "添加商品评论", httpMethod = "POST")
    public ApiResult addDiscuss(@RequestBody DiscussDto discussDto) {
        goodService.addDiscuss(discussDto);
        return ApiResult.success("添加评论成功");
    }
}
