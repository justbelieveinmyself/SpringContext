package com.justbelieveinmyself.springcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");
        System.out.println("Main!");
        context.getBean(Quoter.class).sayQuote();
    }
}