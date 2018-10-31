package com.gaoxueping.dubbozookeeperconsumer;

import com.gaoxueping.duboozookeeperinterface.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by think.
 * Date: 31/10/2018
 * Time: 12:45
 */
public class StartConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.printf("consumer start");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println("get bean:" + userService);
        String name = userService.getName("xueping");
        System.out.println(name);
        context.destroy();
    }
}
