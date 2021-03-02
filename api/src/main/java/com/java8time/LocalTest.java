package com.java8time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

/**
 * Created on 2021/3/2.
 *
 * @author 小逸
 * @description
 */
public class LocalTest {
    public static void main(String[] args) {
//        LocalTest.testNew();
//        LocalTest.testGet();
//        LocalTest.testTransfer();
//        LocalTest.testPlusAndMinus();
//        LocalTest.testWith();
//        LocalTest.testToString();
        LocalTest.stringToDate();



    }

    public static void testNew(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2021-03-02T10:25:43.565

        LocalDate now1 = LocalDate.now();
        System.out.println(now1); // 2021-03-02

        LocalTime now2 = LocalTime.now();
        System.out.println(now2); // 10:27:09.950

        LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 2, 10, 10, 10,100);
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2020, 3, 2);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(10, 10, 10);
        System.out.println(localTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime1);
    }

    public static void testGet() {
        LocalDateTime now = LocalDateTime.now(); // 2021-03-02T10:25:43.565

        System.out.println(now.getYear()); // 2021
        System.out.println(now.getMonth()); // MARCH
        System.out.println(now.getMonthValue()); // 3
        System.out.println(now.getDayOfMonth()); // 2
        System.out.println(now.getDayOfWeek());  // TUESDAY
        System.out.println(now.getDayOfYear()); //61
        System.out.println(now.getHour()); //11
        System.out.println(now.getMinute()); //14
        System.out.println(now.getSecond()); //4
        System.out.println(now.getNano()); //368000000
    }

    public static void testTransfer(){
        LocalDateTime now = LocalDateTime.now(); // 2021-03-02T10:25:43.565

        LocalDate localDate = now.toLocalDate(); // 2021-03-02
        System.out.println(localDate);
        LocalTime localTime = now.toLocalTime(); // 18:51:51.653
        System.out.println(localTime);
    }

    public static void testIs(){
        LocalDateTime now = LocalDateTime.now(); // 2021-03-02T10:25:43.565
        LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 1, 10, 10, 10,100);

        boolean before = now.isBefore(localDateTime);
        boolean after = now.isAfter(localDateTime);
        boolean equal = now.isEqual(localDateTime);
        boolean leapYear = localDateTime.toLocalDate().isLeapYear(); // 是否闰年
    }

    public static void testPlusAndMinus(){
        // plus 和 minus 常用api略
        LocalDateTime localDateTime = LocalDateTime.now();
//        TemporalAmount duration =  Duration.ofSeconds(100);
        TemporalAmount duration =  Duration.ofDays(100);
        LocalDateTime plus = localDateTime.plus(duration);  //2021-06-10T19:08:11.043
        System.out.println(plus);
        LocalDateTime minus = localDateTime.minus(duration); // 2020-11-22T19:08:11.043

        System.out.println(minus);

    }

    public static void testWith(){
        //指定某个日期的方法 with()方法
        LocalDate now2 = LocalDate.now();
        System.out.println(now2);
        LocalDate localDate = now2.withYear(2014);
        System.out.println(localDate);

        // TemporalAdjusters工具类，提供了一些获取特殊日期的方法
        LocalDate with = now2.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);
        LocalDate with1 = now2.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(with1);

        //获取这个月的第几个星期几是几号,比如 TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY)
        // 代表的意思是这个月的第二个星期五是几号
        LocalDate with2 = now2.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY));
        System.out.println(with2);

    }

    public static void testToString(){
        //获取当前日期时分秒
        LocalDateTime now = LocalDateTime.now();

        //默认格式  年-月-日T时:分:秒
        System.out.println(now);

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        String format = now.format(pattern);  //2021年03月02日 19时12分49秒
        System.out.println(format);
    }

    public static void stringToDate(){
        String dateStr = "2020-01-01";
        LocalDate localDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(localDate);
        System.out.println(localDate.getClass());

        String localTimeStr = "10:10:10";
        LocalTime localTime = LocalTime.parse(localTimeStr, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(localTime);
    }


}
