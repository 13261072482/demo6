
package com.qiang.dao;
/**
 * Created by maxrocky on 2017/10/26.
 */

import com.qiang.dao.entity.DiscussEntity;
import com.qiang.service.dto.request.DiscussDto;
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
     * @param gid
     * @return
     */
    @Select("select * from discuss where gid = #{gid}")
    List<DiscussEntity> getDiscuss(Integer gid);

    /**
     * 插入评论
     * @param discussDto
     */
    @Insert("insert into discuss (gid, dcontent, createTime) values (#{gid}, #{dcontent}, #{createTime})")
    void addDiscuss(DiscussDto discussDto);
}