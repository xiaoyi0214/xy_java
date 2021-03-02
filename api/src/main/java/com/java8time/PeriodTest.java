package com.java8time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * Created on 2021/3/2.
 *
 * @author 小逸
 * @description
 */
public class PeriodTest {
    public static void main(String[] args) {
        LocalDate oneDay = LocalDate.of(2020, 12, 12);
        LocalDate now = LocalDate.now();
        Period between = Period.between( oneDay,now);
        System.out.println(between);
        System.out.println(between.get(ChronoUnit.YEARS));


    }
}
