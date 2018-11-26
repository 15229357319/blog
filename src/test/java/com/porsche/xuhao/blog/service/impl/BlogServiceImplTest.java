package com.porsche.xuhao.blog.service.impl;

import com.porsche.xuhao.blog.entity.Blog;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Author Xu hao
 * @Description  博客相关接口测试
 * @Date 2018/11/26 21:06
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BlogServiceImplTest {

    private static final Long TYPE_ID = 123L;

    @Autowired
    private BlogServiceImpl blogService;

    @Test
    public void findBlogByType(){
        List<Blog> blogs = blogService.findByTypeId(TYPE_ID);
        Assert.assertFalse(CollectionUtils.isEmpty(blogs));
        log.info("【查询某一个类型的博客】 测试通过！");
    }

    @Test
    public void findBlogByCreateTimeDesc(){
        List<Blog> blogs = blogService.findAllByCreateTimeDesc();
        Assert.assertFalse(CollectionUtils.isEmpty(blogs));
        log.info("【查询所有博客按最新降序】测试通过！");
    }

    @Test
    public void findTop5Views(){
        List<Blog> blogs = blogService.findTop5Views();
        Assert.assertFalse(CollectionUtils.isEmpty(blogs));
        log.info("【查询top5的博客】测试通过！");
    }

}