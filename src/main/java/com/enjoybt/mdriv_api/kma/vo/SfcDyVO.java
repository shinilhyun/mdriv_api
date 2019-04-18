package com.enjoybt.mdriv_api.kma.vo;

import java.math.BigDecimal;

public class SfcDyVO {
    private String tm; // '일시'
    private int stn_id; // '지점번호'
    private String stn_nm; // '지점 명'
    private BigDecimal avg_m1_5_te; // '1.5m 지중온도'
    private BigDecimal n9_9_rn; // '9-9강수'
    private BigDecimal min_ps; // '최저 해면기압'
    private BigDecimal avg_rhm; // '평균 상대습도'
    private String min_rhm_hrmt; // '평균 상대습도 시각'
    private BigDecimal max_ins_ws_wd; // '최대 순간 풍속 풍향'
    private BigDecimal avg_ts; // '평균 지면온도'
    private String max_ins_ws_hrmt; // '최대 순간풍속 시각'
    private String dd_mes_hrmt; // '일 최심적설 시각'
    private String max_ps_hrmt; // '최고 해면기압 시각'
    private BigDecimal avg_pv; // '평균 증기압'
    private BigDecimal min_rhm; // '최소 상대습도'
    private BigDecimal sum_ss_hr; // '합계 일조 시간'
    private BigDecimal ss_dur; // '가조시간'
    private BigDecimal avg_ps; // '평균 해면기압'
    private BigDecimal max_ws; // '최대 풍속'
    private BigDecimal avg_cm5_te; // '평균 5cm 지중온도'
    private BigDecimal min_tg; // '최저 초상온도'
    private BigDecimal max_ws_wd; // '최대 풍속 풍향'
    private BigDecimal sum_sml_ev; // '합계 소형증발량'
    private BigDecimal avg_tca; // '평균 전운량'
    private BigDecimal hr1_max_icsr; // '1시간 최다 일사량'
    private BigDecimal avg_td; // '평균 이슬점온도'
    private BigDecimal max_ps; // '최고 해면 기압'
    private BigDecimal avg_cm20_te; // '평균 20cm 지중온도'
    private BigDecimal dd_mes; // '일 최심적설'
    private BigDecimal min_ta; // '최저 기온'
    private String min_ps_hrmt; // '최저 해면기압 시각'
    private BigDecimal avg_m5_0_te; // '5.0m 지중온도'
    private BigDecimal max_ta; // '최고 기온'
    private BigDecimal hr24_sum_rws; // '풍정합'
    private BigDecimal avg_m3_0_te; // '3.0m 지중온도'
    private BigDecimal avg_cm10_te; // '평균10cm 지중온도'
    private BigDecimal avg_m0_5_te; // '0.5m 지중온도'
    private String hr1_max_icsr_hrmt; // '1시간 최다 일사량 시각'
    private BigDecimal max_ins_ws; // '최대 순간풍속'
    private BigDecimal avg_cm30_te; // '평균 30cm 지중온도'
    private BigDecimal avg_m1_0_te; // '1.0m 지중온도'
    private BigDecimal sum_gsr; // '합계 일사'
    private String max_ws_hrmt; // '최대 풍속 시각'
    private BigDecimal avg_pa; // '평균 현지기압'
    private BigDecimal avg_ws; // '평균 풍속'
    private String iscs; // '일기현상'
    private BigDecimal sum_fog_dur; // '안개 계속 시간'
    private BigDecimal sum_lrg_ev; // '합계 대형증발량'
    private BigDecimal sum_dpth_fhsc; // '합계 3시간 신적설'
    private BigDecimal dd_mefs; // '일 최심신적설'
    private String dd_mefs_hrmt; // '일 최심신적설 시각'
    private BigDecimal sum_rn; // '일강수량'
    private String hr1_max_rn_hrmt; // '1시간 최다 강수량 시각'
    private BigDecimal hr1_max_rn; // '1시간 최다강수량'
    private String mi10_max_rn_hrmt; // '10분 최다강수량 시각'
    private BigDecimal mi10_max_rn; // '10분 최다 강수량'
    private BigDecimal sum_rn_dur; // '누적강우 지속시간'
    private String max_ta_hrmt; // '최대기온 시간'
    private BigDecimal avg_ta; // '평균기온'
    private String min_ta_hrmt; // '최저기온시간'
    private BigDecimal avg_lmac; // '평균중하층운량'

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public int getStn_id() {
        return stn_id;
    }

