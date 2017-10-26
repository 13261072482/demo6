package com.qiang.product;

import com.qiang.product.entity.GoodsEntity;
import org.apache.ibatis.annotations.*;

/**
 * Created by maxrocky on 2017/10/25.
 * 商品的添加,搜索,修改价格,软删除
 */
@Mapper
public interface GoodsMapper {
    /**
     * 插入商品
     *
     * @param goodsEntity
     */
    @Insert("insert into goods (gname, gprice, gdetail, gaddress) values (#{gname}, #{gprice}, #{gdetail}, #{gaddress})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void add(GoodsEntity goodsEntity);

    /**
     * 普通查询商品信息
     *
     * @return
     */
    @Select("SELECT * FROM goods")
    @Results({
            @Result(property = "gid", column = "gid"),
            @Result(property = "gname", column = "gname"),
            @Result(property = "gprice", column = "gprice")
            , @Result(property = "gdetail", column = "gdetail")
            , @Result(property = "gaddress", column = "gaddress")
    })
    GoodsEntity select();

    /**
     * 更改商品价格
     *
     * @param goodsEntity
     */
    @Update("update goods gprice set gprice = #{gprice} where gid = #{gid}")
    void updatePrice(GoodsEntity goodsEntity);
}
