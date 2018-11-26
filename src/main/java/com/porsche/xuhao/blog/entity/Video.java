package com.porsche.xuhao.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Xu hao
 * @Description Video实体
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/20
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "xh_video")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 视频名称
     */
    private String name;

    /**
     * 视频说明
     */
    private String content;

    /**
     * 视频图片
     */
    private String picture;

    /**
     * 视频点击量
     */
    private Integer views;

    /**
     * 视频时长
     */
    private Integer time;

    /**
     * 视频标签
     */
    private String tag;

    /**
     * 视频价格
     */
    private Double price;

}
