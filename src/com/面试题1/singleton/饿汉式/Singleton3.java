package com.面试题1.singleton.饿汉式;

import java.io.IOException;
import java.util.Properties;

/**
 * @学习小结
 */
public class Singleton3 {
    public static final Singleton3 instance;
    String str ;
    static{
        Properties properties = new Properties();
        try {
            properties.load(Singleton3.class.getClassLoader().getResourceAsStream("com/面试题1/singleton/Singleton.properties"));

            instance = new Singleton3(properties.getProperty("str"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private Singleton3(String str){
            this.str = str;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "str='" + str + '\'' +
                '}';
    }
}
