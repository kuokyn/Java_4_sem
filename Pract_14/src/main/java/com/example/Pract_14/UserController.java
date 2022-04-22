package com.example.Pract_14;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/create/{userId}")
    public String createUser(@PathVariable("userId") Long id, User user) {
        return userService.createUser(id, user);
    }

    @GetMapping("/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Long id) {
        return userService.deleteUser(id);
    }

    @GetMapping("/{userId}")
    public User findUserById(@PathVariable("userId") Long id) {
        return userService.findUserById(id);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}/booking/create/{name}/{roomNumber}/{checkIn}/{checkOut}")
    public String createBooking(@PathVariable("userId") Long id,
                                @PathVariable("name") String name,
                                @PathVariable("roomNumber") String roomNumber,
                                @PathVariable("checkIn") LocalDate checkIn,
                                @PathVariable("checkOut") LocalDate checkOut) {
        if (userService.findUserById(id) != null) {
            userService.findUserById(id).addBooking(name, roomNumber,
                    LocalDate.of(checkIn.getYear(), checkIn.getMonth(), checkIn.getDayOfMonth()),
                    LocalDate.of(checkOut.getYear(), checkOut.getMonth(), checkOut.getDayOfMonth()));
            return "User with id " + id + " created a booking";
        }
        return "User with id " + id + "is not authorized";
    }

    @GetMapping("/{userId}/booking/delete/{bookingId}")
    public String deleteBooking(@PathVariable("userId") Long id,
                                @PathVariable("bookingId") Long bookingId) {
        if (userService.findUserById(id) != null) {
            userService.findUserById(id).deleteBooking(bookingId);
            return "User with id " + id + " deleted a booking";
        }
        return "User with id " + id + "is not authorized";
    }
}
