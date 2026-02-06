package com.itheima.mapper;

import org.apache.ibatis.annotations.Select;

public interface StudentMapper {

    @Select("select count(*) FROM student s where s.clazzId = #{clazzId} ")
      Integer countByClazzId(Integer clazzId);
}
