package com.example.bianca_practice.repository;

import com.example.bianca_practice.entity.Book;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Will need to create queries based on needs of Service
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
