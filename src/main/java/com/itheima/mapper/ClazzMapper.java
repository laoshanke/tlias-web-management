package com.itheima.mapper;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQuerypram;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;



public interface ClazzMapper {
    /**
     * 根据条件查询Clazz
     */
     List<Clazz> clazzList (ClazzQuerypram clazzQuerypram);


    @Insert("INSERT into clazz(name,room,begin_date ,end_date ,master_id ,subject,createTime,updateTime)" +
    "values(#{name},#{room},#{beginDate},#{endDate},#{masterId},#{subject},#{createTime},#{updateTime})")
      void  save(Clazz clazz);

    @Select("SELECT c.* FROM clazz c WHERE c.id = id")
     Clazz getById(Integer id);
    @Update("UPDATE clazz set name = #{name}, room = #{room}, beginDate = #{beginDate},endDate = #{endDate,}" +
    "masterId = #{masterId},subject = #{subject} ,updateTime = #{updateTime} WHERE id = #{id}")
      void  update(Clazz clazz);
    @Delete("delete from clazz where id = #{id}")
      void delete(Integer id);
}
