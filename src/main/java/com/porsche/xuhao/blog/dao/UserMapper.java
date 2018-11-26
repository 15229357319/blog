package com.porsche.xuhao.blog.dao;

import com.porsche.xuhao.blog.core.BaseMapper;
import com.porsche.xuhao.blog.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Xu hao
 * @Description 用户Mapper
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/12
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * @Author Xu hao
     * @Description  根据用户名和密码查询用户
     * @Date 2018/11/13 0:21
     * @param userName
     * @param passWord
     * @return com.porsche.xuhao.blog.entity.User
     **/
    @Select("select * from xh_user where username = #{userName} and password = #{passWord}")
    User findUserByNameAndPass(@Param(value = "userName") String userName, @Param(value = "passWord") String passWord);

}
