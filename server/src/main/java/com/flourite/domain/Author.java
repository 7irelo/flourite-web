package com.flourite.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {

    private Long id;

    private String name;

    private Integer age;

    public Author() {}
    public Author(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
