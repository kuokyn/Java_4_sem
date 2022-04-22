package com.example.Pract_14;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GuestService {
    Map<Long, Guest> guests = new HashMap<>();

    public GuestService() {
        guests.put(1L, new Guest(1L,
                "Jane",
                "+09586758", "999",
                LocalDate.of(2021, Month.AUGUST, 5),
                LocalDate.of(2021, Month.AUGUST, 16)));
        guests.put(2L, new Guest(2L,
                "Kate",
                "+31234567", "655",
                LocalDate.of(2022, Month.JULY, 12),
                LocalDate.of(2022, Month.JULY, 28)));
        guests.put(3L, new Guest(3L,
                "Bernard",
                "+20384635", "312",
                LocalDate.of(2021, Month.SEPTEMBER, 1),
                LocalDate.of(2021, Month.SEPTEMBER, 10)));
    }

    public String addGuest(Long id, Guest guest) {
        boolean exists = guests.containsKey(id);
        if (exists) {
            throw new IllegalStateException("guest is already added");
        }
        guests.put(id, guest);
        return "Guest with id  " + id + "is added";
    }

    public String deleteGuest(Long Id) {
        boolean exists = guests.containsKey(Id);
        if (!exists) {
            throw new IllegalStateException("Guest with id " + Id + " does not exist");
        }
        guests.remove(Id);
        return "Guest with id " + Id + " is deleted";
    }

    public List<Guest> getAllGuests() {
        return new ArrayList<>(guests.values());
    }

    public Guest findGuestById(Long id) {
        boolean check = guests.containsKey(id);
        if (check) {
            return guests.get(id);
        }
        return null;
    }

}
