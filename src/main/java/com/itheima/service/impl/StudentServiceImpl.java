package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.StudentMapper;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public PageResult page(StudentQueryParam studentQueryParam){
        PageHelper.startPage(studentQueryParam.getPage(),studentQueryParam.getPageSize());
        List<Student> studentList = studentMapper.list(studentQueryParam);
        Page<Student> p = (Page<Student>) studentList;
        return new PageResult(p.getTotal(),p.getResult());
    }
    @Transactional(rollbackFor =  Exception.class)
    @Override
    public  void save(Student student){
        student.setCreateTime(LocalDateTime.now());
        studentMapper.save(student);
    }
    @Override
    public  Student getById(Integer id){
        return studentMapper.getById(id);
    }
    @Transactional(rollbackFor =  Exception.class)
    @Override
    public void update(Student student){
        studentMapper.update(student);
    }

}
