package com.librarymanagementsystem.library.repositories;

import com.librarymanagementsystem.library.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {
}
