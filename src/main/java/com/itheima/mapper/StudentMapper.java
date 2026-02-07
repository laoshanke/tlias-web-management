package com.itheima.mapper;

import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    @Select("select count(*) FROM student s where s.clazzId = #{clazzId} ")
    Integer countByClazzId(Integer clazzId);

    //分页操作中负责条件查询的组件
    List<Student> list(StudentQueryParam studentQueryParam);

    @Insert("INSERT  INTO student(name , no,gender,phone,degree,clazzId,idCard,isCollege,address,graduationDate,createTime,violationCount,violationScore) " +
            " values(#{name},#{no},#{gender},#{phone},#{degree},#{clazzId},#{idCard},#{isCollege},#{address},#{graduationDate},#{createTime},0,0)")
    void save(Student student);

    @Select("SELECT s.*) FROM student WHERE s.id = #{id}")
    Student getById(Integer id);

    //更新对应学生
    void  update(Student student);

    void delete(List<Integer> ids);

    @Update("update student s set violationCount = 1 + s.violationCount, violationScore = #{violationScore},updateTime = #{updateTime} WHERE id = #{id}")
    void violation(Student student);

    @MapKey("deg")
    List<Map> getStudentDegreeData();

    @MapKey("clazzName")
    List<Map> getStudentCountData();
}
