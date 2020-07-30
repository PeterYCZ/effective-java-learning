package com.learning.chapter08.article50;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args){
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start,end);
        System.out.println(period.start() + " and " + period.end());
        end.setYear(78);

        System.out.println(period.start() + " and " + period.end());

        LocalDateTime start2 = LocalDateTime.of(2020,5,31,0,0);
        LocalDateTime end2 = LocalDateTime.now();
        Period2 period2 = new Period2(start2,end2);
        System.out.println(period2.start() + " and " + period2.end());
        end2 = end2.minusMonths(20);
        System.out.println(period2.start() + " and " + period2.end());
    }

}
