package com.kuehnenagel.test.it;

import com.kuehnenagel.bitcoin.BitcoinApplication;
import com.kuehnenagel.bitcoin.bean.ResultCurrent;
import com.kuehnenagel.bitcoin.service.CurrentPriceServiceInter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = BitcoinApplication.class,properties = {"job.autorun.enabled=false"})
public class CurrentPriceIT {

    @Autowired
    CurrentPriceServiceInter currentPriceService;

    @Test
    public void getCurrentPrice(){
        ResultCurrent result = currentPriceService.getCurrentPrice("USD");
        Assert.assertNotNull("can not be null", result);
        Assert.assertEquals("must be USD","USD", result.getBpi().get("USD").getCode());
    }

}
