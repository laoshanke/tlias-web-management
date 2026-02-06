package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.exception.BusinessException;
import com.itheima.mapper.ClazzMapper;
import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQuerypram;
import com.itheima.pojo.PageResult;
import com.itheima.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.itheima.mapper.StudentMapper;

import java.util.List;
@Service
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public PageResult page(ClazzQuerypram clazzQuerypram){
        PageHelper.startPage(clazzQuerypram.getPage(),clazzQuerypram.getPageSize());
        List<Clazz> clazzList = clazzMapper.clazzList(clazzQuerypram);
        Page<Clazz> p= (Page<Clazz>)clazzList;
        return  new PageResult(p.getTotal(),p.getResult());
    }
    @Override
    public List<String> list(){
        return clazzMapper.list();
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void  save( Clazz clazz){
        clazzMapper.save(clazz);
    }
    @Override
    public Clazz getById(Integer id){
        return clazzMapper.getById(id);
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(Clazz clazz){
        clazzMapper.update(clazz);
    }
    @Transactional(rollbackFor = Exception.class) // 建议加上事务控制
    @Override
    public  void  delete(Integer id){
        if( studentMapper.countByClazzId(id) > 0){
            throw new BusinessException("对不起, 该班级下有学生, 不能直接删除");
        }
        clazzMapper.delete(id);
    }
}
