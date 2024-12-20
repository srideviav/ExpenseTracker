package com.example.expensetracker.Repository;

import com.example.expensetracker.Models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {
    Optional<UserModel> findByEmail(String email); // Example: Find user by email
}
