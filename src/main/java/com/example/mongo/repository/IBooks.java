package com.example.mongo.repository;

import com.example.mongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IBooks extends MongoRepository<Book, String> {

}
