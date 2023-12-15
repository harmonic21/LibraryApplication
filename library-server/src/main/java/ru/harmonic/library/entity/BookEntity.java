package ru.harmonic.library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "BOOKS", schema = "public")
public class BookEntity {

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "AUTHOR", nullable = false)
    private String author;
    @Column(name = "GENRE")
    private String genre;
    @Column(name = "COUNT_OF_PAGES", nullable = false)
    private Integer countOfPages;
    @Column(name = "LINK")
    private String link;
}



