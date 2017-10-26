package com.qiang.dao.provider;
/**
 * Created by maxrocky on 2017/10/26.
 */


import com.qiang.dao.entity.GoodsQueryParamEntity;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author maxrocky
 * @data 2017 guoyingq 26 13:12
 */

public class GoodsProvider {
    /**
     * 动态查询模糊查询的sql语句
     */
    public String selectByParam(final GoodsQueryParamEntity goodsEntity) {
        return new SQL() {{
            String condition = "gstatus = 1 ";
            SELECT("*");
            FROM("goods");
            if (goodsEntity.getGname() != null) {
                goodsEntity.setGname("%" + goodsEntity.getGname() + "%");
                condition += "and gname like #{gname} ";
            }
            if (goodsEntity.getGdetail() != null) {
                goodsEntity.setGdetail("%" + goodsEntity.getGdetail() + "%");
                condition += "and gdetail like #{gdetail} ";
            }
            if (goodsEntity.getGaddress() != null) {
                goodsEntity.setGaddress("%" + goodsEntity.getGaddress() + "%");
                condition += "and gaddress like #{gaddress} ";
            }
            if (goodsEntity.getMinPrice() != null && goodsEntity.getMaxPrice() != null
                    && goodsEntity.getMinPrice() <= goodsEntity.getMaxPrice()) {
               condition += "and gprice between #{minPrice} and #{maxPrice}";
            }
            WHERE(condition);
        }}.toString();
    }


}
