package com.面试题1.singleton.懒汉式;

/**
 * @学习小结
 * 内部类被加载时会创建对象,
 * 静态内部类不会随着外部类加载而初始化,需要单独加载
 */
public class Singleton5 {
    private Singleton5(){}

    private static class Inner{
        private static final Singleton5 instance = new Singleton5();
    }
    public static Singleton5 getInstance(){
        return Inner.instance;
    }

}
