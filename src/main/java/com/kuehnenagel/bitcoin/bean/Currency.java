package com.kuehnenagel.bitcoin.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {
    private String code;
    private String description;
    private String rate;//in api it described as String so I declared it as String
    private Float rate_float;
    private String symbol;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Float getRate_float() {
        return rate_float;
    }

    public void setRate_float(Float rate_float) {
        this.rate_float = rate_float;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return
                "code:" + code + "\n" +
                "description:" + description + "\n" +
                "rate:" + rate + "\n" +
                "rate_float:" + rate_float + "\n"+
                "symbol:" + symbol ;
    }
}
