package com.tja.ecomm.db;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tja.ecomm.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}