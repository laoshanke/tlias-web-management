package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.ClazzMapper;
import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQuerypram;
import com.itheima.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class ClazzServiceImpl {
    @Autowired
    private ClazzMapper clazzMapper;

    public PageResult page(ClazzQuerypram clazzQuerypram){
        PageHelper.startPage(clazzQuerypram.getPage(),clazzQuerypram.getPageSize());
        List<Clazz> clazzList = clazzMapper.clazzList(clazzQuerypram);
        Page<Clazz> p= (Page<Clazz>)clazzList;
        return  new PageResult(p.getTotal(),p.getResult());
    }
    public List<String> list(){
        return clazzMapper.list();
    }
    public void  save( Clazz clazz){
        clazzMapper.save(clazz);
    }
}
