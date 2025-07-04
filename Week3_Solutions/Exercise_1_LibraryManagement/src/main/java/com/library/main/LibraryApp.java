package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;
 
public class LibraryApp {
    public static void main(String[] args) {
        // Load Spring context from applicationContext.xml
    	ApplicationContext context = 
    		    new ClassPathXmlApplicationContext("applicationContext.xml");


        // Get the bookService bean
        BookService bookService = context.getBean("bookService", BookService.class);

        // Use the service
        bookService.addBook("The Great Gatsby");

        // Close context if needed
        ((ClassPathXmlApplicationContext) context).close();
    }
}
