package com.young.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class ProviderApp2 {
    public static void main(String[] args)  throws Exception {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("provider2.xml");
        ioc.start();
        System.out.println("Provider2 started...");
        System.in.read();
    }
}
