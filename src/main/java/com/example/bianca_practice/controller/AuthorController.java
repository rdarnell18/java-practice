package com.example.bianca_practice.controller;

import com.example.bianca_practice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


/**
 * Method need to be created from scratch
 */

@RestController
public class AuthorController {

    AuthorService authorService;

    @Autowired
    private AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    //TODO: Return author by book title

    //TODO: Add new author to db, return author is already included
}
