package com.itheima.controller;

import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;
import com.itheima.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据id查询学员："+ id);
        return Result.success( studentService.getById(id));
    }
    @PostMapping
    public  Result update(@RequestBody Student student){
        log.info("修改学员：" + student);
        studentService.update(student);
        return Result.success();
    }


}
