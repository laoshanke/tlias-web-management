package com.itheima.service;

import com.itheima.pojo.ClazzQuerypram;
import com.itheima.pojo.PageResult;

import java.time.LocalDate;

public interface ClazzService {
    /**
     * 分页查询
     * @param clazzQuerypram
     */
    public PageResult page(ClazzQuerypram clazzQuerypram);

}
