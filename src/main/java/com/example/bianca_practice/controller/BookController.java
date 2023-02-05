package com.example.bianca_practice.controller;

import com.example.bianca_practice.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Method signatures exist, need logic
 */

@RestController
public class BookController {


    //TODO: Return single book by title
    @GetMapping("/book")
    public Book getBookByTitle(String bookTitle) {

        return null;
    }

    //TODO: Return list of books by author name
    @GetMapping("/books/{authorName}")
    public List<Book> getBooksByAuthor(@PathVariable String authorName) {

        return null;
    }

    //TODO: Return newly added book if not included in DB, return book if already exists
    @PostMapping("/addBook")
    public Book addNewBook(@RequestBody Book newBook) {
        return null;
    }
}
