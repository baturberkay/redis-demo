package com.redis.demo.service;

import com.redis.demo.repository.BookRepository;
import com.redis.demo.entity.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book get(Long id){
        return bookRepository.findById(id.toString()).orElse(null);
    }

    public Book save(Book book){
        return bookRepository.save(book);
    }
}
