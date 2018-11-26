package com.porsche.xuhao.blog.service.impl;

import com.porsche.xuhao.blog.constant.BlogConstant;
import com.porsche.xuhao.blog.core.AbstractBaseService;
import com.porsche.xuhao.blog.dao.BlogMapper;
import com.porsche.xuhao.blog.entity.Blog;
import com.porsche.xuhao.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Xu hao
 * @Description
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/20
 */
@Service
public class BlogServiceImpl extends AbstractBaseService<Blog> implements BlogService{

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> findByTypeId(Long id) {
        return blogMapper.findByTypeId(id);
    }

    @Override
    public List<Blog> findAllByCreateTimeDesc() {
        return blogMapper.findAllByCreateTimeDesc();
    }

    @Override
    public List<Blog> findTop5Views() {
        List<Blog> blogs = blogMapper.findAllByViewsDesc();
        if (CollectionUtils.isEmpty(blogs)){
            return null;
        }
        if (BlogConstant.FIVE >= blogs.size()){
            blogs.sort((o1, o2) -> o2.getViews().compareTo(o1.getViews()));
            return blogs;
        }
        blogs.sort((o1, o2) -> o2.getViews().compareTo(o1.getViews()));
        return blogs.subList(BlogConstant.ZERO, BlogConstant.FOUR);
    }
}
