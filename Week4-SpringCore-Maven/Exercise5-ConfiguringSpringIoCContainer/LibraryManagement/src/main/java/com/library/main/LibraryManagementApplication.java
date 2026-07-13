package com.library.main;

import com.library.service.BookService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        System.out.println("Exercise 5 - Configuring the Spring IoC Container");

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        BookService beanFactoryService = beanFactory.getBean(BookService.class);
        System.out.println("BeanFactory: " + beanFactoryService.displayBookDetails());

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService applicationContextService = applicationContext.getBean(BookService.class);
            System.out.println("ApplicationContext: " + applicationContextService.displayBookDetails());
        }
    }
}
