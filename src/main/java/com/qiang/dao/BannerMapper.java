package com.qiang.dao;

import com.qiang.dao.entity.BannerEntity;
import com.qiang.service.dto.request.BannerDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author  maxrocky on 2017/10/26.
 */
@Mapper
public interface BannerMapper {
    /**
     * 获取商品轮播图
     * @param gid 商品id
     * @return
     */
    @Select("select * from banner where gid = #{gid}")
    List<BannerEntity> getBanners(Integer gid);

    /**
     * 添加图片
     * @param bannerDto
     */
    @Select("insert into banner (bpic,gid)values(#{bpic},#{gid})")
    void addPics(BannerDto bannerDto);

}
