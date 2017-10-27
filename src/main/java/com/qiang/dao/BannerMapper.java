package com.qiang.dao;

import com.qiang.dao.entity.BannerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by maxrocky on 2017/10/26.
 */
@Mapper
public interface BannerMapper {
    /**
     * 获取商品轮播图
     */
    @Select("select * from banner where gid = #{gid}")
    List<BannerEntity> getBanners(Integer gid);


}
