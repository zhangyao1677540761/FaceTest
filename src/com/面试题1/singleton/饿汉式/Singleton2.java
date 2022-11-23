package com.面试题1.singleton.饿汉式;

/**
 * @学习小结
 */
public class Singleton2 {
    public static final Singleton2 instance = new Singleton2();
    private Singleton2(){
    }
}
