package com.example.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpring {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.displayBook();
    }
}
