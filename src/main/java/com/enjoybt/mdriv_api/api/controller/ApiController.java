package com.enjoybt.mdriv_api.api.controller;

import com.enjoybt.common.ResultMap;
import com.enjoybt.common.constants.Constants;
import com.enjoybt.mdriv_api.api.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/***
 *  api_key 인증 aop 처리 (AthenticationHandler)
 *    get  : api key 매개변수 파라미터명  : apiKey 으로 할 것
 *    post:  매개변수에 HttpServletRequest request 필요
 *
 *    exception 처리 필요 없음(aop 처리)
 */
@RestController
@RequestMapping("/api/")
public class ApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

    @PostMapping("test")
    public Map<String,Object> apiTest(HttpServletRequest req, @RequestBody Map<String, Object> message) {
        ResultMap result = new ResultMap();
        result.put(Constants.KEY_DATA, message);
        result.setSuccess();

        return result;
    }


    @GetMapping("test")
    public Map<String,Object> apiGetTest(@RequestParam(value = "api_key") String apiKey,
                                         @RequestParam(value = "str") String str) {
        ResultMap result = new ResultMap();
        result.put(Constants.KEY_DATA, str);
        result.setSuccess();

        return result;
    }
}
