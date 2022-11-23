package com.面试题1.singleton.懒汉式;


/**
 * @学习小结
 */
public class Singleton4 {
    private Singleton4(){}
    private static Singleton4 Instance;
    public static Singleton4 getInstance(){
        if ( Instance == null) {   //如果有实例了就不会再走锁了，提高性能
            synchronized (Singleton4.class) {  //保证线程安全
                if (Instance == null) {
                    Instance = new Singleton4();
                }
            }
        }
        return Instance;
    }
}
