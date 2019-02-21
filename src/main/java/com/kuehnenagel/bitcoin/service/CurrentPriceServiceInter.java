package com.kuehnenagel.bitcoin.service;

import com.kuehnenagel.bitcoin.bean.ResultCurrent;

public interface CurrentPriceServiceInter {

    ResultCurrent getCurrentPrice(String currCode);
}
