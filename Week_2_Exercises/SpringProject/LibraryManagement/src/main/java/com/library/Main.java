package com.library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;


public class Main {
    public static void main(String[] args) {
    // Load the Spring context from the XML configuration file
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // Retrieve the beans from the Spring context
    BookService bookService = (BookService) context.getBean("bookService");
    BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");

    // Call a method on the BookService bean to test the dependency injection
    bookService.printService();
    bookRepository.printRepository();
    bookService.performService();
    
    }
    
    
}
