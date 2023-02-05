package com.example.bianca_practice.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "first_name")
    String firstName;
}
