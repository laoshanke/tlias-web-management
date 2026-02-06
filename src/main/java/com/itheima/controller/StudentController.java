package com.itheima.controller;

import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;
import com.itheima.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public Result page(@RequestBody StudentQueryParam studentQueryParam){
        log.info("以如下参数分页查询：" + studentQueryParam);
        return Result.success(studentService.page(studentQueryParam));
    }
    @PostMapping
    public  Result save(@RequestBody Student student){
        log.info("添加如下学员" + student);
        studentService.save(student);
        return Result.success();
    }


}
