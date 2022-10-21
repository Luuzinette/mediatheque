package com.plb.mediatheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plb.mediatheque.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
