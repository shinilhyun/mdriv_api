package com.enjoybt.mdriv_api.kma.controller;

import com.enjoybt.common.ResultMap;
import com.enjoybt.common.constants.Constants;
import com.enjoybt.common.exception.EmptyDataException;
import com.enjoybt.mdriv_api.api.service.AuthService;
import com.enjoybt.mdriv_api.kma.service.KmaService;
import com.enjoybt.mdriv_api.kma.vo.SfcDyVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/***
 *    controller exception 처리 필요 없음(aop 처리)
 */
@RestController
@RequestMapping("/api/kma/")
public class KmaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(KmaController.class);

    @Autowired
    AuthService authService;

    @Autowired
    KmaService kmaService;

    /**
     * SFC 일자료 API
     * @param apiKey
     * @param startDt       시작날짜 YYYYMMDD
     * @param endDt         종료날짜 YYYYMMDD
     * @param type          json/xml  기본값 : json
     * @param schListCnt    한 페이지 결과수   (생략시 모두조회)
     * @param pageIndex     조회데이터인덱스  (생략시 첫번째부터조회)
     * @param stnIds        지점번호     (생략시 모두조회)
     * @return
     * @throws Exception
     */
    @GetMapping("sfc/dy")
    public Map<String,Object> apiGetTest(@RequestParam(value = "apiKey") String apiKey,
                                         @RequestParam(value = "startDt") String startDt,
                                         @RequestParam(value = "endDt") String endDt,
                                         @RequestParam(value = "type", required = false, defaultValue = "json") String type,
                                         @RequestParam(value = "schListCnt", required = false, defaultValue = "100") String schListCnt,
                                         @RequestParam(value = "pageIndex", required = false, defaultValue = "1") String pageIndex,
                                         @RequestParam(value = "stnIds", required = false) String stnIds
                                         ) throws Exception {
        authService.authenticationApiKey(apiKey);
        ResultMap result = ResultMap.getSuccessResultMap();
        List<SfcDyVO> infoList = kmaService.getSfcDy(startDt, endDt, stnIds, schListCnt, pageIndex);
        result.setInfo(infoList);

        return result;
    }
}
