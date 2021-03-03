package com.IoStream;

import java.io.*;

/**
 * Created on 2021/3/3.
 *
 * @author 小逸
 * @description 字节和字符流的区别
 */
public class ByteAndCharacter {
    public static void main(String[] args) throws IOException {
//        byteTest();
        characterTest();
    }

    // 无论有没有关闭输出流，都会写入到文件里
    public static void byteTest() throws IOException {
        File file = new File("D:"+File.separator+"byte.txt");
        // 通过子类实例化父类对象
        OutputStream outputStream = null;
        outputStream = new FileOutputStream(file);

        String str = "Hello byte!!!";
        byte[] bytes = str.getBytes();
        // 写入文件
        outputStream.write(bytes);
        // 关闭输出流
//        outputStream.close();

    }

    // 只有在关闭输出流或手动刷新时才会写入文件内
    public static void characterTest() throws IOException {
        File file = new File("D:"+File.separator+"character.txt");
        // 通过子类实例化父类对象
        Writer writer = null;
        writer = new FileWriter(file);

        String str = "Hello character!!!";
        // 写入文件
        writer.write(str);
        // 关闭输出流
//        writer.close();

        // 不关闭输出流，手动刷新
        writer.flush();
    }

}
