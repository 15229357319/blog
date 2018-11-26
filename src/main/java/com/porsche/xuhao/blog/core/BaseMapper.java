package com.porsche.xuhao.blog.core;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Xu hao
 * @Description 继承通用的Mapper<T>必须指定泛型
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/12
 */
public interface BaseMapper<T> extends Mapper<T>, ConditionMapper<T>,
        IdsMapper<T>, MySqlMapper<T>{
    // 特别注意，该接口不能被扫描到，否则会报错
}
