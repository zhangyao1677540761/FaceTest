package com.面试题1.test;

import com.面试题1.spring.book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @学习小结
 */
public class SpringTest {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("com/面试题1/spring/application.xml");
    @Test
    public void  testBook(){
        book book = (book)ioc.getBean("book");
        book book2 = (book)ioc.getBean("book");
        System.out.println(book==book2);
    }
}
