package com.porsche.xuhao.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Xu hao
 * @Description 博客类型实体
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/20
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "xh_type")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 类型名称
     */
    @NotBlank(message = "分类名称不能为空")
    private String name;

    /**
     * 该类别下博客数量，用于前端展示
     */
    @Transient
    private Integer blogNum;

}
