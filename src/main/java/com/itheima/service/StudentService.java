package com.itheima.service;

import com.itheima.pojo.PageResult;
import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;

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
}
