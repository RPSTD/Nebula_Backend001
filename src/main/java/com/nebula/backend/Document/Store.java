package com.nebula.backend.Document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Store {

    @Id
    private String id;

    @Indexed(unique = true)
    private String storeId;

    private String name;
    private String mapUrl;

    public Store(String storeId, String name, String mapUrl) {
        this.storeId = storeId;
        this.name = name;
        this.mapUrl = mapUrl;
    }
}
