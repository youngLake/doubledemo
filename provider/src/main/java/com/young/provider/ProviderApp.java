package com.young.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class ProviderApp {
    public static void main(String[] args)  throws Exception {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.out.println("Provider started...");
        System.in.read();
    }
}
