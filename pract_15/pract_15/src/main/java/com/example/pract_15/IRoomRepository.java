package com.example.pract_15;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNullApi;

import java.util.List;


public interface IRoomRepository extends JpaRepository<Room, Long> {

    @Query("SELECT s FROM Room s WHERE s.roomNumber = ?1")
    Room findByRoomNumber(String roomNumber);

    void deleteRoomByRoomNumber(String roomNumber);

}
