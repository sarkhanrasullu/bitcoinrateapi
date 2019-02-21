package com.kuehnenagel.bitcoin.service;

import com.kuehnenagel.bitcoin.bean.ResultCurrent;
import com.kuehnenagel.bitcoin.bean.ResultHistory;
import com.kuehnenagel.bitcoin.util.InputUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuServiceInter {

    @Autowired
    CurrentPriceServiceInter currentPriceService;

    @Autowired
    HistoryPriceServiceInter historyPriceService;


    @Override
    public void process() {
        int menu = InputUtil.askInputInt("Which one do you want to choose:" +
                "\n1.BPI real-time data" +
                "\n2.Historical BPI data");

        if(menu==1){
            String currCode = InputUtil.askInputStr("Please type currency code ex: USD, default is USD");
            ResultCurrent res = currentPriceService.getCurrentPrice(currCode);
            System.out.println(res);
        }else if(menu==2){
            String currCode = InputUtil.askInputStr("Please type currency code ex: USD, default is USD");
            String startDateStr = InputUtil.askInputStr("Please type start date ex: yyyy-MM-dd");
            String endDateStr = InputUtil.askInputStr("Please type currency code ex: yyyy-MM-dd");
            ResultHistory res = historyPriceService.getHistoryPrice(currCode, startDateStr, endDateStr);
            System.out.println(res);
        }
    }
}