    public void setStn_id(int stn_id) {
        this.stn_id = stn_id;
    }

    public String getStn_nm() {
        return stn_nm;
    }

    public void setStn_nm(String stn_nm) {
        this.stn_nm = stn_nm;
    }

    public BigDecimal getAvg_m1_5_te() {
        return avg_m1_5_te;
    }

    public void setAvg_m1_5_te(BigDecimal avg_m1_5_te) {
        this.avg_m1_5_te = avg_m1_5_te;
    }

    public BigDecimal getN9_9_rn() {
        return n9_9_rn;
    }

    public void setN9_9_rn(BigDecimal n9_9_rn) {
        this.n9_9_rn = n9_9_rn;
    }

    public BigDecimal getMin_ps() {
        return min_ps;
    }

    public void setMin_ps(BigDecimal min_ps) {
        this.min_ps = min_ps;
    }

    public BigDecimal getAvg_rhm() {
        return avg_rhm;
    }

    public void setAvg_rhm(BigDecimal avg_rhm) {
        this.avg_rhm = avg_rhm;
    }

    public String getMin_rhm_hrmt() {
        return min_rhm_hrmt;
    }

    public void setMin_rhm_hrmt(String min_rhm_hrmt) {
        this.min_rhm_hrmt = min_rhm_hrmt;
    }

    public BigDecimal getMax_ins_ws_wd() {
        return max_ins_ws_wd;
    }

    public void setMax_ins_ws_wd(BigDecimal max_ins_ws_wd) {
        this.max_ins_ws_wd = max_ins_ws_wd;
    }

    public BigDecimal getAvg_ts() {
        return avg_ts;
    }

    public void setAvg_ts(BigDecimal avg_ts) {
        this.avg_ts = avg_ts;
    }

    public String getMax_ins_ws_hrmt() {
        return max_ins_ws_hrmt;
    }

    public void setMax_ins_ws_hrmt(String max_ins_ws_hrmt) {
        this.max_ins_ws_hrmt = max_ins_ws_hrmt;
    }

    public String getDd_mes_hrmt() {
        return dd_mes_hrmt;
    }

    public void setDd_mes_hrmt(String dd_mes_hrmt) {
        this.dd_mes_hrmt = dd_mes_hrmt;
    }

    public String getMax_ps_hrmt() {
        return max_ps_hrmt;
    }

    public void setMax_ps_hrmt(String max_ps_hrmt) {
        this.max_ps_hrmt = max_ps_hrmt;
    }

    public BigDecimal getAvg_pv() {
        return avg_pv;
    }

    public void setAvg_pv(BigDecimal avg_pv) {
        this.avg_pv = avg_pv;
    }

    public BigDecimal getMin_rhm() {
        return min_rhm;
    }

    public void setMin_rhm(BigDecimal min_rhm) {
        this.min_rhm = min_rhm;
    }

    public BigDecimal getSum_ss_hr() {
        return sum_ss_hr;
    }

    public void setSum_ss_hr(BigDecimal sum_ss_hr) {
        this.sum_ss_hr = sum_ss_hr;
    }

    public BigDecimal getSs_dur() {
        return ss_dur;
    }

    public void setSs_dur(BigDecimal ss_dur) {
        this.ss_dur = ss_dur;
    }

    public BigDecimal getAvg_ps() {
        return avg_ps;
    }

    public void setAvg_ps(BigDecimal avg_ps) {
        this.avg_ps = avg_ps;
    }

    public BigDecimal getMax_ws() {
        return max_ws;
    }

    public void setMax_ws(BigDecimal max_ws) {
        this.max_ws = max_ws;
    }

    public BigDecimal getAvg_cm5_te() {
        return avg_cm5_te;
    }

    public void setAvg_cm5_te(BigDecimal avg_cm5_te) {
        this.avg_cm5_te = avg_cm5_te;
    }

    public BigDecimal getMin_tg() {
        return min_tg;
    }

    public void setMin_tg(BigDecimal min_tg) {
        this.min_tg = min_tg;
    }

    public BigDecimal getMax_ws_wd() {
        return max_ws_wd;
    }

