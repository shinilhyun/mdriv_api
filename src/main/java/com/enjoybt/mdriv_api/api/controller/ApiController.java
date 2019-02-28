package com.enjoybt.mdriv_api.api.controller;

import com.enjoybt.common.ResultMap;
import com.enjoybt.common.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/***
 *  api_key 인증 aop 처리 (AthenticationHandler)
 *    get  : api key 매개변수명  : apiKey
 *    post:  api key 매개변수   : HttpServletRequest request
 *
 *    controller exception 처리 필요 없음(aop 처리)
 */
@RestController
@RequestMapping("/api/")
public class ApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

    @PostMapping("test")
    public Map<String,Object> apiTest(HttpServletRequest request, @RequestBody Map<String, Object> message) {
        ResultMap result = ResultMap.getSuccessResultMap();
        result.setData(message);
        return result;
    }


    @GetMapping("test")
    public Map<String,Object> apiGetTest(@RequestParam(value = "api_key") String apiKey,
                                         @RequestParam(value = "str") String str) {
        ResultMap result = ResultMap.getSuccessResultMap();
        result.put(Constants.KEY_MSG, str);
        return result;
    }
}
