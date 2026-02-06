package com.itheima.controller;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQuerypram;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/clazzs")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @GetMapping
    public Result page(ClazzQuerypram clazzQuerypram){
        log.info("查询请求参数： {}", clazzQuerypram);
        PageResult pageResult = clazzService.page(clazzQuerypram);
        return Result.success(pageResult);
    }

    @GetMapping("/list")
    public  Result list(){
        log.info("展示所有班主任信息");
        return Result.success(clazzService.list());
    }

    @PostMapping
    public Result save(@RequestBody Clazz clazz){
        log.info("新增班级：class = " + clazz);
        clazzService.save(clazz);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("查询对应ID对应的班级：ID" + id);
        return Result.success(clazzService.getById(id));
    }
}
