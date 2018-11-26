package com.porsche.xuhao.blog.service.impl;

import com.porsche.xuhao.blog.entity.User;
import com.porsche.xuhao.blog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

/**
 * @Author Xu hao
 * @Description 用户ServiceImpl测试类
 * @Date 2018/11/12 22:35
 **/


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void TestFindUserById(){
        User user = userService.findById(1L);
        log.info("【用户操作】通过id查询用户: user={}", user);
        Assert.assertTrue("测试通过", !StringUtils.isEmpty(user.getPassword()));
    }


}