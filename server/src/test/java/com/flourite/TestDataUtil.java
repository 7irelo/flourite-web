package com.flourite;

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

    public static Book createTestBookA() {
        return Book.builder().isbn("010-7-0962-4508-2").title("Zany Brainiac").authorId(1L).build();
    }

    public static Book createTestBookB() {
        return Book.builder().isbn("201-0-7096-2450-8").title("Brady Meniac").authorId(1L).build();
    }

    public static Book createTestBookC() {
        return Book.builder().isbn("820-1-0709-6245-0").title("Sady Zadiac").authorId(1L).build();
    }
}