    public void setMax_ws_wd(BigDecimal max_ws_wd) {
        this.max_ws_wd = max_ws_wd;
    }

    public BigDecimal getSum_sml_ev() {
        return sum_sml_ev;
    }

    public void setSum_sml_ev(BigDecimal sum_sml_ev) {
        this.sum_sml_ev = sum_sml_ev;
    }

    public BigDecimal getAvg_tca() {
        return avg_tca;
    }

    public void setAvg_tca(BigDecimal avg_tca) {
        this.avg_tca = avg_tca;
    }

    public BigDecimal getHr1_max_icsr() {
        return hr1_max_icsr;
    }

    public void setHr1_max_icsr(BigDecimal hr1_max_icsr) {
        this.hr1_max_icsr = hr1_max_icsr;
    }

    public BigDecimal getAvg_td() {
        return avg_td;
    }

    public void setAvg_td(BigDecimal avg_td) {
        this.avg_td = avg_td;
    }

    public BigDecimal getMax_ps() {
        return max_ps;
    }

    public void setMax_ps(BigDecimal max_ps) {
        this.max_ps = max_ps;
    }

    public BigDecimal getAvg_cm20_te() {
        return avg_cm20_te;
    }

    public void setAvg_cm20_te(BigDecimal avg_cm20_te) {
        this.avg_cm20_te = avg_cm20_te;
    }

    public BigDecimal getDd_mes() {
        return dd_mes;
    }

    public void setDd_mes(BigDecimal dd_mes) {
        this.dd_mes = dd_mes;
    }

    public BigDecimal getMin_ta() {
        return min_ta;
    }

    public void setMin_ta(BigDecimal min_ta) {
        this.min_ta = min_ta;
    }

    public String getMin_ps_hrmt() {
        return min_ps_hrmt;
    }

    public void setMin_ps_hrmt(String min_ps_hrmt) {
        this.min_ps_hrmt = min_ps_hrmt;
    }

    public BigDecimal getAvg_m5_0_te() {
        return avg_m5_0_te;
    }

    public void setAvg_m5_0_te(BigDecimal avg_m5_0_te) {
        this.avg_m5_0_te = avg_m5_0_te;
    }

    public BigDecimal getMax_ta() {
        return max_ta;
    }

    public void setMax_ta(BigDecimal max_ta) {
        this.max_ta = max_ta;
    }

    public BigDecimal getHr24_sum_rws() {
        return hr24_sum_rws;
    }

    public void setHr24_sum_rws(BigDecimal hr24_sum_rws) {
        this.hr24_sum_rws = hr24_sum_rws;
    }

    public BigDecimal getAvg_m3_0_te() {
        return avg_m3_0_te;
    }

    public void setAvg_m3_0_te(BigDecimal avg_m3_0_te) {
        this.avg_m3_0_te = avg_m3_0_te;
    }

    public BigDecimal getAvg_cm10_te() {
        return avg_cm10_te;
    }

    public void setAvg_cm10_te(BigDecimal avg_cm10_te) {
        this.avg_cm10_te = avg_cm10_te;
    }

    public BigDecimal getAvg_m0_5_te() {
        return avg_m0_5_te;
    }

    public void setAvg_m0_5_te(BigDecimal avg_m0_5_te) {
        this.avg_m0_5_te = avg_m0_5_te;
    }

    public String getHr1_max_icsr_hrmt() {
        return hr1_max_icsr_hrmt;
    }

    public void setHr1_max_icsr_hrmt(String hr1_max_icsr_hrmt) {
        this.hr1_max_icsr_hrmt = hr1_max_icsr_hrmt;
    }

    public BigDecimal getMax_ins_ws() {
        return max_ins_ws;
    }

    public void setMax_ins_ws(BigDecimal max_ins_ws) {
        this.max_ins_ws = max_ins_ws;
    }

    public BigDecimal getAvg_cm30_te() {
        return avg_cm30_te;
    }

    public void setAvg_cm30_te(BigDecimal avg_cm30_te) {
        this.avg_cm30_te = avg_cm30_te;
    }

    public BigDecimal getAvg_m1_0_te() {
        return avg_m1_0_te;
    }

    public void setAvg_m1_0_te(BigDecimal avg_m1_0_te) {
        this.avg_m1_0_te = avg_m1_0_te;
    }

    public BigDecimal getSum_gsr() {
        return sum_gsr;
    }

