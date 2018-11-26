package com.porsche.xuhao.blog.service.impl;

import com.porsche.xuhao.blog.core.AbstractBaseService;
import com.porsche.xuhao.blog.dao.UserMapper;
import com.porsche.xuhao.blog.entity.User;
import com.porsche.xuhao.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Xu hao
 * @Description
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/12
 */
@Service
public class UserServiceImpl extends AbstractBaseService<User> implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(String userName, String passWord) {
        return userMapper.findUserByNameAndPass(userName, passWord);
    }
}
