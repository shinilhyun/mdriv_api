package com.enjoybt.common.aop;

import com.enjoybt.common.ResultMap;
import com.enjoybt.common.exception.KeyAuthorizedException;
import com.enjoybt.mdriv_api.api.service.ApiService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

@Component
@Aspect
public class AopHandler {

    private Logger LOGGER = LoggerFactory.getLogger(AopHandler.class);

    @Autowired
    ApiService apiService;

    @Before("execution(* com.enjoybt.mdriv_api.api..*Controller.*(..)) &&" + "args(apiKey,..)")
    public void authenticationApiKey(String apiKey) throws KeyAuthorizedException, SQLException {

        apiService.authenticationApiKey(apiKey);
    }

    @Before("execution(* com.enjoybt.mdriv_api.api..*Controller.*(..)) &&" + "args(request,..)")
    public void authenticationPostApiKey(HttpServletRequest request) throws KeyAuthorizedException, SQLException {
        String apiKey = request.getHeader("api_key");
        apiService.authenticationApiKey(apiKey);
    }

    @AfterThrowing(pointcut = "execution(* com.enjoybt.mdriv_api.api..*Controller.*(..))", throwing = "exceptObj")
    public Map<String,Object> ApiControllerException(JoinPoint jp, Exception exceptObj) {
        ResultMap result = new ResultMap();
        String method = jp.getSignature().getName();
        LOGGER.info(method + "() 메소드 수행 중 예외 발생!");

        if (exceptObj instanceof SQLException) {
            LOGGER.info("SQL 수행 중 예외 발생");
            result.setServerError();
        } else if (exceptObj instanceof KeyAuthorizedException) {
            LOGGER.info("API KEY 인증 실패");
            result.setUnAuthorized();
        } else {
            LOGGER.info("기타 예외 발생");
            result.setServerError();
        }

        return result;
    }
}
