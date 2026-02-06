package com.itheima.mapper;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQuerypram;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

import static net.sf.jsqlparser.parser.feature.Feature.select;

public interface ClazzMapper {
    /**
     * 根据条件查询Clazz
     */
    public List<Clazz> clazzList (ClazzQuerypram clazzQuerypram);
    /**
     * 显示所有班主任
     */
    @Select("SELECT DISTINCT c.master_name FROM clazz c ")
    public  List<String>  list();

    @Insert("INSERT into clazz(name,room,begin_date ,end_date ,master_id ,subject)" +
    "values(#{name},#{room},#{beginDate},#{endDate},#{masterId},#{subject})")
    public  void  save(Clazz clazz);

    @Select("SELECT c.* FROM clazz c WHERE c.id = id")
    public  Clazz getById(Integer id);
}
