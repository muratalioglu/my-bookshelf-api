package com.example.mybookshelfapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDTO {

    String title;

    String description;

    String author;

    String isbn;

    String language;

    Integer publicationYear;

    Integer pages;
}
