package com.itheima.service;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQuerypram;
import com.itheima.pojo.PageResult;

import java.time.LocalDate;
import java.util.List;

public interface ClazzService {
    /**
     * 分页查询
     * @param clazzQuerypram
     */
    public PageResult page(ClazzQuerypram clazzQuerypram);

    /**
     * 查询所有班主任
     */
    public List<String> list();

    /**
     * 新增班级
     * @param clazz
     */
    public  void save(Clazz clazz);

    /**
     * 依据id检查班级
     * @param id
     * @return
     */
    public Clazz getById(Integer id);

}
