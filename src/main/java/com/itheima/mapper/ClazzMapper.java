package com.itheima.mapper;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQuerypram;

import java.util.List;

public interface ClazzMapper {
    /**
     * 根据条件查询Clazz
     */
    public List<Clazz> list (ClazzQuerypram clazzQuerypram);
}
