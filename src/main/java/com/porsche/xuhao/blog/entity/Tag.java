package com.porsche.xuhao.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Xu hao
 * @Description 博客标签实体
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "xh_tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 标签名称
     */
    @NotBlank(message = "标签内容不能为空")
    private String name;

    /**
     * 该标签下的博客id
     */
    private String blogid;

    /**
     * 该标签下的博客数量，用于前端显示
     */
    @Transient
    private Integer blogNum;

}
