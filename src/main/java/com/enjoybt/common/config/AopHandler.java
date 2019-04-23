package com.enjoybt.common.config;

import com.enjoybt.common.exception.KeyAuthorizedException;
import com.enjoybt.mdriv_api.api.service.AuthService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Arrays;

@Component
@Aspect
public class AopHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(AopHandler.class);

    @Autowired
    AuthService authService;

    @Before("execution(* com.enjoybt.mdriv_api..*Service.*(..))")
    public void startLog(JoinPoint jp) {

        LOGGER.debug("------------------------------------------");
        LOGGER.debug("METHOD         :    " + jp.getSignature().getName());
        LOGGER.debug("PARAM VALUES   :    " + Arrays.toString(jp.getArgs()));
        LOGGER.debug("CLASS          :    " + jp.getTarget().getClass().getCanonicalName());
        LOGGER.debug("------------------------------------------");

    }

//    @Before("execution(* com.enjoybt.mdriv_api..*Controller.*(..)) &&" + "args(apiKey,..)")
//    public void authenticationApiKey(String apiKey) throws KeyAuthorizedException, SQLException {
//
//        authService.authenticationApiKey(apiKey);
//    }
//
//    @Before("execution(* com.enjoybt.mdriv_api..*Controller.*(..)) &&" + "args(request,..)")
//    public void authenticationPostApiKey(HttpServletRequest request) throws KeyAuthorizedException, SQLException {
//        String apiKey = request.getHeader("api_key");
//        authService.authenticationApiKey(apiKey);
//    }
}
