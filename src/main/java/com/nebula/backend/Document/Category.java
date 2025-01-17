package com.nebula.backend.Document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Category {
    @Id
    private String id;

    private String categoryId;
    private String name;

    public Category(String categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }
}
