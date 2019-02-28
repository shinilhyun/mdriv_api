package com.enjoybt.mdriv_api.test.controller;

import com.enjoybt.common.ResultMap;
import com.enjoybt.mdriv_api.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Map<String, Object> test(@RequestParam("api_key") String apiKey) throws Exception {
        ResultMap result = ResultMap.getSuccessResultMap();
        result.setData(testService.test());
        return result;
    }
}
