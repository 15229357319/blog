package com.porsche.xuhao.blog.service;

import com.porsche.xuhao.blog.core.BaseService;
import com.porsche.xuhao.blog.entity.Blog;

import java.util.List;

/**
 * @author Xu hao
 * @Description 博客Service
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/20
 */
public interface BlogService extends BaseService<Blog>{

    /**
     * @Author Xu hao
     * @Description 查询某一类型的博客
     * @Date 2018/11/20 22:39
     * @param id
     * @return List<Blog>
     **/
    List<Blog> findByTypeId(Long id);

    /**
     * @Author Xu hao
     * @Description 查询所有博客按最新降序
     * @Date 2018/11/26 21:09
     * @param 
     * @return List<Blog>
     **/
    List<Blog> findAllByCreateTimeDesc();

    /**
     * @Author Xu hao
     * @Description 查询top5的博客
     * @Date 2018/11/26 21:23
     * @param 
     * @return List<Blog>
     **/
    List<Blog> findTop5Views();

}
