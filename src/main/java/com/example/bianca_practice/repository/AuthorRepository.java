package com.example.bianca_practice.repository;

import com.example.bianca_practice.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Will need to create queries based on needs of Service
 */

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
