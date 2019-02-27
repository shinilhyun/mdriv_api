package com.enjoybt.common.exception;

import com.enjoybt.common.ResultMap;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(KeyAuthorizedException.class)
    @ResponseBody
    public Map<String, Object> handleError() {
        ResultMap result = new ResultMap();
        result.setUnAuthorized();
        return result;
    }
}
