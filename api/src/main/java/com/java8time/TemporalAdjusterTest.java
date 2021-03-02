package com.java8time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created on 2021/3/2.
 *
 * @author 小逸
 * @description
 */
public class TemporalAdjusterTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // 调整至本月第一天
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();
        LocalDate localDate = now.with(temporalAdjuster);
        System.out.println(localDate);

        // 调整至下周末
        TemporalAdjuster temporalAdjuster1 = TemporalAdjusters.next(DayOfWeek.SUNDAY);
        System.out.println(now.with(temporalAdjuster1));

        // 调整至下一工作日
        LocalDate with = now.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal nowDate) {
                LocalDate localDateTime = (LocalDate) nowDate;
                if (localDateTime.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                    return localDateTime.plusDays(3);
                } else if (localDateTime.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                    return localDateTime.plusDays(2);
                } else {
                    return localDateTime.plusDays(1);
                }
            }
        });
        System.out.println(with);
    }


}
