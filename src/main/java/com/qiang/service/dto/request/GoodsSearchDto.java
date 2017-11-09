package com.qiang.service.dto.request;
/**
 * Created by maxrocky on 2017/10/25.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author maxrocky
 * @data 2017  25 16:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "商品信息载体")
public class GoodsSearchDto {
    //商品名称

    @ApiModelProperty(value = "商品名称", required = true, example = "shop")
    private String gname;



    //描述
    @ApiModelProperty(value = "商品描述", required = true, example = "the")
    private String gdetail;

    //发货地

    @ApiModelProperty(value = "商品发货地", required = true, example = "of")
    private String gaddress;

    //最大价格
    @ApiModelProperty(value = "商品最大价格", required = true, example = "1000")
    private Integer maxPrice;

    //最小价格

    @ApiModelProperty(value = "商品最小价格", required = true, example = "123")
    private Integer minPrice;
}