    public void setSum_gsr(BigDecimal sum_gsr) {
        this.sum_gsr = sum_gsr;
    }

    public String getMax_ws_hrmt() {
        return max_ws_hrmt;
    }

    public void setMax_ws_hrmt(String max_ws_hrmt) {
        this.max_ws_hrmt = max_ws_hrmt;
    }

    public BigDecimal getAvg_pa() {
        return avg_pa;
    }

    public void setAvg_pa(BigDecimal avg_pa) {
        this.avg_pa = avg_pa;
    }

    public BigDecimal getAvg_ws() {
        return avg_ws;
    }

    public void setAvg_ws(BigDecimal avg_ws) {
        this.avg_ws = avg_ws;
    }

    public String getIscs() {
        return iscs;
    }

    public void setIscs(String iscs) {
        this.iscs = iscs;
    }

    public BigDecimal getSum_fog_dur() {
        return sum_fog_dur;
    }

    public void setSum_fog_dur(BigDecimal sum_fog_dur) {
        this.sum_fog_dur = sum_fog_dur;
    }

    public BigDecimal getSum_lrg_ev() {
        return sum_lrg_ev;
    }

    public void setSum_lrg_ev(BigDecimal sum_lrg_ev) {
        this.sum_lrg_ev = sum_lrg_ev;
    }

    public BigDecimal getSum_dpth_fhsc() {
        return sum_dpth_fhsc;
    }

    public void setSum_dpth_fhsc(BigDecimal sum_dpth_fhsc) {
        this.sum_dpth_fhsc = sum_dpth_fhsc;
    }

    public BigDecimal getDd_mefs() {
        return dd_mefs;
    }

    public void setDd_mefs(BigDecimal dd_mefs) {
        this.dd_mefs = dd_mefs;
    }

    public String getDd_mefs_hrmt() {
        return dd_mefs_hrmt;
    }

    public void setDd_mefs_hrmt(String dd_mefs_hrmt) {
        this.dd_mefs_hrmt = dd_mefs_hrmt;
    }

    public BigDecimal getSum_rn() {
        return sum_rn;
    }

    public void setSum_rn(BigDecimal sum_rn) {
        this.sum_rn = sum_rn;
    }

    public String getHr1_max_rn_hrmt() {
        return hr1_max_rn_hrmt;
    }

    public void setHr1_max_rn_hrmt(String hr1_max_rn_hrmt) {
        this.hr1_max_rn_hrmt = hr1_max_rn_hrmt;
    }

    public BigDecimal getHr1_max_rn() {
        return hr1_max_rn;
    }

    public void setHr1_max_rn(BigDecimal hr1_max_rn) {
        this.hr1_max_rn = hr1_max_rn;
    }

    public String getMi10_max_rn_hrmt() {
        return mi10_max_rn_hrmt;
    }

    public void setMi10_max_rn_hrmt(String mi10_max_rn_hrmt) {
        this.mi10_max_rn_hrmt = mi10_max_rn_hrmt;
    }

    public BigDecimal getMi10_max_rn() {
        return mi10_max_rn;
    }

    public void setMi10_max_rn(BigDecimal mi10_max_rn) {
        this.mi10_max_rn = mi10_max_rn;
    }

    public BigDecimal getSum_rn_dur() {
        return sum_rn_dur;
    }

    public void setSum_rn_dur(BigDecimal sum_rn_dur) {
        this.sum_rn_dur = sum_rn_dur;
    }

    public String getMax_ta_hrmt() {
        return max_ta_hrmt;
    }

    public void setMax_ta_hrmt(String max_ta_hrmt) {
        this.max_ta_hrmt = max_ta_hrmt;
    }

    public BigDecimal getAvg_ta() {
        return avg_ta;
    }

    public void setAvg_ta(BigDecimal avg_ta) {
        this.avg_ta = avg_ta;
    }

    public String getMin_ta_hrmt() {
        return min_ta_hrmt;
    }

    public void setMin_ta_hrmt(String min_ta_hrmt) {
        this.min_ta_hrmt = min_ta_hrmt;
    }

    public BigDecimal getAvg_lmac() {
        return avg_lmac;
    }

    public void setAvg_lmac(BigDecimal avg_lmac) {
        this.avg_lmac = avg_lmac;
    }
}