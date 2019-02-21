package com.kuehnenagel.bitcoin.service;

import com.kuehnenagel.bitcoin.bean.ResultHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HistoryPriceServiceImpl implements HistoryPriceServiceInter {

    @Autowired
    RestTemplate restTemplate;

    private final String endPoint = "https://api.coindesk.com/v1/bpi/historical/close.json?";


    @Override
    public ResultHistory getHistoryPrice(String curr, String start, String end) {
        String temp = endPoint;

        if(curr!=null && !curr.trim().isEmpty()){
            temp+="&currency={CURR_CODE}";
        }

        if(start!=null && !start.trim().isEmpty()){
            temp+="&start={START_DT}";
        }

        if(end!=null && !end.trim().isEmpty()){
            temp+="&end={END_DT}";
        }

        temp = temp
                .replace("{CURR_CODE}",curr)
                .replace("{START_DT}",start)
                .replace("{END_DT}",end);
        System.out.println(temp);
        ResultHistory res = restTemplate.getForObject(temp, ResultHistory.class);
        return res;
    }
}
