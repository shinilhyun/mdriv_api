package com.enjoybt.mdriv_api.kma.controller;

import com.enjoybt.common.ResultMap;
import com.enjoybt.common.constants.Constants;
import com.enjoybt.common.exception.EmptyDataException;
import com.enjoybt.mdriv_api.api.service.AuthService;
import com.enjoybt.mdriv_api.kma.service.KmaService;
import com.enjoybt.mdriv_api.kma.vo.SfcDyVO;
import com.enjoybt.mdriv_api.kma.vo.SfcHrVO;
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

    /**
     * The Auth service.
     */
    @Autowired
    AuthService authService;

    /**
     * The Kma service.
     */
    @Autowired
    KmaService kmaService;

    /**
     * SFC 일자료 API
     *
     * @param apiKey     the api key
     * @param startDt    시작날짜 YYYYMMDD
     * @param endDt      종료날짜 YYYYMMDD
     * @param type       json/xml  기본값 : json
     * @param schListCnt 한 페이지 결과수   (생략시 모두조회)
     * @param pageIndex  조회데이터인덱스  (생략시 첫번째부터조회)
     * @param stnIds     지점번호     (생략시 모두조회)
     * @return kma sfc dy
     * @throws Exception the exception
     */
    @GetMapping("sfc/dy")
    public Map<String,Object> getKmaSfcDy(@RequestParam(value = "apiKey") String apiKey,
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

    /**
     * 종관기상 시간자료
     *
     * @param apiKey     the api key
     * @param tm         조회 날짜 yyyyMMdd
     * @param stnIds     지점번호
     * @param type       (json/xml) default : json
     * @param schListCnt 조회 갯수 지정
     * @param pageIndex  조회 페이지 설정
     * @return the kma sfc hr
     * @throws Exception the exception
     */
    @GetMapping("sfc/hr")
    public Map<String, Object> getKmaSfcHr(@RequestParam(value= "apiKey") String apiKey,
                                           @RequestParam(value = "tm") String tm,
                                           @RequestParam(value = "stnIds") String stnIds,
                                           @RequestParam(value = "type", required = false, defaultValue = "json") String type,
                                           @RequestParam(value = "schListCnt", required = false, defaultValue = "100") String schListCnt,
                                           @RequestParam(value = "pageIndex", required = false, defaultValue = "1") String pageIndex
                                           ) throws Exception{
        authService.authenticationApiKey(apiKey);
        ResultMap result = ResultMap.getSuccessResultMap();
        List<SfcHrVO> infoList = kmaService.getSfcHr(tm, stnIds, schListCnt, pageIndex);
        result.setInfo(infoList);

        return result;
    }
}
