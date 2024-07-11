package com.flourite.dao.impl;

import com.flourite.dao.impl.BookDaoImpl;
import com.flourite.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class BookDaoImplTests {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private BookDaoImpl undertest;

    @Test
    public void testThatCreateBookGeneratesTheCorrectsSql() {

        Book book = Book.builder().isbn("010-7-0962-4508-2").title("Zany Brainiac").authorId(1L).build();
        undertest.create(book);

        verify(jdbcTemplate).update(
                eq("INSERT INTO books (isbn, title, author_id) VALUES (?, ?, ?)"),
                eq("010-7-0962-4508-2"), eq("Zany Brainiac"), eq(1L)
        );
    }
}
