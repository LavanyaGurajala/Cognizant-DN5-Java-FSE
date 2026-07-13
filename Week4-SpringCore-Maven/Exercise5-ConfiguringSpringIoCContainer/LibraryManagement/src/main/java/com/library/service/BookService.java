package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String displayBookDetails() {
        return "Book from IoC container: " + bookRepository.getBookName();
    }
}
