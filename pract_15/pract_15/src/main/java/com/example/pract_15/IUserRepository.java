package com.example.pract_15;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findUserById(Long Id);
    User findUserByPhoneNumber(String phoneNumber);
}