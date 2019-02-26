package com.enjoybt.common.aop;

import com.enjoybt.mdriv_api.api.service.ApiService;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Arrays;

@Component
@Aspect
public class AthenticationHandler {
    @Autowired
    ApiService apiService;

    @Before("execution(* com.enjoybt.mdriv_api.api.controller.*.*(..))")
    public void authenticationApiKey(JoinPoint jp) throws SecurityException, SQLException {
        Object[] obl = jp.getArgs();
        String apiKey = null;

        if (obl[0] instanceof String) {
            apiKey = (String) obl[0];
        } else {
            HttpServletRequest req = (HttpServletRequest)obl[0];
            apiKey = req.getHeader("api_key");
        }

        apiService.authenticationApiKey(apiKey);
    }
}
