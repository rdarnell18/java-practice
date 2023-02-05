package com.example.bianca_practice.service;


import com.example.bianca_practice.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {


    AuthorRepository authorRepository;

    @Autowired
    private AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    //TODO: Return author by book title

    //TODO: Add new author to db, return author is already included
}
