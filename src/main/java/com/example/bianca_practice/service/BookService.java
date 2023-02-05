package com.example.bianca_practice.service;

import com.example.bianca_practice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Will be used by BookController and holds logic
 */
@Service
public class BookService {
    BookRepository bookRepository;
    /* Use repository in service class*/

    /* Constructor */
    @Autowired
    BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //TODO: Return single book by title

    //TODO: Return list of books by author name

    //TODO: Return newly added book if not included in DB, return book if already exists

}
