package com.bookstore.bookstoremanagement;
import com.bookstore.bookstoremanagement.service.MyBookListService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookStoreManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreManagementApplication.class, args);
    }
    @Bean
    public MyBookListService myBookListService(){
        return new MyBookListService();
    }
}
