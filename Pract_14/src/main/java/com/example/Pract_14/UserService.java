package com.example.Pract_14;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    Map<Long, User> users = new HashMap<>();

    public UserService() {
        Map<Long, Booking> bookings = new HashMap<>();

        bookings.put(13L,new Booking(13L, "Lee","3",
                LocalDate.of(2022, Month.AUGUST, 5),
                LocalDate.of(2022, Month.AUGUST, 18)));
        bookings.put(14L,new Booking(14L,"Lee","4",
                LocalDate.of(2022, Month.AUGUST, 5),
                LocalDate.of(2022, Month.AUGUST, 18)));

        users.put(1L, new User("+09586758",
                "2bdi9dh2",
                "Lee", bookings));
        users.put(2L, new User("+29374202",
                "dksbdif8",
                "Vu", bookings));
    }

    public String createUser(Long id, User user) {
        boolean exists = users.containsKey(id);
        if (exists) {
            throw new IllegalStateException("guest is already added");
        }
        users.put(id, user);
        return "User with id  " + id + "is added";
    }

    public String deleteUser(Long Id) {
        boolean exists = users.containsKey(Id);
        if (!exists) {
            throw new IllegalStateException("User with id " + Id + " does not exist");
        }
        users.remove(Id);
        return "User with id " + Id + " is deleted";
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User findUserById(Long id) {
        boolean check = users.containsKey(id);
        if (check) {
            return users.get(id);
        }
        return null;
    }

}
