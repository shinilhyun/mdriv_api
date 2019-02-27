package com.enjoybt.mdriv_api.api.service;

import com.enjoybt.common.exception.KeyAuthorizedException;
import com.enjoybt.mdriv_api.api.vo.ApiVO;

import java.sql.SQLException;

public interface ApiService {
    public ApiVO getApiInfo(String apiKey) throws SQLException;

    public void authenticationApiKey(String apiKey) throws SecurityException, SQLException, KeyAuthorizedException;
}
