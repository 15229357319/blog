package com.porsche.xuhao.blog.core;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author Xu hao
 * @Description 基于通用MyBatis Mapper插件的Service接口的实现
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/12
 */
public abstract class AbstractBaseService<T> implements BaseService<T> {

    @Autowired
    private BaseMapper<T> mapper;

    /**
     * 当前泛型真实类型的Class
     */
    private Class<T> modelClass;

    @SuppressWarnings("unchecked")
    public AbstractBaseService() {
        ParameterizedType pt = (ParameterizedType)this.getClass()
                .getGenericSuperclass();
        modelClass = (Class<T>)pt.getActualTypeArguments()[0];
    }

    @Override
    public Integer save(T model) {
        return mapper.insertSelective(model);
    }

    @Override
    public Integer save(List<T> models) {
        return mapper.insertList(models);
    }

    @Override
    public Integer deleteById(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteByIds(String ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public Integer update(T model) {
        return mapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public T findById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public T findBy(String fieldName, Object value)
            throws TooManyResultsException {
        try {
            T model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
            return mapper.selectOne(model);
        } catch (ReflectiveOperationException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<T> findByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }

    @Override
    public List<T> findAll() {
        return mapper.selectAll();
    }

    @Override
    public List<T> selectByExample(Example example) {
        return mapper.selectByExample(example);
    }
}
