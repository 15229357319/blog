package com.porsche.xuhao.blog.dao;

import com.porsche.xuhao.blog.core.BaseMapper;
import com.porsche.xuhao.blog.entity.Blog;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Xu hao
 * @Description 博客Mapper
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/20
 */
public interface BlogMapper extends BaseMapper<Blog>{

    @Select("select * from xh_blog where typeid = #{id} ")
    @ResultMap("BaseResultMap")
    List<Blog> findByTypeId(Long id);

    @Select("select * from xh_blog order by create_time desc")
    @ResultMap("BaseResultMap")
    List<Blog> findAllByCreateTimeDesc();

    @Select("select * from xh_blog order by views desc")
    @ResultMap("BaseResultMap")
    List<Blog> findAllByViewsDesc();

}
