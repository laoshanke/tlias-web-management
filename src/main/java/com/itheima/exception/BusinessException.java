package com.itheima.exception;

/**
 * 自定义业务异常
 * 用于在业务逻辑不满足时抛出，由全局异常处理器统一处理
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}