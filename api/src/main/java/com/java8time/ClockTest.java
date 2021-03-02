package com.java8time;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created on 2021/3/2.
 *
 * @author 小逸
 * @description
 */
public class ClockTest {
    public static void main(String[] args) {
        //系统默认时间
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone());
        System.out.println(clock.instant().toString());

        //世界协调时UTC
        Clock clock1 = Clock.systemUTC();
        //通过Clock获取当前时刻
        System.out.println("当前时刻为：" + clock1.instant());
        //获取clock对应的毫秒数，与System.currentTimeMillis()输出相同
        System.out.println(clock1.millis());
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date(System.currentTimeMillis()).toString());

        //在clock基础上增加6000秒，返回新的Clock
        Clock clock2 = Clock.offset(clock1, Duration.ofSeconds(6000));

        //纽约时间
        Clock clock3 = Clock.system(ZoneId.of("America/New_York"));
        System.out.println("Current DateTime with NewYork clock: " + LocalDateTime.now(clock3));
        System.out.println(clock3.millis());
    }
}
