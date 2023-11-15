package com.libraryDetials.library.service;

import com.libraryDetials.library.entity.Book;
import com.libraryDetials.library.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    private BookRepository bookRepository;
    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
