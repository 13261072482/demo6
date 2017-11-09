package com.qiang.service.dto.request;
/**
 * Created by maxrocky on 2017/10/25.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author maxrocky
 * @data 2017 guoyingqiang 25 17:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BannerDto {

    /**
     * 商品图片集合
     */
    private byte[] bpic;
    /**
     * 图片关联的商品id
     */
    private Integer gid;
}
