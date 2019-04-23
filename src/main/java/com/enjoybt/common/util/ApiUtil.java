package com.enjoybt.common.util;

import com.enjoybt.common.exception.BadParamException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * The type Api util.
 */
public class ApiUtil {

    /**
     * Gets offset.
     *
     * @param pageIndex  페이지 인덱스
     * @param schListCnt 자료 갯수 제한 (limit)
     * @return the offset
     * @throws BadParamException the bad param exception
     */
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

    /**
     * yyyyMMdd 형식의 날짜 String을 yyyy-MM-dd String으로 변환
     * @param yyyymmdd 형식의 String
     * @return yyyy-MM-dd 형식의 String
     * @throws BadParamException the bad param exception
     */
    public static String getHyphenDate(String yyyymmdd) throws BadParamException{

        String hyphenDate = null;
        if(!isDate(yyyymmdd)) throw new BadParamException("getHyphenDate");

        try {
            hyphenDate = yyyymmdd.substring(0, 4)
                + "-" + yyyymmdd.substring(4, 6)
                + "-" + yyyymmdd.substring(6, 8);
        } catch (Exception e) {
            throw new BadParamException("getHyphenDate", e);
        }
        return hyphenDate;
    }

    /**
     * 유효한 날짜인지 체크
     * @param str the str
     * @return the boolean
     */
    public static boolean isDate(String str){
        boolean b = true;
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd", java.util.Locale.KOREA);
        //SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss",Locale.KOREA); //20041102101244
        df.setLenient(false); // false 로 설정해야 엄밀한 해석을 함.
        try {
            Date dt = df.parse(str);
        }catch(ParseException pe){
            b = false;
        }catch(IllegalArgumentException ae){
            b = false;
        }
        return b;
    }
}
