package com.kuehnenagel.bitcoin.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kuehnenagel.bitcoin.util.MapUtil;

import java.util.Date;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultHistory {

    private Map<Date, Float> bpi;
    private String disclaimer;
    private Map<String, String> time;

    public Map<Date, Float> getBpi() {
        return bpi;
    }

    public void setBpi(Map<Date, Float> bpi) {
        this.bpi = bpi;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public Map<String, String> getTime() {
        return time;
    }

    public void setTime(Map<String, String> time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return  "--bpi--\n" + MapUtil.mapToStr(bpi) + "\n" +
                "\n\n--disclaimer--\n" + disclaimer + "\n" +
                "\n\n--time--\n" + MapUtil.mapToStr(time);
    }
}
