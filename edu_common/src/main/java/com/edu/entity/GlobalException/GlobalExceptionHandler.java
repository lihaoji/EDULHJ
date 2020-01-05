package com.edu.entity.GlobalException;

/**
 * 统一异常处理机制
 * @author lihaoji
 * @create 2019-12-07 14:21
 */

import com.edu.entity.EduException;
import com.edu.entity.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 全局异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R exceptionAdvice(Exception e){

        e.printStackTrace();
        return R.error().message("全局异常出错了");

    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R exceptionAdvice(ArithmeticException e){

        e.printStackTrace();
        return R.error().message("算数异常异常出错了");

    }


    /**
     * 自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(EduException.class)
    @ResponseBody
    public R ziDingYi(EduException e){

        e.printStackTrace();
        return R.error().code(e.getCode()).message(e.getMessage());
    }

}
