package com.bookstore.bookstoremanagement.repository;
import com.bookstore.bookstoremanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}