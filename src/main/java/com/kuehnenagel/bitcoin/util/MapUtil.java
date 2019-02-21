package com.kuehnenagel.bitcoin.util;

import java.util.Map;
import java.util.Set;

public class MapUtil {


    public static String mapToStr(Map map){
        Set<Object> set = map.keySet();

        String str = "";
        for(Object key: set){
            str+=key+":"+map.get(key)+"\n";
        }

        return str;
    }
}
