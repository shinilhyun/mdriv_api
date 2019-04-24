package com.enjoybt.mdriv_api.kma.service.impl;

import com.enjoybt.common.dao.CommonDAO;
import com.enjoybt.common.exception.BadParamException;
import com.enjoybt.common.exception.EmptyDataException;
import com.enjoybt.common.util.ApiUtil;
import com.enjoybt.mdriv_api.kma.service.KmaService;
import com.enjoybt.mdriv_api.kma.vo.SfcDyVO;
import com.enjoybt.mdriv_api.kma.vo.SfcHrVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class KmaServiceImpl implements KmaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KmaService.class);

    @Autowired
    CommonDAO commonDAO;

    @Override
    public List<SfcDyVO> getSfcDy(String startDt, String endDt, String stnIds, String schListCnt, String pageIndex)
        throws Exception {

        List<SfcDyVO> resultList;
        Map<String, Object> params = new HashMap<>();

        try {
            String offset = ApiUtil.getOffset(pageIndex, schListCnt);
            String startDate = ApiUtil.getHyphenDate(startDt);
            String endDate = ApiUtil.getHyphenDate(endDt);

            params.put("start_dt", startDate);
            params.put("end_dt", endDate);
            params.put("stn_id", stnIds);
            params.put("offset", offset);
            params.put("limit", schListCnt);

            resultList = commonDAO.selectList("kma.selectSfcDy", params);
        } catch (SQLException se) {
            throw new SQLException("SQL ERROR", se);
        } catch (BadParamException be) {
            throw new BadParamException(be);
        }
        if (resultList.isEmpty()) throw new EmptyDataException();

        return resultList;
    }

    @Override
    public List<SfcHrVO> getSfcHr(String tm, String stnIds, String schListCnt, String pageIndex) throws Exception {
        List<SfcHrVO> resultList;
        Map<String, Object> params = new HashMap<>();

        try {
            String offset = ApiUtil.getOffset(pageIndex, schListCnt);
            String targetDate = ApiUtil.getHyphenDate(tm);
            if(StringUtils.isEmpty(stnIds)) throw new BadParamException();
            params.put("target_date", targetDate);
            params.put("stn_id", stnIds);
            params.put("offset", offset);
            params.put("limit", schListCnt);
            resultList = commonDAO.selectList("kma.selectSfcHr", params);
        } catch (SQLException se) {
            throw new SQLException("SQL ERROR", se);
        } catch (BadParamException be) {
            throw new BadParamException(be);
        }
        if (resultList.isEmpty()) throw new EmptyDataException();
        return resultList;
    }
}
