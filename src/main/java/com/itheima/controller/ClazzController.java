package com.itheima.controller;

import com.itheima.pojo.ClazzQuerypram;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
