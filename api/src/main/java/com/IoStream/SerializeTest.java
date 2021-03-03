package com.IoStream;

import java.io.*;

/**
 * Created on 2021/3/3.
 *
 * @author 小逸
 * @description 序列化和反序列化
 */
public class SerializeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        clzssToStream();
        streamToClzss();
    }

    public static void clzssToStream() throws IOException {
        File file = new File("D:" + File.separator + "book1.txt");
        OutputStream stream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
        objectOutputStream.writeObject(new Book("java编程思想",80));
        objectOutputStream.close();
    }

    public static void streamToClzss() throws IOException, ClassNotFoundException {
        File file = new File("D:" + File.separator + "book1.txt");
        InputStream inputStream = new FileInputStream(file);
        ObjectInput objectInput = new ObjectInputStream(inputStream);

        Book o = (Book) objectInput.readObject();
        objectInput.close();
        inputStream.close();
        System.out.println(o);

    }
}
