package com.enjoybt.common.config;

import com.enjoybt.common.ResultMap;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class ErrorPageHandler implements ErrorController {
    @RequestMapping("/error")
    @ResponseBody
    public Map<String, Object> handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        ResultMap result = new ResultMap();
        if (status != null) {
            int statusCode = Integer.valueOf(status.toString());

            if(statusCode == HttpStatus.UNAUTHORIZED.value()) result.setUnAuthorized();
            if(statusCode == HttpStatus.BAD_REQUEST.value()) result.setBadRequest();
            if(statusCode == HttpStatus.NOT_FOUND.value()) result.setNotFound();
            if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) result.setServerError();

        }

        return result;
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}