package com.library.main;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookRepository bookRepository = context.getBean(BookRepository.class);
            BookService bookService = context.getBean(BookService.class);

            System.out.println("Exercise 1 - Configuring a Basic Spring Application");
            System.out.println("Repository says: " + bookRepository.findBookTitle());
            bookService.displayServiceStatus();
        }
    }
}
