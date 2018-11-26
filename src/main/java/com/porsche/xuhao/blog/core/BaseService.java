package com.porsche.xuhao.blog.core;

import org.apache.ibatis.exceptions.TooManyResultsException;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author Xu hao
 * @Description Service层 基础接口
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/12
 */
public interface BaseService<T> {

    /**
     * @Author Xu hao
     * @Description 单个保存
     * @Date 2018/11/12 23:30
     * @param model
     * @return java.lang.Integer
     **/
    Integer save(T model);

    /**
     * @Author Xu hao
     * @Description 批量保存
     * @Date 2018/11/12 23:31
     * @param models
     * @return java.lang.Integer
     **/
    Integer save(List<T> models);

    /**
     * @Author Xu hao
     * @Description 通过主键删除
     * @Date 2018/11/12 23:31
     * @param id
     * @return java.lang.Integer
     **/
    Integer deleteById(Long id);

    /**
     * @Author Xu hao
     * @Description 批量删除
     * @Date 2018/11/12 23:32
     * @param ids id用逗号隔开  eg: "1,2,3,4,5"
     * @return java.lang.Integer
     **/
    Integer deleteByIds(String ids);

    /**
     * @Author Xu hao
     * @Description  更新
     * @Date 2018/11/12 23:33
     * @param model
     * @return java.lang.Integer
     **/
    Integer update(T model);

    /**
     * @Author Xu hao
     * @Description 通过主键查找
     * @Date 2018/11/12 23:34
     * @param id
     * @return T
     **/
    T findById(Long id);

    /**
     * @Author Xu hao
     * @Description 通过Model中某个成员变量名称（非数据表中的column的名称）
     *              查找，value需符合unique约束
     * @Date 2018/11/12 23:36
     * @param fieldName
     * @param value
     * @return T
     **/
    T findBy(String fieldName, Object value) throws TooManyResultsException;

    /**
     * @Author Xu hao
     * @Description 通过多个id查找
     * @Date 2018/11/12 23:39
     * @param ids id用逗号隔开  eg: "1,2,3,4,5"
     * @return java.util.List<T>
     **/
    List<T> findByIds(String ids);

    /**
     * @Author Xu hao
     * @Description 根据条件查询
     * @Date 2018/11/12 23:42
     * @param condition
     * @return java.util.List<T>
     **/
    List<T> findByCondition(Condition condition);

    /**
     * @Author Xu hao
     * @Description 查询所有
     * @Date 2018/11/12 23:43
     * @param 
     * @return java.util.List<T>
     **/
    List<T> findAll();

    /**
     * @Author Xu hao
     * @Description 根据条件查询
     * @Date 2018/11/12 23:44
     * @param example
     * @return java.util.List<T>
     **/
    List<T> selectByExample(Example example);


}
