package com.example.bianca_practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Needs attributes, getters, setters, IDs and relation to author
 */
@Entity
public class Book {
    @Id
    Long id;

}
