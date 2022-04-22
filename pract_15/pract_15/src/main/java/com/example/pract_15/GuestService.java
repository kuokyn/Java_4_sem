package com.example.pract_15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GuestService {

    private final IGuestRepository guestRepository;

    @Autowired
    public GuestService(IGuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public void addGuest(Guest guest) {
        Optional<Guest> studentOptional = guestRepository
                .findGuestByPhoneNumber(guest.getPhoneNumber());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("phone number is already taken");
        }
        guestRepository.save(guest);
    }

    public void deleteGuest(Long Id) {
        boolean exists = guestRepository.existsById(Id);
        if (!exists) {
            throw new IllegalStateException("Guest with id " + Id + " does not exist");
        }
        guestRepository.deleteById(Id);
    }

    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }
}
