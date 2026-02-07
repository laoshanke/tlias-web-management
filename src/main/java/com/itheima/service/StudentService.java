package com.itheima.service;

import com.itheima.pojo.PageResult;
import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;

import java.util.List;

public interface StudentService {

    /**
     *
     * @param studentQueryParam
     * @return
     */
     PageResult page(StudentQueryParam studentQueryParam);

    /**
     * 新增学员
     * @param student
     */
    void  save(Student student);

    /**
     * 根据id查找学员
     * @param id
     * @return
     */
    Student getById(Integer id);

    /**
     * 更新对应学员
     * @param student
     */
    void update(Student student);

    /**
     * 删除ids中对应学员
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 对id对应的学员增加一次违纪，并增加score违纪扣分
     * @param id
     * @param score
     */
    void violation(Integer id ,short score);
}
