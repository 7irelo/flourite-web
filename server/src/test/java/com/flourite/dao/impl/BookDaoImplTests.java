package com.flourite.dao.impl;

import com.flourite.dao.TestDataUtil;
import com.flourite.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
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

        Book book = TestDataUtil.createTestBook();
        undertest.create(book);

        verify(jdbcTemplate).update(
                eq("INSERT INTO books (isbn, title, author_id) VALUES (?, ?, ?)"),
                eq("010-7-0962-4508-2"), eq("Zany Brainiac"), eq(1L)
        );
    }

    @Test
    public void testThatFindOneGeneratesTheCorrectSql() {

        undertest.findOne("010-7-0962-4508-2");
        verify(jdbcTemplate).query(
                eq("SELECT isbn, title, author_id FROM books WHERE isbn = ? LIMIT 1"),
                ArgumentMatchers.<BookDaoImpl.BookRowMapper>any(),
                eq("010-7-0962-4508-2")
        );
    }
}
