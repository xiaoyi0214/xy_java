package com.java8time;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * Created on 2021/3/2.
 *
 * @author 小逸
 * @description
 */
public class InstantTest {
    public static void main(String[] args) {
//  Instant 时间戳类从1970 -01 - 01 00:00:00 截止到当前时间的毫秒值
        Instant now = Instant.now();
        System.out.println(now); //获取的是默认时区，获取的不是中国 的时区

        //获取当前时区的，我们可以添加偏移量,返回偏移过后的日期
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        System.out.println("===========================");

        //从1970 - 01 - 01 00:00:00 截止到当前时间的毫秒值
        long l = System.currentTimeMillis();
        System.out.println(l);
        long time = new Date().getTime();
        System.out.println(time);

        //JDK1.8 Instant 时间戳类从1970 -01 - 01 00:00:00 截止到当前时间的毫秒值
        Instant now1 = Instant.now();

        //toEpochMilli():从1970 -01 - 01 00:00:00 截止到当前时间间隔的毫秒值
        long l1 = now1.toEpochMilli();
        System.out.println(l1);

        //获取从1970 -01 - 01 00:00:00 截止到当前时间间隔的秒值
        long epochSecond = now1.getEpochSecond();
        System.out.println(epochSecond);

        System.out.println("==========================");
        //给计算机元年增加相应的时间量
        Date date = new Date(1000 * 60 * 60 * 24);
        System.out.println(date);

        //现在 给计算机元年增加相应的时间量
        //5. ofEpochSecond() 方法 给计算机元年增加秒数
        //ofEpochMilli() 给计算机元年增加毫秒数
        Instant instant = Instant.ofEpochMilli(1000 * 60 * 60 * 24);
        System.out.println(instant);

        //ofEpochSecond() 方法 给计算机元年增加秒数
        Instant instant1 = Instant.ofEpochSecond(60 * 60 * 24);
        System.out.println(instant1);

    }
}
