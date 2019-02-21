package com.kuehnenagel.bitcoin.util;

import java.util.Scanner;

public class InputUtil {


    public static String askInputStr(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static Integer askInputInt(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
