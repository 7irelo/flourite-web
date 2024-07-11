package com.flourite.dao;

import com.flourite.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> findOne(String isbn);
}
