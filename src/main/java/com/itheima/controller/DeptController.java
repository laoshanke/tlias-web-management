package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门管理控制器
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    /*
    查询部门列表
     */
    @GetMapping ("/depts")
    public Result list(){
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }

    /**
     * 根据id删除部门 - delete http://localhost:8080/depts?id=1
     */
    @DeleteMapping("/depts")
    public Result delete(Integer id){
        System.out.println("根据id删除部门, id=" + id);
        deptService.deleteById(id);
        return Result.success();
    }
}