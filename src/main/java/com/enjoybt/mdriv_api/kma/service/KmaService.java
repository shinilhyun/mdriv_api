package com.enjoybt.mdriv_api.kma.service;

import com.enjoybt.mdriv_api.kma.vo.SfcDyVO;
import com.enjoybt.mdriv_api.kma.vo.SfcHrVO;

import java.util.List;

/**
 * The interface Kma service.
 */
public interface KmaService {
    /**
     * kma 종관기상 일자료 가져오기
     *
     * @param startDt    시작날짜
     * @param endDt      종료날짜
     * @param stnIds     지점번호
     * @param schListCnt 검색limit
     * @param pageIndex  검색 offset
     * @return sfc dy
     * @throws Exception the exception
     */
    public List<SfcDyVO> getSfcDy(String startDt, String endDt, String stnIds, String schListCnt, String pageIndex) throws Exception;

    /**
     * KMA 종관기상 시간자료 가져오기
     *
     * @param tm         the tm
     * @param stnIds     the stn ids
     * @param schListCnt the sch list cnt
     * @param pageIndex  the page index
     * @return the sfc hr
     * @throws Exception the exception
     */
    public List<SfcHrVO> getSfcHr(String tm, String stnIds, String schListCnt, String pageIndex) throws Exception;
}
