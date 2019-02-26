package com.enjoybt.mdriv_api.api.controller;

import com.enjoybt.common.constants.Constants;
import com.enjoybt.mdriv_api.api.service.ApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/***
 *  api_key 인증 aop 처리 (AthenticationHandler)
 *    매개변수 0번째 파라미터는 api key 정보 가지고 있는 매개변수
 *    get : String apiKey
 *    post : api_key 정보 가지고 있는 HttpServletRequest
 */
@RestController
@RequestMapping("/api/")
public class ApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    ApiService apiService;

    @PostMapping("test")
    public Map<String,Object> apiTest(HttpServletRequest req, @RequestBody Map<String, Object> message) {
        Map<String, Object> result = new HashMap<>();

        try {
            result.put(Constants.KEY_RESULT, Constants.VALUE_RESULT_SUCCESS);
            result.put(Constants.KEY_DATA, message);

        } catch (SecurityException se) {
            LOGGER.info("api key is suck!!", se);
            result.put(Constants.KEY_RESULT, Constants.VALUE_RESULT_FAILURE);
        } catch (Exception e) {
            LOGGER.info("apiTest ERROR", e);
            result.put(Constants.KEY_RESULT, Constants.VALUE_RESULT_FAILURE);
        }

        return result;
    }


    @GetMapping("test")
    public Map<String,Object> apiGetTest(@RequestParam(value = "api_key") String apiKey,
                                         @RequestParam(value = "str") String str) {
        Map<String, Object> result = new HashMap<>();

        try {
            result.put(Constants.KEY_RESULT, Constants.VALUE_RESULT_SUCCESS);
            result.put(Constants.KEY_DATA, str);

        } catch (SecurityException se) {
            LOGGER.info("api key is suck!!", se);
            result.put(Constants.KEY_RESULT, Constants.VALUE_RESULT_FAILURE);
        } catch (Exception e) {
            LOGGER.info("apiTest ERROR", e);
            result.put(Constants.KEY_RESULT, Constants.VALUE_RESULT_FAILURE);
        }

        return result;
    }
}
