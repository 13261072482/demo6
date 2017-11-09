package com.qiang.dao.provider;
/**
 * Created by maxrocky on 2017/10/26.
 */


import com.qiang.service.dto.request.GoodsSearchDto;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author maxrocky
 * @data 2017 guoyingq 26 13:12
 */

public class GoodsProvider {
    /**
     * 动态查询模糊查询的sql语句
     */
    public String selectByParam(final GoodsSearchDto goodsEntity) {
        return new SQL() {{
            String condition = "g_status = 1 ";
            SELECT("*");
            FROM("goods");
            if (goodsEntity.getGname() != null && !"".equals(goodsEntity.getGname())) {
                goodsEntity.setGname("%" + goodsEntity.getGname() + "%");
                condition += "and g_name like #{gname} ";
            }
            if (goodsEntity.getGdetail() != null && !"".equals(goodsEntity.getGdetail())) {
                goodsEntity.setGdetail("%" + goodsEntity.getGdetail() + "%");
                condition += "and g_detail like #{gdetail} ";
            }
            if (goodsEntity.getGaddress() != null && !"".equals(goodsEntity.getGaddress())) {
                goodsEntity.setGaddress("%" + goodsEntity.getGaddress() + "%");
                condition += "and g_address like #{gaddress} ";
            }
            if (goodsEntity.getMinPrice() != null && goodsEntity.getMaxPrice() != null
                    && goodsEntity.getMinPrice() <= goodsEntity.getMaxPrice()) {
                condition += "and g_price between #{minPrice} and #{maxPrice}";
            }
            WHERE(condition);
        }}.toString();
    }
}
