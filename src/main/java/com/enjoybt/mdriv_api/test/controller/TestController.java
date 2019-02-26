package com.enjoybt.mdriv_api.test.controller;

import com.enjoybt.common.constants.Constants;
import com.enjoybt.mdriv_api.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    TestService testService;

    @GetMapping("/")
    public String hello() {
        return "home";
    }

    @GetMapping("/test.do")
    @ResponseBody
    public Map<String, Object> test() {
        Map<String, Object> result = new HashMap<>();
        try {
            String data = testService.test();
            result.put(Constants.KEY_RESULT, Constants.VALUE_RESULT_SUCCESS);
            result.put(Constants.KEY_DATA, data);
        } catch (Exception e) {
            LOGGER.info("test ERROR", e);
            result.put(Constants.KEY_RESULT, Constants.VALUE_RESULT_FAILURE);
        }
        return result;
    }
}
