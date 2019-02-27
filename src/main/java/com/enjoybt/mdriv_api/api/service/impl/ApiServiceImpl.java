package com.enjoybt.mdriv_api.api.service.impl;

import com.enjoybt.common.dao.CommonDAO;
import com.enjoybt.common.exception.KeyAuthorizedException;
import com.enjoybt.mdriv_api.api.service.ApiService;
import com.enjoybt.mdriv_api.api.vo.ApiVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class ApiServiceImpl implements ApiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiService.class);

    @Autowired
    CommonDAO commonDAO;

    @Override
    public ApiVO getApiInfo(String apiKey) throws SQLException {

        ApiVO apiVO = null;

        try {
            apiVO = (ApiVO)commonDAO.selectOne("api.selectApiInfo",apiKey);
        } catch (Exception e) {
            throw new SQLException("getApiInfo ERROR",e);
        }
        return apiVO;
    }

    @Override
    public void authenticationApiKey(String apiKey) throws SQLException, KeyAuthorizedException {
        ApiVO apiVO = null;
        try {
            apiVO = getApiInfo(apiKey);
            if (apiVO == null) {
                throw new KeyAuthorizedException("api key unauthorized");
            }
        } catch (SQLException se) {
            throw new SQLException("authenticationApiKey ERROR", se);
        }
    }
}
