package com.library.main;

import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService constructorInjectedService = context.getBean("constructorInjectedBookService", BookService.class);
            BookService setterInjectedService = context.getBean("setterInjectedBookService", BookService.class);

            System.out.println("Exercise 7 - Constructor and Setter Injection");
            System.out.println("Constructor injection: " + constructorInjectedService.showBookDetails());
            System.out.println("Setter injection: " + setterInjectedService.showBookDetails());
        }
    }
}
