package com.enjoybt.mdriv_api.test.service.impl;

import com.enjoybt.common.dao.CommonDAO;
import com.enjoybt.mdriv_api.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);

    @Autowired
    CommonDAO commonDAO;

    @Override
    public String test() throws Exception {
        String result = null;
        try {
            result = (String)commonDAO.selectOne("test.test");
        } catch (Exception e) {
            LOGGER.info("TestService ERROR", e);
        }
        return result;
    }
}
