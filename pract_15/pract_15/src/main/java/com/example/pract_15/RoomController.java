package com.example.pract_15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public void addRoom(Room room) {
        roomService.addRoom(room);
    }

    @GetMapping("/{roomNumber}")
    public Room getRoom(@PathVariable("roomNumber") String roomNumber) {
        return roomService.getRoom(roomNumber);
    }

    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @DeleteMapping
    public void deleteByRoomNumber(String roomNumber) {
        roomService.deleteByRoomNumber(roomNumber);
    }
}
