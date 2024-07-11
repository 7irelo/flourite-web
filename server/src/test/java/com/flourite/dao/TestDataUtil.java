package com.flourite.dao;

import com.flourite.domain.Author;
import com.flourite.domain.Book;

public final class TestDataUtil {

    private TestDataUtil() {

    }

    public static Author createAuthorTestA() {
        return Author.builder().id(1L).name("Eric Tirelo").age(23).build();
    }

    public static Author createAuthorTestB() {
        return Author.builder().id(2L).name("Ricky Zook").age(23).build();
    }

    public static Author createAuthorTestC() {
        return Author.builder().id(3L).name("Kendrick Lamar").age(35).build();
    }

    public static Book createTestBook() {
        return Book.builder().isbn("010-7-0962-4508-2").title("Zany Brainiac").authorId(1L).build();
    }
}
