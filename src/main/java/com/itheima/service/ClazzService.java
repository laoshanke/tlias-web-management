package com.itheima.service;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQuerypram;
import com.itheima.pojo.Emp;
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
    public List<Emp> list();

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

    /**
     * 更新班级
     * @param clazz
     */
    public  void  update(Clazz clazz);

    /**
     * 删除id对应的班级
     * @param id
     */
    public  void delete(Integer id);
}
