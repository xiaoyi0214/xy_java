package com.exception.nullPoint;

/**
 * @author 小逸
 * @description
 * @time 2021/3/17 15:47
 *
 * 1.使用之前初始化或检查是否初始化
 * 2.尽量避免在函数中返回Null，或者给出详细的注释
 * 3.外部传参一定要判断（除非有明确的说明）
 *
 */
public class a_WhatIsNpe {
    public static class User {

        private String name;
        private String[] address;

        public void print() {
            System.out.println("This is User Class!");
        }

        public String readBook() {
            System.out.println("User Read !");
            return null;
        }
    }

    /**
     * <h2>自定义一个运行时异常</h2>
     * */
    public static class CustomException extends RuntimeException {}

    public static void main(String[] args) {

        // 第一种情况: 调用了空对象的实例方法
//        User user = null;
//        user.print();

        // 第二种情况: 访问了空对象的属性
//        User user = null;
//        System.out.println(user.name);

        // 第三种情况: 当数组是一个空对象的时候, 取它的长度
//        User user = new User();
//        System.out.println(user.address.length);

        // 第四种情况: null 当做 Throwable 的值
//        CustomException exception = null;
//        throw exception;

        // 第五种情况: 方法的返回值是 null, 调用方直接去使用
        User user = new User();
        System.out.println(user.readBook().contains("MySQL"));
    }
}
