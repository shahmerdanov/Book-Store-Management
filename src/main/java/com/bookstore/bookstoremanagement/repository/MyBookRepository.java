package com.bookstore.bookstoremanagement.repository;
import com.bookstore.bookstoremanagement.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer>{

}