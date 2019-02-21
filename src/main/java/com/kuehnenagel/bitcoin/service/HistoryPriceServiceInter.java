package com.kuehnenagel.bitcoin.service;

import com.kuehnenagel.bitcoin.bean.ResultCurrent;
import com.kuehnenagel.bitcoin.bean.ResultHistory;

public interface HistoryPriceServiceInter {

    ResultHistory getHistoryPrice(String curr, String start, String end);
}
