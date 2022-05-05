package com.archegos.pojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {
    private String str;
    //如果允许对象为null，设置required = false,默认为true
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    private Dog dog;

    public String getStr() {
        return str;
    }



    public Cat getCat() {
        return cat;
    }



    public Dog getDog() {
        return dog;
    }



    @Override
    public String toString() {
        return "User{" +
                "str='" + str + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
