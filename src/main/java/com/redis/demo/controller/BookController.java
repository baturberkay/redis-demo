package com.redis.demo.controller;

import com.redis.demo.entity.Book;
import com.redis.demo.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/get-by-id/{id}")
    public Book get(@PathVariable Long id){
        return bookService.get(id);
    }

    @PostMapping("/save")
    public Book save(@RequestBody Book book){
        return bookService.save(book);
    }
}
