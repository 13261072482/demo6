package com.qiang.dao;


import com.qiang.dao.entity.GoodsEntity;
import com.qiang.dao.provider.GoodsProvider;
import com.qiang.service.dto.request.GoodsDto;
import com.qiang.service.dto.request.GoodsSearchDto;
import com.qiang.service.dto.request.PriceUpdateDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

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
    void add(GoodsDto goodsEntity);

    /**
     * 普通查询商品信息
     *
     * @return
     */
    @Select("SELECT * FROM goods where gstatus = 1")
    @Results(value = {
            @Result(property = "gid", column = "gid"),
            @Result(property = "discuss", column = "gid", many = @Many(select = "com.qiang.dao.DiscussMapper.getDiscuss")),
            @Result(property = "banner", column = "gid", many = @Many(select = "com.qiang.dao.BannerMapper.getBanners"))
    })
    List<GoodsEntity> select();

    /**
     * 普通查询商品信息
     *
     * @return
     */
    @SelectProvider(type = GoodsProvider.class, method = "selectByParam"
    )
    @Results(value = {
            @Result(property = "gid", column = "gid"),
            @Result(property = "discuss", column = "gid", many = @Many(select = "com.qiang.dao.DiscussMapper.getDiscuss")),
            @Result(property = "banner", column = "gid", many = @Many(select = "com.qiang.dao.BannerMapper.getBanners"))

    })
    List<GoodsEntity> selectOption(GoodsSearchDto goodsEntity);


    /**
     * 更改商品价格
     *
     * @param goodsEntity
     */
    @Update("update goods gprice set gprice = #{gprice} where gid = #{gid}")
    void updatePrice(PriceUpdateDto goodsEntity);

    /**
     * 软删除一个商品
     */
    @Update("update goods gstatus set gstatus = 0 where gid = #{gid}")
    void deleteGoods(Integer gid);
    @Select("select * from goods where gid = #{gid} and gstatus = 1")
    GoodsEntity queryGoodById(Integer gid);
}
