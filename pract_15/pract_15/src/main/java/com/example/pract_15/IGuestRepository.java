package com.example.pract_15;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IGuestRepository extends JpaRepository<Guest, Long> {

    // SELECT * FROM student WHERE email = ?
    @Query("SELECT s FROM Guest s WHERE s.phoneNumber = ?1")
    Optional<Guest> findGuestByPhoneNumber(String phoneNumber);
}
