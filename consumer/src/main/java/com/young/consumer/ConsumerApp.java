package com.young.consumer;

import com.young.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.UUID;

/**
 * Hello world!
 */
public class ConsumerApp {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("consumer.xml");
        UserService userService=(UserService) ioc.getBean("userServiceRef");
        List<String> addrs=userService.getAddrs(UUID.randomUUID().toString());
        addrs.forEach(addr -> System.out.println(addr));
    }
}
