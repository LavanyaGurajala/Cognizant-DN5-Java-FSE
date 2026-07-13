package com.library.main;

import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService bookService = context.getBean(BookService.class);

            System.out.println("Exercise 3 - Implementing Logging with Spring AOP");
            bookService.issueBook();
        }
    }
}
