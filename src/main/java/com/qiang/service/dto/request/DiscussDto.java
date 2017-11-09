package com.qiang.service.dto.request;
/**
 * Created by maxrocky on 2017/10/25.
 */

import com.qiang.common.LocalDateTimeUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;


/**
 * @author maxrocky
 * @data 2017 guoyingqiang 25 17:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "评论载体")
public class DiscussDto {
    //评论内容
    @ApiModelProperty(value = "商品评论", required = true, example = "我是一只小小鸟")

    private String dcontent;

    //关联商品id
    @ApiModelProperty(value = "商品id", required = true, example = "8")
    private Integer gid;
    @ApiModelProperty(value = "生成时间", required = false, hidden = true)
    private long createTime = System.currentTimeMillis();
}
