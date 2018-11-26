package com.porsche.xuhao.blog.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Xu hao
 * @Description 用户类
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "xh_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 昵称
     **/
    private String nickname;

    /**
     * 用户名
     **/
    private String username;

    /**
     * 密码
     **/
    private String password;

    /**
     * 邮箱
     **/
    private String email;

    /**
     * 类型
     **/
    private String type;

    /**
     * 头像
     **/
    private String avator;

    /**
     * 创建时间
     **/
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     **/
    @Column(name = "update_time")
    private Date updateTime;

}
