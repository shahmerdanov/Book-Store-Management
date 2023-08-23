package com.bookstore.bookstoremanagement.service;

import com.bookstore.bookstoremanagement.entity.MyBookList;
import com.bookstore.bookstoremanagement.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyBookListService {

    @Autowired
    private MyBookRepository myBook;

    public void saveMyBooks(MyBookList book) {
        myBook.save(book);
    }

    public List<MyBookList> getAllMyBooks(){
        return myBook.findAll();
    }

    public void deleteById(int id) {
        myBook.deleteById(id);
    }
}
