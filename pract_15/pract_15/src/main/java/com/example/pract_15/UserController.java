package com.example.pract_15;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createUser(Long id, User user) {
        userService.createUser(id, user);
    }

    @DeleteMapping
    public void deleteUserById(Long id) {
        userService.deleteUserById(id);
    }

    @GetMapping("/{userId}")
    public User findUserById(@PathVariable("userId") Long id) {
        return userService.findUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
/*
    @PostMapping
    public void createBooking(Long id,
                                String name,
                                String roomNumber,
                                LocalDate checkIn,
                                LocalDate checkOut) {
        if (userService.findUserById(id) != null) {
            userService.findUserById(id).addBooking(name, roomNumber,
                    LocalDate.of(checkIn.getYear(), checkIn.getMonth(), checkIn.getDayOfMonth()),
                    LocalDate.of(checkOut.getYear(), checkOut.getMonth(), checkOut.getDayOfMonth()));
        }
    }

    @DeleteMapping
    public void deleteBookingById(Long userId,
                                Long bookingId) {
        if (userService.findUserById(userId) != null) {
            userService.findUserById(userId).deleteBookingById(bookingId);
        }
    }*/
}
