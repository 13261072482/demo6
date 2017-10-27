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
public class PriceUpdateDto {
    //商品ID
    @NotNull
    @ApiModelProperty(value = "商品id", required = true, example = "1")
    private Integer gid;


    //价格
    @NotBlank
    @ApiModelProperty(value = "商品价格", required = true, example = "123")
    private Integer gprice;



}
