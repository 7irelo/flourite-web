package com.flourite.dao.impl;

import com.flourite.dao.AuthorDao;
import com.flourite.domain.Author;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDaoImp implements AuthorDao {
    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoImp(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {
jdbcTemplate.update(
        "INSERT INTO authors (id, name, age) VALUES (?, ?, ?)",
        author.getId(), author.getName(), author.getAge()
      );
    }
}
