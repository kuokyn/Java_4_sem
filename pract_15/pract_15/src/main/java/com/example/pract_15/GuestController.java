package com.example.pract_15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {
    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }

    @PostMapping
    public void addGuest(Guest guest) {
        guestService.addGuest(guest);
    }

    @DeleteMapping("{guestId}")
    public void deleteGuest(@PathVariable("guestId") Long guestId) {
        guestService.deleteGuest(guestId);
    }

}
