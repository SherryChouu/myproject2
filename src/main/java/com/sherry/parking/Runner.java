package com.sherry.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "11:20";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm")
        //Exception例外 vs Error錯誤
        Date d = null;
        try {
            d = sdf.parse(enterTime);
        } catch (Exception e) {
            System.out.println("wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        //long ms = 3 * 60 * 60 * 1000;
        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            long ms = d2.getTime() - d.getTime();
            int minutes = (int)ms/(1000*60);
            System.out.println("total minutes: "+minutes);
            int hours = (minutes)/60;
            System.out.println("hours:" + hours);
            int diff = minutes%60;
            System.out.println("minutes: " +diff);
            int fee = hours*30;
            int fee2 = hours*30;

            if(diff >= 15){
                fee +=30;
            }
            System.out.println("first fee: " + fee);

            if(diff >= 15 && diff <=30){
                fee2 +=15;
            }
            System.out.println("second fee: " + fee2);

        } catch (Exception e) {
            System.out.println("exit wrong format");
        }
    }
}
