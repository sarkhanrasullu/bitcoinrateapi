package com.kuehnenagel.test;

import com.kuehnenagel.bitcoin.BitcoinApplication;
import com.kuehnenagel.bitcoin.bean.ResultHistory;
import com.kuehnenagel.bitcoin.service.HistoryPriceServiceInter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = BitcoinApplication.class,properties = {"job.autorun.enabled=false"})
public class HistoryPriceTest {

    @Autowired
    HistoryPriceServiceInter historyPriceService;

    @Test
    public void getCurrentPrice(){
        ResultHistory result = historyPriceService.getHistoryPrice("USD","2013-03-01","2013-03-05");
        Assert.assertNotNull("can not be null", result);
    }

}
