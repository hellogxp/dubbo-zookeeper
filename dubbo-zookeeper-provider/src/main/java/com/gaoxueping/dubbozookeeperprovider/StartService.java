package com.gaoxueping.dubbozookeeperprovider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by think.
 * Date: 31/10/2018
 * Time: 11:57
 */
public class StartService {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("provider start");
        System.in.read();
    }
}
