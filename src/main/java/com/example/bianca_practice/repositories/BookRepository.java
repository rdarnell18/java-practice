package com.example.bianca_practice.repositories;

import com.example.bianca_practice.enitites.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
