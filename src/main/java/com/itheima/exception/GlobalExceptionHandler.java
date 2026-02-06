package com.itheima.exception;

import com.itheima.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 捕获业务异常
     */
    @ExceptionHandler(BusinessException.class)
    public Result handleBusinessException(BusinessException e){
        log.error("出现业务异常: {}", e.getMessage());
        // 将异常中的 message (例如"该班级下有学生...") 返回给前端
        // 假设 Result 类有一个 error 静态方法用于返回错误信息
        return Result.error(e.getMessage());
    }

    /**
     * 捕获其他未知异常 (兜底)
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        log.error("系统异常: ", e);
        return Result.error("操作失败，请联系管理员");
    }
}