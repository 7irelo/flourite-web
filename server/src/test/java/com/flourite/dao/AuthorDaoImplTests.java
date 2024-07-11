package com.flourite.dao;

import com.flourite.dao.impl.AuthorDaoImp;
import com.flourite.domain.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

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
        Author author = Author.builder.id(1L).name("Eric Tirelo").age(23).build();
        underTest.create(author);

        verify(jdbcTemplate).update(
                eq("INSERT INTO authors (id, name, age) VALUES (?, ?, ?)"),
                eq(1L),eq("Eric Tirelo"), eq(23)
        );
    }
}
