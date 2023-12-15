package ru.harmonic.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.harmonic.library.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
