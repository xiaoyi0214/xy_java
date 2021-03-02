package com.java8time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * Created on 2021/3/2.
 *
 * @author 小逸
 * @description
 */
public class ZoneIdTest {
    public static void main(String[] args) {
        //ZoneID 世界时区类
        //获取世界各地的时区编号。
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            System.out.println(availableZoneId);
        }

        System.out.println("=====================");
        //获取系统的默认时区编号
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取其他国家的日期
        LocalDateTime now = LocalDateTime.now();
        //获取指定时区的日期时间
        ZoneId zoneId1 = ZoneId.of("Europe/Monaco");
        ZonedDateTime zonedDateTime = now.atZone(zoneId1);  //获得指定时区的当前时间
        System.out.println(zonedDateTime);

        System.out.println("=====================");
        //根据时区，获取该地区的日期
        LocalDateTime now1 = LocalDateTime.now(ZoneId.of("America/Phoenix"));  //获得指定时区的当前时间（不带时区信息）
        System.out.println(now1);
    }
}
