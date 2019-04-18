package com.enjoybt.common;

import com.enjoybt.common.constants.Constants;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ResultMap extends LinkedHashMap<String, Object> {

    public static ResultMap getSuccessResultMap() {
        ResultMap result = new ResultMap();
        result.setSuccess();
        return result;
    }

    public void setSuccess() {
        this.put(Constants.KEY_RESULT, Constants.VALUE_RESULT_SUCCESS);
    }

    public void setFailure() {
        this.reset();
        this.put(Constants.KEY_RESULT, Constants.VALUE_RESULT_FAILURE);
    }

    public void setUnAuthorized() {
        this.setFailure();
        this.put(Constants.KEY_RESPONSE_CODE, Constants.VALUE_CODE_UNAUTHORIZED);
        this.put(Constants.KEY_ERROR_MSG, Constants.VALUE_MSG_UNAUTHORIZED);

    }

    public void setServerError() {
        this.setFailure();
        this.put(Constants.KEY_RESPONSE_CODE, Constants.VALUE_CODE_SERVER_ERROR);
        this.put(Constants.KEY_ERROR_MSG, Constants.VALUE_MSG_SERVER_ERROR);
    }

    public void setForbidden(){
        this.setFailure();
        this.put(Constants.KEY_RESPONSE_CODE, Constants.VALUE_CODE_FORBIDDEN);
        this.put(Constants.KEY_ERROR_MSG, Constants.VALUE_MSG_FORBIDDEN);
    }

    public void setNotFound(){
        this.setFailure();
        this.put(Constants.KEY_RESPONSE_CODE, Constants.VALUE_CODE_NOTFOUND);
        this.put(Constants.KEY_ERROR_MSG, Constants.VALUE_MSG_NOTFOUND);
    }

    public void setEmptyData(){
        this.setFailure();
        this.put(Constants.KEY_RESPONSE_CODE, Constants.VALUE_CODE_EMPTYDATA);
        this.put(Constants.KEY_ERROR_MSG, Constants.VALUE_MSG_EMPTYDATA);
    }

    public void setBadRequest(){
        this.setFailure();
        this.put(Constants.KEY_RESPONSE_CODE, Constants.VALUE_CODE_BAD_REQUEST);
        this.put(Constants.KEY_ERROR_MSG, Constants.VALUE_MSG_BAD_REQUEST);
    }

    public void setBadParam(){
        this.setFailure();
        this.put(Constants.KEY_RESPONSE_CODE, Constants.VALUE_CODE_BADPARAM);
        this.put(Constants.KEY_ERROR_MSG, Constants.VALUE_MSG_BADPARAM);
    }




    public void setData(Map<?, ?> data) {
        this.put(Constants.KEY_DATA, data);
    }
    public void setData(String data) {
        this.put(Constants.KEY_DATA, data);
    }
    public void setList(List<?> list) {
        this.put(Constants.KEY_LIST, list);
    }

    public void setInfo(List<?> list) {
        this.put("INFO", list);
    }

    public void reset() {
        this.clear();
    }
}
