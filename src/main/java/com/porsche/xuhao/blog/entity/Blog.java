package com.porsche.xuhao.blog.entity;

import lombok.*;


import javax.persistence.*;
import java.util.Date;

/**
 * @author Xu hao
 * @Description 博客实体
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/20
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "xh_blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 博客标题
     */
    private String title;

    /**
     * 博客内容
     */
    private String content;

    /**
     * 博客首图
     */
    @Column(name = "first_picture")
    private String firstPicture;

    /**
     * 博客标记
     */
    private String flag;

    /**
     * 访问次数
     */
    private Integer views;

    /**
     * 赞赏开启
     */
    private Integer appreciation;

    /**
     * 版权开启
     */
    @Column(name = "share_statement")
    private Integer shareStatement;

    /**
     * 评论开启
     */
    private Integer commentabled;

    /**
     * 发布
     */
    private Integer published;

    /**
     * 是否推荐
     */
    private Integer recommend;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 描述
     */
    private String description;

    /**
     * 所属类型id
     */
    private Long typeid;

    /**
     * 所属标签id
     */
    private String tagid;

    /**
     * 所属user
     */
    private Long userid;

}
