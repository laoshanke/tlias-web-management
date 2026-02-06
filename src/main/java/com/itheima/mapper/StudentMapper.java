package com.itheima.mapper;

import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {

    @Select("select count(*) FROM student s where s.clazzId = #{clazzId} ")
    Integer countByClazzId(Integer clazzId);

    //分页操作中负责条件查询的组件
    List<Student> list(StudentQueryParam studentQueryParam);

    @Insert("INSERT  INTO student(name , no,gender,phone,degree,clazzId,idCard,isCollege,address,graduationDate,createTime) " +
            " values(#{name},#{no},#{gender},#{phone},#{degree},#{clazzId},#{idCare},#{isCollege},#{address},#{graduationDate},#{createTime}")
    void save(Student student);

    @Select("SELECT s.(*) FROM student WHERE s.id = #{id}")
    Student getById(Integer id);
    @Update("")
    void  update(Student student);
}
