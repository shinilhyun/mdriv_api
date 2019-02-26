package com.enjoybt.mdriv_api.api.vo;

public class ApiVO {

    private Double api_sn = null;
    private String user_id = null;
    private String api_key = null;
    private String api_status = null;
    private String purpose = null;

    public Double getApi_sn() {
        return api_sn;
    }

    public void setApi_sn(Double api_sn) {
        this.api_sn = api_sn;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getApi_status() {
        return api_status;
    }

    public void setApi_status(String api_status) {
        this.api_status = api_status;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
