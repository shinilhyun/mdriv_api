package com.enjoybt.common.util;

import com.enjoybt.common.exception.BadParamException;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class ApiUtil {

    public static String getOffset(String pageIndex, String schListCnt) throws BadParamException {
        String result = null;
        if (Objects.isNull(pageIndex) || Objects.isNull(schListCnt)) {
            return null;
        }
        try {
            int index = Integer.parseInt(pageIndex);
            int row = Integer.parseInt(schListCnt);
            if(index <= 0) index = 1;
            int resultInt = row * (index - 1);
            result = String.valueOf(resultInt);
        } catch (Exception e) {
            throw new BadParamException("getOffset", e);
        }
        return result;
    }

    public static String getHyphenDate(String yyyymmdd) throws BadParamException{
        String hyphenDate = null;
        try {
            hyphenDate = yyyymmdd.substring(0, 4)
                + "-" + yyyymmdd.substring(4, 6)
                + "-" + yyyymmdd.substring(6, 8);
        } catch (Exception e) {
            throw new BadParamException("getHyphenDate", e);
        }
        return hyphenDate;
    }
}
