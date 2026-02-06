package com.itheima.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
public class ClazzQuerypram {
    private String name;
    private  Integer page = 1;
    private  Integer pageSize = 10;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate begin; //范围匹配开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate end; //范围匹配结束时

}
