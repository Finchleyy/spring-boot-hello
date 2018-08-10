package com.ypw.springboothello;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName GlobalDefaultExceptionHandler
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/6/21 20:32
 * @Version 1.0
 **/
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String defaultExceptionHandler() {
        return "全局异常!~!~~!!~~!~!";
    }
}
