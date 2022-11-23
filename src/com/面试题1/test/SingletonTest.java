package com.面试题1.test;

import com.面试题1.singleton.饿汉式.*;

import org.junit.Test;
import com.面试题1.singleton.饿汉式.Singleton;
import com.面试题1.singleton.饿汉式.Singleton2;
import com.面试题1.singleton.懒汉式.*;

/**
 * @学习小结
 */
public class SingletonTest {

    @Test
    //饿汉式
    public void singleton(){
        System.out.println(Singleton.instance.hashCode());
        System.out.println(Singleton.instance.hashCode());
    }
    @Test
    //饿汉式2
    public void singleton2(){
        System.out.println(Singleton2.instance.hashCode());
        System.out.println(Singleton2.instance.hashCode());
    }
    @Test
    //饿汉式3,用于提前赋值初始化
    public void singleton3() {
        System.out.println(Singleton3.instance);
        System.out.println(Singleton3.instance);
    }
    @Test
    //懒汉式,线程不安全，加synchronized()
    public void singleton4(){
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance==instance2);
    }
    @Test
    //线程安全的
    public void singleton5(){
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance==instance2);
    }


}
