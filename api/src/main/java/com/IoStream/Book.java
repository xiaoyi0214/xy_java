package com.IoStream;

import java.io.Serializable;

/**
 * Created on 2021/3/3.
 *
 * @author 小逸
 * @description
 */
public class Book implements Serializable {

    private String title;

    private double price;

    public Book(String tit,double pri){

        this.title=tit;

        this.price=pri;

    }

    public String toString() {

        return "书名：" + this.title + ",价格：" + this.price;

    }
}
