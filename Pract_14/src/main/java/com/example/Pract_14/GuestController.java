package com.example.Pract_14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {
    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping("/all")
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }

    @GetMapping("/add/{guestId}")
    public String addGuest(@PathVariable("guestId") Long guestId, Guest guest) {
        return guestService.addGuest(guestId, guest);
    }

    @GetMapping("/deleted/{guestId}")
    public String deleteGuest(@PathVariable("guestId") Long guestId) {
        return guestService.deleteGuest(guestId);
    }

    @GetMapping("/{guestId}")
    public Guest findGuestById(@PathVariable("guestId") Long guestId) {
        return guestService.findGuestById(guestId);
    }
}
