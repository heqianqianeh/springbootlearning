package com.hqq.error;

import com.hqq.dto.ErrorInfo;
import com.hqq.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * GlobalHandler
 * Created by heqianqian on 2017/7/4.
 */
@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView handleException(HttpServletRequest request, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("url", request.getRequestURL());
        modelAndView.addObject("exception", e);
        modelAndView.setViewName("error");
        return modelAndView;
    }

    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public ErrorInfo<String> handleMyException(MyException e) {
        ErrorInfo<String> errorInfo = new ErrorInfo<String>();
        errorInfo.setData("data");
        errorInfo.setCode(0);
        errorInfo.setError(e.getMessage());
        return errorInfo;
    }

}
