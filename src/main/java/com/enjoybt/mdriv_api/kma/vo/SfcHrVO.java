package com.enjoybt.mdriv_api.kma.vo;

import java.math.BigDecimal;

public class SfcHrVO {
    private String tm; // 일시
    private int stn_id; // 지점 번호
    private BigDecimal m0_3_te; // 30cm 지중온도
    private BigDecimal m0_2_te; // 20cm 지중온도
    private BigDecimal m0_1_te; // 10cm 지중온도
    private BigDecimal m0_05_te; // 5cm 지중온도
    private BigDecimal ts; // 지면온도
    private String dmst_mtph_no; // 현상번호
    private String gnd_stt_cd; // 지면상태
    private String vs; // 시정
    private int lcs_ch; // 최저운고
    private String clfm_abbr_cd; // 운형
    private BigDecimal dc10_lmcs_ca; // 중하층운량
    private BigDecimal dc10_tca; // 전운량
    private BigDecimal hr3_fhsc; // 3시간신적설
    private BigDecimal dsnw; // 적설
    private BigDecimal icsr; // 일사
    private BigDecimal ss; // 일조
    private BigDecimal ps; // 해면기압
    private BigDecimal pa; // 현지기압
    private BigDecimal td; // 이슬점온도
    private BigDecimal pv; // 증기압
    private BigDecimal hm; // 습도
    private int wd; // 풍향
    private BigDecimal ws; // 풍속
    private BigDecimal rn; // 강수량
    private BigDecimal ta; // 기온

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

    public BigDecimal getM0_3_te() {
        return m0_3_te;
    }

    public void setM0_3_te(BigDecimal m0_3_te) {
        this.m0_3_te = m0_3_te;
    }

    public BigDecimal getM0_2_te() {
        return m0_2_te;
    }

    public void setM0_2_te(BigDecimal m0_2_te) {
        this.m0_2_te = m0_2_te;
    }

    public BigDecimal getM0_1_te() {
        return m0_1_te;
    }

    public void setM0_1_te(BigDecimal m0_1_te) {
        this.m0_1_te = m0_1_te;
    }

    public BigDecimal getM0_05_te() {
        return m0_05_te;
    }

    public void setM0_05_te(BigDecimal m0_05_te) {
        this.m0_05_te = m0_05_te;
    }

    public BigDecimal getTs() {
        return ts;
    }

    public void setTs(BigDecimal ts) {
        this.ts = ts;
    }

    public String getDmst_mtph_no() {
        return dmst_mtph_no;
    }

    public void setDmst_mtph_no(String dmst_mtph_no) {
        this.dmst_mtph_no = dmst_mtph_no;
    }

    public String getGnd_stt_cd() {
        return gnd_stt_cd;
    }

    public void setGnd_stt_cd(String gnd_stt_cd) {
        this.gnd_stt_cd = gnd_stt_cd;
    }

    public String getVs() {
        return vs;
    }

    public void setVs(String vs) {
        this.vs = vs;
    }

    public int getLcs_ch() {
        return lcs_ch;
    }

    public void setLcs_ch(int lcs_ch) {
        this.lcs_ch = lcs_ch;
    }

    public String getClfm_abbr_cd() {
        return clfm_abbr_cd;
    }

    public void setClfm_abbr_cd(String clfm_abbr_cd) {
        this.clfm_abbr_cd = clfm_abbr_cd;
    }

    public BigDecimal getDc10_lmcs_ca() {
        return dc10_lmcs_ca;
    }

    public void setDc10_lmcs_ca(BigDecimal dc10_lmcs_ca) {
        this.dc10_lmcs_ca = dc10_lmcs_ca;
    }

    public BigDecimal getDc10_tca() {
        return dc10_tca;
    }

    public void setDc10_tca(BigDecimal dc10_tca) {
        this.dc10_tca = dc10_tca;
    }

    public BigDecimal getHr3_fhsc() {
        return hr3_fhsc;
    }

    public void setHr3_fhsc(BigDecimal hr3_fhsc) {
        this.hr3_fhsc = hr3_fhsc;
    }

    public BigDecimal getDsnw() {
        return dsnw;
    }

    public void setDsnw(BigDecimal dsnw) {
        this.dsnw = dsnw;
    }

    public BigDecimal getIcsr() {
        return icsr;
    }

    public void setIcsr(BigDecimal icsr) {
        this.icsr = icsr;
    }

    public BigDecimal getSs() {
        return ss;
    }

    public void setSs(BigDecimal ss) {
        this.ss = ss;
    }

    public BigDecimal getPs() {
        return ps;
    }

    public void setPs(BigDecimal ps) {
        this.ps = ps;
    }

    public BigDecimal getPa() {
        return pa;
    }

    public void setPa(BigDecimal pa) {
        this.pa = pa;
    }

    public BigDecimal getTd() {
        return td;
    }

    public void setTd(BigDecimal td) {
        this.td = td;
    }

    public BigDecimal getPv() {
        return pv;
    }

    public void setPv(BigDecimal pv) {
        this.pv = pv;
    }

    public BigDecimal getHm() {
        return hm;
    }

    public void setHm(BigDecimal hm) {
        this.hm = hm;
    }

    public int getWd() {
        return wd;
    }

    public void setWd(int wd) {
        this.wd = wd;
    }

    public BigDecimal getWs() {
        return ws;
    }

    public void setWs(BigDecimal ws) {
        this.ws = ws;
    }

    public BigDecimal getRn() {
        return rn;
    }

    public void setRn(BigDecimal rn) {
        this.rn = rn;
    }

    public BigDecimal getTa() {
        return ta;
    }

    public void setTa(BigDecimal ta) {
        this.ta = ta;
    }
}

