package com.flourite.dao.impl;

import com.flourite.dao.TestDataUtil;
import com.flourite.domain.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AuthorDaoImplTests {
    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private AuthorDaoImp underTest;

    @Test
    public void testThatCreateAuthorGeneratesTheCorrectSql() {
        Author author = TestDataUtil.createAuthorTestA();
        underTest.create(author);

        verify(jdbcTemplate).update(
                eq("INSERT INTO authors (id, name, age) VALUES (?, ?, ?)"),
                eq(1L), eq("Eric Tirelo"), eq(23)
        );
    }

    @Test
    public void testThatFindOneGeneratesTheCorrectSql() {
        underTest.findOne(1L);
        verify(jdbcTemplate).query(
                eq("SELECT id, name, age FROM authors WHERE id = ? LIMIT 1"),
                ArgumentMatchers.<AuthorDaoImp.AuthorRowMapper>any(), eq(1L)
        );
    }

    @Test
    public void testThatFindManyGeneratesTheCorrectSql() {
        underTest.find();
        verify(jdbcTemplate).query(eq("SELECT id, name, age FROM authors "),
                ArgumentMatchers.<AuthorDaoImp.AuthorRowMapper>any()
        );
    }
}