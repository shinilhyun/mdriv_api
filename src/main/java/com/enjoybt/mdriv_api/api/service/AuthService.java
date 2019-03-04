package com.enjoybt.mdriv_api.api.service;

import com.enjoybt.common.exception.KeyAuthorizedException;
import com.enjoybt.mdriv_api.api.vo.ApiVO;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * The interface Auth service.
 */
public interface AuthService {
    /**
     * api key db 조회
     *
     * @param apiKey the api key
     * @return the api 객체
     * @throws SQLException the sql exception
     */
    public ApiVO getApiInfo(String apiKey) throws SQLException;

    /**
     * api key 인증 실행
     *
     * @param apiKey the api key
     * @throws SQLException           the sql exception
     * @throws KeyAuthorizedException the key authorized exception
     */
    public void authenticationApiKey(String apiKey) throws SQLException, KeyAuthorizedException;

    /**
     * api key 인증 실행
     *
     * @param request the request (header 에 api_key 포함)
     * @throws SQLException           the sql exception
     * @throws KeyAuthorizedException the key authorized exception
     */
    public void authenticationApiKey(HttpServletRequest request) throws SQLException, KeyAuthorizedException;
}
