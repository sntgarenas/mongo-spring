package com.example.mongo.controller;

import com.example.mongo.model.Book;
import com.example.mongo.repository.IBooks;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ControllerBook {
    private final IBooks books;

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return books.findAll();
    }
}
