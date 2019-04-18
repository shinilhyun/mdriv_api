package com.enjoybt.mdriv_api.kma.service;

import com.enjoybt.mdriv_api.kma.vo.SfcDyVO;

import java.util.List;

public interface KmaService {
    /**
     * kma 종관기상 일자료 가져오기
     * @param startDt       시작날짜
     * @param endDt         종료날짜
     * @param stnIds        지점번호
     * @param schListCnt    검색limit
     * @param pageIndex     검색 offset
     * @return
     * @throws Exception
     */
    public List<SfcDyVO> getSfcDy(String startDt, String endDt, String stnIds, String schListCnt, String pageIndex) throws Exception;
}
