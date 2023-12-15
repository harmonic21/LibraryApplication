package ru.harmonic.library.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.harmonic.library.mapper.BookMapper;
import ru.harmonic.library.model.BookDto;
import ru.harmonic.library.repository.BookRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public List<BookDto> getAllBooks() {
       return bookRepository.findAll().stream().map(bookMapper::mapBook).collect(Collectors.toList());
    }
}
