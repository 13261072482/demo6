package com.qiang.dao;
/**
 * Created by maxrocky on 2017/10/26.
 */

import com.qiang.dao.entity.DiscussEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author maxrocky
 * @data 2017 guoyingqiang 26 9:18
 */
@Mapper
public interface DiscussMapper {
    /**
     * 查询评论
     */
    @Select("select * from discuss where gid = #{gid}")
    List<DiscussEntity> getDiscuss(Integer gid);

    /**
     * 插入评论
     */
    @Insert("insert into discuss (gid, dcoutent) values (#{gid}, #{dcoutent})")
    void addDiscuss(DiscussEntity discussEntity);
}