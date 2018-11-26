package com.porsche.xuhao.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Xu hao
 * @Description 博客评论实体
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "xh_comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 评论者昵称
     */
    private String nickname;

    /**
     * 评论者邮箱
     */
    private String email;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论者头像
     */
    private String avator;

    /**
     * 评论时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 所属博客
     */
    private Long blogid;

    /**
     * 父节点id
     */
    private Long parentid;

    /**
     * 存储子节点
     */
    @Transient
    private List<Comment> replyComment = new ArrayList<>();

    /**
     * 所属的父节点
     */
    @Transient
    private Comment parentComment;

    /**
     * 标识是否是博主
     **/
    @Column(name = "admin_comment")
    private Integer adminComment;

}
