package com.example.expensetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseTrackerApplication {
    public static void main(String[] args) {
        System.out.println("Hello World endpoint was called!");
        SpringApplication.run(ExpenseTrackerApplication.class, args);
    }
}
