package com.example.mybookshelfapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String title;

    @Column
    String description;

    @Column
    String author;

    @Column
    String isbn;

    @Column
    String language;

    @Column
    Integer publicationYear;

    @Column
    Integer pages;

    public Book(String title,
                String description,
                String author,
                String isbn,
                String language,
                Integer publicationYear,
                Integer pages) {

        this.title = title;
        this.description = description;
        this.author = author;
        this.isbn = isbn;
        this.language = language;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }
}