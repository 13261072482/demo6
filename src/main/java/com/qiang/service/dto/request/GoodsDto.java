package com.qiang.service.dto.request;
/**
 * Created by maxrocky on 2017/10/25.
 */

import com.qiang.dao.entity.BannerEntity;
import com.qiang.dao.entity.DiscussEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author maxrocky
 * @data 2017  25 16:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "商品信息载体")
public class GoodsDto {
    //商品名称
    @NotBlank
    @ApiModelProperty(value = "商品名称", required = true, example = "得力空调")
    private String gname;

    //价格
    @NotBlank
    @ApiModelProperty(value = "商品价格", required = true, example = "123")
    private Integer gprice;

    //描述
    @NotBlank
    @ApiModelProperty(value = "商品描述", required = true, example = "得力空调,是一款....")
    private String gdetail;

    //发货地
    @NotBlank
    @ApiModelProperty(value = "商品发货地", required = true, example = "广州市的顺去")
    private String gaddress;
}
