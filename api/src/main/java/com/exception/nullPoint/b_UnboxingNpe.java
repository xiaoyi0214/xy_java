package com.exception.nullPoint;

/**
 * @author 小逸
 * @description
 * @time 2021/3/17 15:56
 *
 *  自动拆箱引发的NPE：
 *      原因：拆箱的时候会触发类似 longValue()的方法 转换为基本数据类型
 *
 *      规避：
 *          基本数据类型优于包装器类型使用；
 *          对于不确定的包装器类型，一定校验是否为null
 *          对于值为Null的包装器类型就赋值为0；
 *
 *
 */
public class b_UnboxingNpe {
    private static int add(int x, int y) {
        return x + y;
    }

    private static boolean compare(long x, long y) {
        return x >= y;
    }

    public static void main(String[] args) {

        // 1. 变量赋值自动拆箱出现的空指针
        // javac UnboxingNpe.java
        // javap -c UnboxingNpe.class

        Long count = null;
        long count_ = count;

        // 2. 方法传参时自动拆箱引发的空指针
//        Integer left = null;
//        Integer right = null;
//        System.out.println(add(left, right));

        // 3. 用于大小比较的场景
//        Long left = 10L;
//        Long right = null;
//        System.out.println(compare(left, right));
    }

}
