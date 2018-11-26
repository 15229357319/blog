package com.porsche.xuhao.blog.service;

import com.porsche.xuhao.blog.core.BaseService;
import com.porsche.xuhao.blog.entity.User;

/**
 * @author Xu hao
 * @Description
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/12
 */
public interface UserService extends BaseService<User> {

    /**
     * @Author Xu hao
     * @Description 检查用户是否存在
     * @Date 2018/11/13 0:24
     * @param userName
     * @param passWord
     * @return com.porsche.xuhao.blog.entity.User
     **/
    User checkUser(String userName, String passWord);

}
