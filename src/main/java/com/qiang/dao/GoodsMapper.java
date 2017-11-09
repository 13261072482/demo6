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
 * @author guoyingqiang
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
    @Select("SELECT * FROM goods where g_status = 1")
    @Results(value = {
            @Result(property = "gid", column = "g_id"),
            @Result(property = "discuss", column = "gid", many = @Many(select = "com.qiang.dao.DiscussMapper.getDiscuss")),
            @Result(property = "banner", column = "gid", many = @Many(select = "com.qiang.dao.BannerMapper.getBanners"))
    })
    List<GoodsEntity> select();

    /**
     * 普通查询商品
     * @param goodsEntity
     * @return
     */
    @SelectProvider(type = GoodsProvider.class, method = "selectByParam"
    )
    @Results(value = {
            @Result(property = "gid", column = "g_id"),
            @Result(property = "discuss", column = "g_id", many = @Many(select = "com.qiang.dao.DiscussMapper.getDiscuss")),
            @Result(property = "banner", column = "g_id", many = @Many(select = "com.qiang.dao.BannerMapper.getBanners"))

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
     * 通过商品id删除一个商品
     * @param gid
     */
    @Update("update goods gstatus set gstatus = 0 where gid = #{gid}")
    void deleteGoods(Integer gid);

    /**
     * 通过id查询一个商品
     * @param gid
     * @return
     */
    @Select("select * from goods where gid = #{gid} and gstatus = 1")
    GoodsEntity queryGoodById(Integer gid);
}
