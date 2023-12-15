package ru.harmonic.library.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookDto implements Serializable {
    private Long id;
    private String name;
    private String author;
    private String genre;
    private Integer countOfPages;
    private String link;
}
