package com.java8time;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Created on 2021/3/2.
 *
 * @author 小逸
 * @description
 */
public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.plusDays(1);
        Duration between = Duration.between(now, localDateTime);
        System.out.println(between.toString());
        System.out.println(between.toHours());
    }

}
