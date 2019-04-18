package com.enjoybt.mdriv_api.api.controller;

import com.enjoybt.common.ResultMap;
import com.enjoybt.common.constants.Constants;
import com.enjoybt.mdriv_api.api.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Map;

/***
 *    controller exception 처리 필요 없음(aop 처리)
 */
@RestController
@RequestMapping("/api/")
public class ApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);
    @Autowired
    AuthService authService;

    @PostMapping("test")
    public Map<String,Object> apiTest(HttpServletRequest request, @RequestBody Map<String, Object> message) throws Exception {
        authService.authenticationApiKey(request);
        ResultMap result = ResultMap.getSuccessResultMap();
        result.setData(message);
        return result;
    }


    @GetMapping("test")
    public Map<String,Object> apiGetTest(@RequestParam(value = "apiKey") String apiKey,
                                         @RequestParam(value = "str") String str) throws Exception {
        authService.authenticationApiKey(apiKey);
        ResultMap result = ResultMap.getSuccessResultMap();
        result.put(Constants.KEY_MSG, str);
        return result;
    }
}
