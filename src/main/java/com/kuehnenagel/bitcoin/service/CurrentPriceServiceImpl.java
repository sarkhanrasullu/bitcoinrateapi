package com.kuehnenagel.bitcoin.service;

import com.kuehnenagel.bitcoin.bean.ResultCurrent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrentPriceServiceImpl implements CurrentPriceServiceInter {

    @Autowired
    RestTemplate restTemplate;

    private final String endPoint = "https://api.coindesk.com/v1/bpi/currentprice/{CURR_CODE}.json";

    @Override
    public ResultCurrent getCurrentPrice(String currCode) {

        currCode = currCode==null || currCode.trim().isEmpty()? "":"/"+currCode;
        String endPointTemp = endPoint.replace("/{CURR_CODE}",currCode);
        System.out.println(endPointTemp);
        ResultCurrent res = restTemplate.getForObject(endPointTemp, ResultCurrent.class);
        return res;
    }
}
