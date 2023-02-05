package com.example.bianca_practice;

import com.example.bianca_practice.entity.Author;
import com.example.bianca_practice.repository.AuthorRepository;
import com.example.bianca_practice.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.bianca_practice.entity")
public class BiancaPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiancaPracticeApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(AuthorRepository authorRepository) {
        return (args) -> {
            authorRepository.save(Author.builder().firstName("First").build());
            System.out.println(authorRepository.findAll().get(0).getFirstName());
        };
    }
}
