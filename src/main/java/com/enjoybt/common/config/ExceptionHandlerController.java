package com.enjoybt.common.config;

import com.enjoybt.common.ResultMap;
import com.enjoybt.common.exception.KeyAuthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandlerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler(KeyAuthorizedException.class)
    @ResponseBody
    public Map<String, Object> keyAuthrorizedExceptionHandle() {
        LOGGER.info("API KEY 인증 실패");
        ResultMap result = new ResultMap();
        result.setUnAuthorized();
        return result;
    }

    @ExceptionHandler(SQLException.class)
    @ResponseBody
    public Map<String, Object> sqlExceptionHandle(){
        LOGGER.info("SQL 수행 중 예외 발생");
        ResultMap result = new ResultMap();
        result.setServerError();
        return result;
    }

    @ExceptionHandler(ServletRequestBindingException.class)
    @ResponseBody
    public Map<String, Object> ServletRequestBindingExceptionHandle(){
        LOGGER.info("Bad reqeust 예외 발생");
        ResultMap result = new ResultMap();
        result.setBadRequest();
        return result;
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandle(){
        LOGGER.info("기타 예외 발생");
        ResultMap result = new ResultMap();
        result.setServerError();
        return "/error";
    }
}
