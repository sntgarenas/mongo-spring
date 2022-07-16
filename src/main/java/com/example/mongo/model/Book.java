package com.example.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "books")
public class Book {

    @Id
    private String id;

    private String name;
    private String responsible;
    private String type;
    private String country;
    private String year;
    private Integer weight;
    private Integer speed;
    private Boolean isShuttle;
    private String idContainedNave;
}
