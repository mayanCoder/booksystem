package com.mayan.booksystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BooksystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksystemApplication.class, args);
    }
}
