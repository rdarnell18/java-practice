package com.example.bianca_practice.repositories;

import com.example.bianca_practice.enitites.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
