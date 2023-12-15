package ru.harmonic.library.mapper;

import org.mapstruct.Mapper;
import ru.harmonic.library.entity.BookEntity;
import ru.harmonic.library.model.BookDto;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto mapBook(BookEntity bookEntity);
}
