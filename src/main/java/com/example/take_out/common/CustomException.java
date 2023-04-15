package com.example.take_out.common;

/**
 * 自定义业务异常类
 */                                  //运行时异常
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
//在GlobalExceptionHandler类中有其异常处理方法
