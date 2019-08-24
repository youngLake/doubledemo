package com.young.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class ProviderApp1 {
    public static void main(String[] args)  throws Exception {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("provider1.xml");
        ioc.start();
        System.out.println("Provider1 started...");
        System.in.read();
    }
}
